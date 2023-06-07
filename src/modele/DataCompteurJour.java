package modele;
/**
 * DataCompteurJour is a class representing the data of a compteur for each day
 */
public class DataCompteurJour {
    private short nbVeloH00;
    private short nbVeloH01;
    private short nbVeloH02;
    private short nbVeloH03;
    private short nbVeloH04;
    private short nbVeloH05;
    private short nbVeloH06;
    private short nbVeloH07;
    private short nbVeloH08;
    private short nbVeloH09;
    private short nbVeloH10;
    private short nbVeloH11;
    private short nbVeloH12;
    private short nbVeloH13;
    private short nbVeloH14;
    private short nbVeloH15;
    private short nbVeloH16;
    private short nbVeloH17;
    private short nbVeloH18;
    private short nbVeloH19;
    private short nbVeloH20;
    private short nbVeloH21;
    private short nbVeloH22;
    private short nbVeloH23;
    private String presenceAnomalie;
    Compteur compteur;
    Jour jour;

    /**
     * the constructor of DataCompteurJour, check the validity of the parameters
     * initialize the nbVeloH00 to nbVeloH23 to 0 and the presenceAnomalie to "non"
     * @param leCompteur a compteur representing the compteur
     * @param leJour a jour representing the day
     */
    public DataCompteurJour(Compteur leCompteur, Jour leJour){
        if (leCompteur == null) {
            throw new IllegalArgumentException("leCompteur must not be null");
        }
        if (leJour == null) {
            throw new IllegalArgumentException("leJour must not be null");
        }
        this.nbVeloH00 = 0;
        this.nbVeloH01 = 0;
        this.nbVeloH02 = 0;
        this.nbVeloH03 = 0;
        this.nbVeloH04 = 0;
        this.nbVeloH05 = 0;
        this.nbVeloH06 = 0;
        this.nbVeloH07 = 0;
        this.nbVeloH08 = 0;
        this.nbVeloH09 = 0;
        this.nbVeloH10 = 0;
        this.nbVeloH11 = 0;
        this.nbVeloH12 = 0;
        this.nbVeloH13 = 0;
        this.nbVeloH14 = 0;
        this.nbVeloH15 = 0;
        this.nbVeloH16 = 0;
        this.nbVeloH17 = 0;
        this.nbVeloH18 = 0;
        this.nbVeloH19 = 0;
        this.nbVeloH20 = 0;
        this.nbVeloH21 = 0;
        this.nbVeloH22 = 0;
        this.nbVeloH23 = 0;
        this.presenceAnomalie = "non";
        this.compteur = leCompteur;
        this.jour = leJour;
    }

    /**
     * return the nbVeloH00 who is the number of passage at 00h
     * @return a short nbVeloH00
     */
    public short getNbVeloH00() {
        return nbVeloH00;
    }

    /**
     * return the nbVeloH01 who is the number of passage at 01h
     * @return a short nbVeloH01
     */
    public short getNbVeloH01() {
        return nbVeloH01;
    }

    /**
     * return the nbVeloH02 who is the number of passage at 02h
     * @return a short nbVeloH02
     */
    public short getNbVeloH02() {
        return nbVeloH02;
    }

    /**
     * return the nbVeloH03 who is the number of passage at 03h
     * @return a short nbVeloH03
     */
    public short getNbVeloH03() {
        return nbVeloH03;
    }

    /**
     * return the nbVeloH04 who is the number of passage at 04h
     * @return a short nbVeloH04
     */
    public short getNbVeloH04() {
        return nbVeloH04;
    }

    /**
     * return the nbVeloH05 who is the number of passage at 05h
     * @return a short nbVeloH05
     */
    public short getNbVeloH05() {
        return nbVeloH05;
    }

    /**
     * return the nbVeloH06 who is the number of passage at 06h
     * @return a short nbVeloH06
     */
    public short getNbVeloH06() {
        return nbVeloH06;
    }

    /**
     * return the nbVeloH07 who is the number of passage at 07h
     * @return a short nbVeloH07
     */
    public short getNbVeloH07() {
        return nbVeloH07;
    }

    /**
     * return the nbVeloH08 who is the number of passage at 08h
     * @return a short nbVeloH08
     */
    public short getNbVeloH08() {
        return nbVeloH08;
    }

    /**
     * return the nbVeloH09 who is the number of passage at 09h
     * @return a short nbVeloH09
     */
    public short getNbVeloH09() {
        return nbVeloH09;
    }

    /**
     * return the nbVeloH10 who is the number of passage at 10h
     * @return a short nbVeloH10
     */
    public short getNbVeloH10() {
        return nbVeloH10;
    }

    /**
     * return the nbVeloH11 who is the number of passage at 11h
     * @return a short nbVeloH11
     */
    public short getNbVeloH11() {
        return nbVeloH11;
    }

    /**
     * return the nbVeloH12 who is the number of passage at 12h
     * @return a short nbVeloH12
     */
    public short getNbVeloH12() {
        return nbVeloH12;
    }

    /**
     * return the nbVeloH13 who is the number of passage at 13h
     * @return a short nbVeloH13
     */
    public short getNbVeloH13() {
        return nbVeloH13;
    }

    /**
     * return the nbVeloH14 who is the number of passage at 14h
     * @return a short nbVeloH14
     */
    public short getNbVeloH14() {
        return nbVeloH14;
    }

    /**
     * return the nbVeloH15 who is the number of passage at 15h
     * @return a short nbVeloH15
     */
    public short getNbVeloH15() {
        return nbVeloH15;
    }

    /**
     * return the nbVeloH16 who is the number of passage at 16h
     * @return a short nbVeloH16
     */
    public short getNbVeloH16() {
        return nbVeloH16;
    }

    /**
     * return the nbVeloH17 who is the number of passage at 17h
     * @return a short nbVeloH17
     */
    public short getNbVeloH17() {
        return nbVeloH17;
    }

    /**
     * return the nbVeloH18 who is the number of passage at 18h
     * @return a short nbVeloH18
     */
    public short getNbVeloH18() {
        return nbVeloH18;
    }

    /**
     * return the nbVeloH19 who is the number of passage at 19h
     * @return a short nbVeloH19
     */
    public short getNbVeloH19() {
        return nbVeloH19;
    }

    /**
     * return the nbVeloH20 who is the number of passage at 20h
     * @return a short nbVeloH20
     */
    public short getNbVeloH20() {
        return nbVeloH20;
    }

    /**
     * return the nbVeloH21 who is the number of passage at 21h
     * @return a short nbVeloH21
     */
    public short getNbVeloH21() {
        return nbVeloH21;
    }

    /**
     * return the nbVeloH22 who is the number of passage at 22h
     * @return a short nbVeloH22
     */
    public short getNbVeloH22() {
        return nbVeloH22;
    }

    /**
     * return the nbVeloH23 who is the number of passage at 23h
     * @return a short nbVeloH23
     */
    public short getNbVeloH23() {
        return nbVeloH23;
    }

    /**
     * return the presenceAnomalie who is the presence of an anomaly
     * @return a String presenceAnomalie
     */
    public String getPresenceAnomalie() {
        return presenceAnomalie;
    }

    /**
     * return the compteur
     * @return a Compteur compteur
     */
    public Compteur getCompteur() {
        return compteur;
    }

    /**
     * return the jour
     * @return a Jour jour
     */
    public Jour getJour() {
        return jour;
    }

    /**
     * set the nbVeloH00 to nbVeloH00
     * @param nbVeloH00 a short representing the number of passage at 00h
     * @throws IllegalArgumentException if nbVeloH00 is negative
     */
    public void setNbVeloH00(short nbVeloH00) {
        if (nbVeloH00 < 0) {
            throw new IllegalArgumentException("nbVeloH00 must not be negative");
        }
        this.nbVeloH00 = nbVeloH00;
    }

    /**
     * set the nbVeloH01 to nbVeloH01
     * @param nbVeloH01 a short representing the number of passage at 01h
     * @throws IllegalArgumentException if nbVeloH01 is negative
     */
    public void setNbVeloH01(short nbVeloH01) {
        if (nbVeloH01 < 0) {
            throw new IllegalArgumentException("nbVeloH01 must not be negative");
        }
        this.nbVeloH01 = nbVeloH01;
    }

    /**
     * set the nbVeloH02 to nbVeloH02
     * @param nbVeloH02 a short representing the number of passage at 02h
     * @throws IllegalArgumentException if nbVeloH02 is negative
     */
    public void setNbVeloH02(short nbVeloH02) {
        if (nbVeloH02 < 0) {
            throw new IllegalArgumentException("nbVeloH02 must not be negative");
        }
        this.nbVeloH02 = nbVeloH02;
    }

    /**
     * set the nbVeloH03 to nbVeloH03
     * @param nbVeloH03 a short representing the number of passage at 03h
     * @throws IllegalArgumentException if nbVeloH03 is negative
     */
    public void setNbVeloH03(short nbVeloH03) {
        if (nbVeloH03 < 0) {
            throw new IllegalArgumentException("nbVeloH03 must not be negative");
        }
        this.nbVeloH03 = nbVeloH03;
    }

    /**
     * set the nbVeloH04 to nbVeloH04
     * @param nbVeloH04 a short representing the number of passage at 04h
     * @throws IllegalArgumentException if nbVeloH04 is negative
     */
     */
    public void setNbVeloH04(short nbVeloH04) {
        if (nbVeloH04 < 0) {
            throw new IllegalArgumentException("nbVeloH04 must not be negative");
        }
        this.nbVeloH04 = nbVeloH04;
    }

    /**
     * set the nbVeloH05 to nbVeloH05
     * @param nbVeloH05 a short representing the number of passage at 05h
     * @throws IllegalArgumentException if nbVeloH05 is negative
     */
    public void setNbVeloH05(short nbVeloH05) {
        if (nbVeloH05 < 0) {
            throw new IllegalArgumentException("nbVeloH05 must not be negative");
        }
        this.nbVeloH05 = nbVeloH05;
    }

    /**
     * set the nbVeloH06 to nbVeloH06
     * @param nbVeloH06 a short representing the number of passage at 06h
     * @throws IllegalArgumentException if nbVeloH06 is negative
     */
     */
    public void setNbVeloH06(short nbVeloH06) {
        if (nbVeloH06 < 0) {
            throw new IllegalArgumentException("nbVeloH06 must not be negative");
        }
        this.nbVeloH06 = nbVeloH06;
    }

    /**
     * set the nbVeloH07 to nbVeloH07
     * @param nbVeloH07 a short representing the number of passage at 07h
     * @throws IllegalArgumentException if nbVeloH07 is negative
     */
     */
    public void setNbVeloH07(short nbVeloH07) {
        if (nbVeloH07 < 0) {
            throw new IllegalArgumentException("nbVeloH07 must not be negative");
        }
        this.nbVeloH07 = nbVeloH07;
    }

    /**
     * set the nbVeloH08 to nbVeloH08
     * @param nbVeloH08 a short representing the number of passage at 08h
     * @throws IllegalArgumentException if nbVeloH08 is negative
     */
    public void setNbVeloH08(short nbVeloH08) {
        if (nbVeloH08 < 0) {
            throw new IllegalArgumentException("nbVeloH08 must not be negative");
        }
        this.nbVeloH08 = nbVeloH08;
    }

    /**
     * set the nbVeloH09 to nbVeloH09
     * @param nbVeloH09 a short representing the number of passage at 09h
     * @throws IllegalArgumentException if nbVeloH09 is negative
     */
    public void setNbVeloH09(short nbVeloH09) {
        if (nbVeloH09 < 0) {
            throw new IllegalArgumentException("nbVeloH09 must not be negative");
        }
        this.nbVeloH09 = nbVeloH09;
    }

    /**
     * set the nbVeloH10 to nbVeloH10
     * @param nbVeloH10 a short representing the number of passage at 10h
     * @throws IllegalArgumentException if nbVeloH10 is negative
     */
    public void setNbVeloH10(short nbVeloH10) {
        if (nbVeloH10 < 0) {
            throw new IllegalArgumentException("nbVeloH10 must not be negative");
        }
        this.nbVeloH10 = nbVeloH10;
    }

    /**
     * set the nbVeloH11 to nbVeloH11
     * @param nbVeloH11 a short representing the number of passage at 11h
     * @throws IllegalArgumentException if nbVeloH11 is negative
     */
    public void setNbVeloH11(short nbVeloH11) {
        if (nbVeloH11 < 0) {
            throw new IllegalArgumentException("nbVeloH11 must not be negative");
        }
        this.nbVeloH11 = nbVeloH11;
    }

    /**
     * set the nbVeloH12 to nbVeloH12
     * @param nbVeloH12 a short representing the number of passage at 12h
     * @throws IllegalArgumentException if nbVeloH12 is negative
     */
    public void setNbVeloH12(short nbVeloH12) {
        if (nbVeloH12 < 0) {
            throw new IllegalArgumentException("nbVeloH12 must not be negative");
        }
        this.nbVeloH12 = nbVeloH12;
    }

    /**
     * set the nbVeloH13 to nbVeloH13
     * @param nbVeloH13 a short representing the number of passage at 13h
     * @throws IllegalArgumentException if nbVeloH13 is negative
     */
    public void setNbVeloH13(short nbVeloH13) {
        if (nbVeloH13 < 0) {
            throw new IllegalArgumentException("nbVeloH13 must not be negative");
        }
        this.nbVeloH13 = nbVeloH13;
    }

    /**
     * set the nbVeloH14 to nbVeloH14
     * @param nbVeloH14 a short representing the number of passage at 14h
     * @throws IllegalArgumentException if nbVeloH14 is negative
     */
    public void setNbVeloH14(short nbVeloH14) {
        if (nbVeloH14 < 0) {
            throw new IllegalArgumentException("nbVeloH14 must not be negative");
        }
        this.nbVeloH14 = nbVeloH14;
    }

    /**
     * set the nbVeloH15 to nbVeloH15
     * @param nbVeloH15 a short representing the number of passage at 15h
     * @throws IllegalArgumentException if nbVeloH15 is negative
     */
    public void setNbVeloH15(short nbVeloH15) {
        if (nbVeloH15 < 0) {
            throw new IllegalArgumentException("nbVeloH15 must not be negative");
        }
        this.nbVeloH15 = nbVeloH15;
    }

    /**
     * set the nbVeloH16 to nbVeloH16
     * @param nbVeloH16 a short representing the number of passage at 16h
     * @throws IllegalArgumentException if nbVeloH16 is negative
     */
    public void setNbVeloH16(short nbVeloH16) {
        if (nbVeloH16 < 0) {
            throw new IllegalArgumentException("nbVeloH16 must not be negative");
        }
        this.nbVeloH16 = nbVeloH16;
    }

    /**
     * set the nbVeloH17 to nbVeloH17
     * @param nbVeloH17 a short representing the number of passage at 17h
     * @throws IllegalArgumentException if nbVeloH17 is negative
     */
    public void setNbVeloH17(short nbVeloH17) {
        if (nbVeloH17 < 0) {
            throw new IllegalArgumentException("nbVeloH17 must not be negative");
        }
        this.nbVeloH17 = nbVeloH17;
    }

    /**
     * set the nbVeloH18 to nbVeloH18
     * @param nbVeloH18 a short representing the number of passage at 18h
     * @throws IllegalArgumentException if nbVeloH18 is negative
     */
    public void setNbVeloH18(short nbVeloH18) {
        if (nbVeloH18 < 0) {
            throw new IllegalArgumentException("nbVeloH18 must not be negative");
        }
        this.nbVeloH18 = nbVeloH18;
    }

    /**
     * set the nbVeloH19 to nbVeloH19
     * @param nbVeloH19 a short representing the number of passage at 19h
     * @throws IllegalArgumentException if nbVeloH19 is negative
     */
    public void setNbVeloH19(short nbVeloH19) {
        if (nbVeloH19 < 0) {
            throw new IllegalArgumentException("nbVeloH19 must not be negative");
        }
        this.nbVeloH19 = nbVeloH19;
    }
    
    /**
     * set the nbVeloH20 to nbVeloH20
     * @param nbVeloH20 a short representing the number of passage at 20h
     * @throws IllegalArgumentException if nbVeloH20 is negative
     */
    public void setNbVeloH20(short nbVeloH20) {
        if (nbVeloH20 < 0) {
            throw new IllegalArgumentException("nbVeloH20 must not be negative");
        }
        this.nbVeloH20 = nbVeloH20;
    }

    /**
     * set the nbVeloH21 to nbVeloH21
     * @param nbVeloH21 a short representing the number of passage at 21h
     * @throws IllegalArgumentException if nbVeloH21 is negative
     */
    public void setNbVeloH21(short nbVeloH21) {
        if (nbVeloH21 < 0) {
            throw new IllegalArgumentException("nbVeloH21 must not be negative");
        }
        this.nbVeloH21 = nbVeloH21;
    }

    /**
     * set the nbVeloH22 to nbVeloH22
     * @param nbVeloH22 a short representing the number of passage at 22h
     * @throws IllegalArgumentException if nbVeloH22 is negative
     */
    public void setNbVeloH22(short nbVeloH22) {
        if (nbVeloH22 < 0) {
            throw new IllegalArgumentException("nbVeloH22 must not be negative");
        }
        this.nbVeloH22 = nbVeloH22;
    }

    /**
     * set the nbVeloH23 to nbVeloH23
     * @param nbVeloH23 a short representing the number of passage at 23h
     * @throws IllegalArgumentException if nbVeloH23 is negative
     */
    public void setNbVeloH23(short nbVeloH23) {
        if (nbVeloH23 < 0) {
            throw new IllegalArgumentException("nbVeloH23 must not be negative");
        }
        this.nbVeloH23 = nbVeloH23;
    }

    /**
     * set the presenceAnomalie to presenceAnomalie
     * @param presenceAnomalie a String representing the presence of an anomaly
     */
    public void setpresenceAnomalie (String presenceAnomalie) {
        this.presenceAnomalie = presenceAnomalie;
    }

    /**
     * set the compteur to compteur
     * @param compteur a Compteur representing the compteur
     */
    public void setCompteur(Compteur compteur) {
        this.compteur = compteur;
    }

    /**
     * set the jour to jour
     * @param jour a Jour representing the day
     */
    public void setJour(Jour jour) {
        this.jour = jour;
    }

    /**
     * return the total of passage for the day adding all the nbVeloH00 to nbVeloH23
     * @return a short representing the total of passage for the day
     */
    public short totalPassage(){
        short total = 0;
        total += this.nbVeloH00;
        total += this.nbVeloH01;
        total += this.nbVeloH02;
        total += this.nbVeloH03;
        total += this.nbVeloH04;
        total += this.nbVeloH05;
        total += this.nbVeloH06;
        total += this.nbVeloH07;
        total += this.nbVeloH08;
        total += this.nbVeloH09;
        total += this.nbVeloH10;
        total += this.nbVeloH11;
        total += this.nbVeloH12;
        total += this.nbVeloH13;
        total += this.nbVeloH14;
        total += this.nbVeloH15;
        total += this.nbVeloH16;
        total += this.nbVeloH17;
        total += this.nbVeloH18;
        total += this.nbVeloH19;
        total += this.nbVeloH20;
        total += this.nbVeloH21;
        total += this.nbVeloH22;
        total += this.nbVeloH23;
        return total;
    }


}
