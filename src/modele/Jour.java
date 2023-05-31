package modele;

import modele.enumeration.*;

public class Jour{
    private String date;
    private double temperatureMoyenne;
    private EnumJour jour;
    private EnumVacances vacance;

    /**
     * Constructor of the class Jour
     * @param date a string representing the date
     * @param numeroJour a positive integer representing the day of the week
     * @param temp a double representing the average temperature of the day
     * @param vacance a string representing if the day is a holiday
     * @throws IllegalArgumentException if the parameters are not valid
     */
    public Jour(String date, int numeroJour, double temp, String vacance) throws IllegalArgumentException{
        if((date != null) && (numeroJour <= 7) && (numeroJour > 0)){
            this.date = date;
            this.temperatureMoyenne = temp;
            if(numeroJour == 1){
                this.jour = EnumJour.Lundi;
            } else if(numeroJour == 2){
                this.jour = EnumJour.Mardi;
            } else if(numeroJour == 3){
                this.jour = EnumJour.Mercredi;
            } else if(numeroJour == 4){
                this.jour = EnumJour.Jeudi;
            } else if(numeroJour == 5){
                this.jour = EnumJour.Vendredi;
            } else if(numeroJour == 6){
                this.jour = EnumJour.Samedi;
            } else if(numeroJour == 7){
                this.jour = EnumJour.Dimanche;
            }
            if((vacance.compareTo("Noel")) == 0){
                this.vacance = EnumVacances.Noel;
            } else if((vacance.compareTo("Ascension")) == 0){
                this.vacance = EnumVacances.Ascension;
            } else if(vacance.compareTo("Hiver") == 0){
                this.vacance = EnumVacances.Hiver;
            } else if(vacance.compareTo("Ete") == 0){
                this.vacance = EnumVacances.Ete;
            } else if(vacance.compareTo("Toussaint") == 0){
                this.vacance = EnumVacances.Toussaint;
            } else if(vacance.compareTo("Printemps") == 0){
                this.vacance = EnumVacances.Printemps;
            } else if(vacance == null){
                this.vacance = null;
            }
        } else {
            throw new IllegalArgumentException("Les arguments du constructeurs sont nuls");
        }

    }
    
    public String getDate(){
        return this.date;
    }

    public double temperatureMoyenne(){
        return this.temperatureMoyenne;
    }

    public EnumJour getJour(){
        return this.jour;
    }

    public EnumVacances getVacance(){
        return this.vacance;
    }

    @Override
    public String toString(){
        return "Date : " + this.date + " Jour : " + this.jour + " Température moyenne : " + this.temperatureMoyenne + " Vacance : " + this.vacance;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Jour){
            Jour j = (Jour) o;
            return (this.date.compareTo(j.getDate()) == 0) && (this.jour == j.getJour()) && (this.temperatureMoyenne == j.temperatureMoyenne()) && (this.vacance == j.getVacance());
        } else {
            return false;
        }
    }

    public void setDate(String date){
        if(date != null){
            this.date = date;
        } else {
            throw new IllegalArgumentException("La date est nulle");
        }
    }

    public void setTemperatureMoyenne(double temp){
        this.temperatureMoyenne = temp;
    }

    public void setJour(int numeroJour){
        if((numeroJour <= 7) && (numeroJour > 0)){
            if(numeroJour == 1){
                this.jour = EnumJour.Lundi;
            } else if(numeroJour == 2){
                this.jour = EnumJour.Mardi;
            } else if(numeroJour == 3){
                this.jour = EnumJour.Mercredi;
            } else if(numeroJour == 4){
                this.jour = EnumJour.Jeudi;
            } else if(numeroJour == 5){
                this.jour = EnumJour.Vendredi;
            } else if(numeroJour == 6){
                this.jour = EnumJour.Samedi;
            } else if(numeroJour == 7){
                this.jour = EnumJour.Dimanche;
            }
        } else {
            throw new IllegalArgumentException("Le numéro du jour est invalide");
        }
    }

    public void setVacance(String vacance){
        if((vacance.compareTo("Noel")) == 0){
            this.vacance = EnumVacances.Noel;
        } else if((vacance.compareTo("Ascension")) == 0){
            this.vacance = EnumVacances.Ascension;
        } else if(vacance.compareTo("Hiver") == 0){
            this.vacance = EnumVacances.Hiver;
        } else if(vacance.compareTo("Ete") == 0){
            this.vacance = EnumVacances.Ete;
        } else if(vacance.compareTo("Toussaint") == 0){
            this.vacance = EnumVacances.Toussaint;
        } else if(vacance.compareTo("Printemps") == 0){
            this.vacance = EnumVacances.Printemps;
        } else if(vacance == null){
            this.vacance = null;
        } else {
            throw new IllegalArgumentException("La vacance est invalide");
        }
    }
}
