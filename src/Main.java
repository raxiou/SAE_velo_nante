import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bd_velo_nantes";
        String username = "root";
        String password = "Esteban3007";

        try {
            // Charger le pilote JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établir la connexion à la base de données
            Connection conn = DriverManager.getConnection(url, username, password);

            // Créer la requête SQL
            String query = "SELECT * FROM info";

            // Créer l'objet Statement
            Statement stmt = conn.createStatement();

            // Exécuter la requête SQL
            ResultSet rs = stmt.executeQuery(query);

            // Parcourir les résultats
            while (rs.next()) {
                // Récupérer les valeurs des colonnes
                int id = rs.getInt("idInfo");
                String nomInfo = rs.getString("nomInfo");

                // Faire quelque chose avec les données récupérées
                System.out.println("idInfo: " + id);
                System.out.println("Nom: " + nomInfo);
            }

            // Fermer les ressources
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
