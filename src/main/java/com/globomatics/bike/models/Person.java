package com.globomatics.bike.models;

public class Person {

    private String emri;
    private String mbiemri;
    private int madhesia_e_karit;

    public Person(String emri, String mbiemri, int madhesia_e_karit) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.madhesia_e_karit = madhesia_e_karit;
    }


    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getMadhesia_e_karit() {
        return madhesia_e_karit;
    }

    public void setMadhesia_e_karit(int madhesia_e_karit) {
        this.madhesia_e_karit = madhesia_e_karit;
    }
}
