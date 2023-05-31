package modele;
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
     * return the nbVeloH00
     * @return a short nbVeloH00
     */
    public short getNbVeloH00() {
        return nbVeloH00;
    }

    
    public short getNbVeloH01() {
        return nbVeloH01;
    }

    public short getNbVeloH02() {
        return nbVeloH02;
    }

    public short getNbVeloH03() {
        return nbVeloH03;
    }

    public short getNbVeloH04() {
        return nbVeloH04;
    }

    public short getNbVeloH05() {
        return nbVeloH05;
    }

    public short getNbVeloH06() {
        return nbVeloH06;
    }

    public short getNbVeloH07() {
        return nbVeloH07;
    }

    public short getNbVeloH08() {
        return nbVeloH08;
    }

    public short getNbVeloH09() {
        return nbVeloH09;
    }

    public short getNbVeloH10() {
        return nbVeloH10;
    }

    public short getNbVeloH11() {
        return nbVeloH11;
    }

    public short getNbVeloH12() {
        return nbVeloH12;
    }

    public short getNbVeloH13() {
        return nbVeloH13;
    }

    public short getNbVeloH14() {
        return nbVeloH14;
    }

    public short getNbVeloH15() {
        return nbVeloH15;
    }

    public short getNbVeloH16() {
        return nbVeloH16;
    }

    public short getNbVeloH17() {
        return nbVeloH17;
    }

    public short getNbVeloH18() {
        return nbVeloH18;
    }

    public short getNbVeloH19() {
        return nbVeloH19;
    }

    public short getNbVeloH20() {
        return nbVeloH20;
    }

    public short getNbVeloH21() {
        return nbVeloH21;
    }

    public short getNbVeloH22() {
        return nbVeloH22;
    }

    public short getNbVeloH23() {
        return nbVeloH23;
    }

    public String getPresenceAnomalie() {
        return presenceAnomalie;
    }

    public Compteur getCompteur() {
        return compteur;
    }

    public Jour getJour() {
        return jour;
    }

    public void setNbVeloH00(short nbVeloH00) {
        if (nbVeloH00 < 0) {
            throw new IllegalArgumentException("nbVeloH00 must not be negative");
        }
        this.nbVeloH00 = nbVeloH00;
    }

    public void setNbVeloH01(short nbVeloH01) {
        if (nbVeloH01 < 0) {
            throw new IllegalArgumentException("nbVeloH01 must not be negative");
        }
        this.nbVeloH01 = nbVeloH01;
    }

    public void setNbVeloH02(short nbVeloH02) {
        if (nbVeloH02 < 0) {
            throw new IllegalArgumentException("nbVeloH02 must not be negative");
        }
        this.nbVeloH02 = nbVeloH02;
    }

    public void setNbVeloH03(short nbVeloH03) {
        if (nbVeloH03 < 0) {
            throw new IllegalArgumentException("nbVeloH03 must not be negative");
        }
        this.nbVeloH03 = nbVeloH03;
    }

    public void setNbVeloH04(short nbVeloH04) {
        if (nbVeloH04 < 0) {
            throw new IllegalArgumentException("nbVeloH04 must not be negative");
        }
        this.nbVeloH04 = nbVeloH04;
    }

    public void setNbVeloH05(short nbVeloH05) {
        if (nbVeloH05 < 0) {
            throw new IllegalArgumentException("nbVeloH05 must not be negative");
        }
        this.nbVeloH05 = nbVeloH05;
    }

    public void setNbVeloH06(short nbVeloH06) {
        if (nbVeloH06 < 0) {
            throw new IllegalArgumentException("nbVeloH06 must not be negative");
        }
        this.nbVeloH06 = nbVeloH06;
    }

    public void setNbVeloH07(short nbVeloH07) {
        if (nbVeloH07 < 0) {
            throw new IllegalArgumentException("nbVeloH07 must not be negative");
        }
        this.nbVeloH07 = nbVeloH07;
    }

    public void setNbVeloH08(short nbVeloH08) {
        if (nbVeloH08 < 0) {
            throw new IllegalArgumentException("nbVeloH08 must not be negative");
        }
        this.nbVeloH08 = nbVeloH08;
    }

    public void setNbVeloH09(short nbVeloH09) {
        if (nbVeloH09 < 0) {
            throw new IllegalArgumentException("nbVeloH09 must not be negative");
        }
        this.nbVeloH09 = nbVeloH09;
    }

    public void setNbVeloH10(short nbVeloH10) {
        if (nbVeloH10 < 0) {
            throw new IllegalArgumentException("nbVeloH10 must not be negative");
        }
        this.nbVeloH10 = nbVeloH10;
    }

    public void setNbVeloH11(short nbVeloH11) {
        if (nbVeloH11 < 0) {
            throw new IllegalArgumentException("nbVeloH11 must not be negative");
        }
        this.nbVeloH11 = nbVeloH11;
    }

    public void setNbVeloH12(short nbVeloH12) {
        if (nbVeloH12 < 0) {
            throw new IllegalArgumentException("nbVeloH12 must not be negative");
        }
        this.nbVeloH12 = nbVeloH12;
    }

    public void setNbVeloH13(short nbVeloH13) {
        if (nbVeloH13 < 0) {
            throw new IllegalArgumentException("nbVeloH13 must not be negative");
        }
        this.nbVeloH13 = nbVeloH13;
    }

    public void setNbVeloH14(short nbVeloH14) {
        if (nbVeloH14 < 0) {
            throw new IllegalArgumentException("nbVeloH14 must not be negative");
        }
        this.nbVeloH14 = nbVeloH14;
    }

    public void setNbVeloH15(short nbVeloH15) {
        if (nbVeloH15 < 0) {
            throw new IllegalArgumentException("nbVeloH15 must not be negative");
        }
        this.nbVeloH15 = nbVeloH15;
    }

    public void setNbVeloH16(short nbVeloH16) {
        if (nbVeloH16 < 0) {
            throw new IllegalArgumentException("nbVeloH16 must not be negative");
        }
        this.nbVeloH16 = nbVeloH16;
    }

    public void setNbVeloH17(short nbVeloH17) {
        if (nbVeloH17 < 0) {
            throw new IllegalArgumentException("nbVeloH17 must not be negative");
        }
        this.nbVeloH17 = nbVeloH17;
    }

    public void setNbVeloH18(short nbVeloH18) {
        if (nbVeloH18 < 0) {
            throw new IllegalArgumentException("nbVeloH18 must not be negative");
        }
        this.nbVeloH18 = nbVeloH18;
    }

    public void setNbVeloH19(short nbVeloH19) {
        if (nbVeloH19 < 0) {
            throw new IllegalArgumentException("nbVeloH19 must not be negative");
        }
        this.nbVeloH19 = nbVeloH19;
    }

    public void setNbVeloH20(short nbVeloH20) {
        if (nbVeloH20 < 0) {
            throw new IllegalArgumentException("nbVeloH20 must not be negative");
        }
        this.nbVeloH20 = nbVeloH20;
    }

    public void setNbVeloH21(short nbVeloH21) {
        if (nbVeloH21 < 0) {
            throw new IllegalArgumentException("nbVeloH21 must not be negative");
        }
        this.nbVeloH21 = nbVeloH21;
    }

    public void setNbVeloH22(short nbVeloH22) {
        if (nbVeloH22 < 0) {
            throw new IllegalArgumentException("nbVeloH22 must not be negative");
        }
        this.nbVeloH22 = nbVeloH22;
    }

    public void setNbVeloH23(short nbVeloH23) {
        if (nbVeloH23 < 0) {
            throw new IllegalArgumentException("nbVeloH23 must not be negative");
        }
        this.nbVeloH23 = nbVeloH23;
    }

    public void setpresenceAnomalie (String presenceAnomalie) {
        this.presenceAnomalie = presenceAnomalie;
    }

    public void setCompteur(Compteur compteur) {
        this.compteur = compteur;
    }

    public void setJour(Jour jour) {
        this.jour = jour;
    }

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
