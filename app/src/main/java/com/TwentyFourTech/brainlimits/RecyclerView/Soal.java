package com.TwentyFourTech.brainlimits.RecyclerView;

public class Soal {

    private String Tipe;
    private String SoalBro;
    private String KuncijawabA;
    private String KuncijawabB;
    private String KuncijawabC;
    private String KuncijawabD;
    private int Photo;


    public Soal(String tipe, String soalBro, String kuncijawabA, String kuncijawabB, String kuncijawabC, String kuncijawabD, int photo) {
        Tipe = tipe;
        SoalBro = soalBro;
        KuncijawabA = kuncijawabA;
        KuncijawabB = kuncijawabB;
        KuncijawabC = kuncijawabC;
        KuncijawabD = kuncijawabD;
        Photo = photo;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String tipe) {
        Tipe = tipe;
    }

    public String getSoalBro() {
        return SoalBro;
    }

    public void setSoalBro(String soalBro) {
        SoalBro = soalBro;
    }

    public String getKuncijawabA() {
        return KuncijawabA;
    }

    public void setKuncijawabA(String kuncijawabA) {
        KuncijawabA = kuncijawabA;
    }

    public String getKuncijawabB() {
        return KuncijawabB;
    }

    public void setKuncijawabB(String kuncijawabB) {
        KuncijawabB = kuncijawabB;
    }

    public String getKuncijawabC() {
        return KuncijawabC;
    }

    public void setKuncijawabC(String kuncijawabC) {
        KuncijawabC = kuncijawabC;
    }

    public String getKuncijawabD() {
        return KuncijawabD;
    }

    public void setKuncijawabD(String kuncijawabD) {
        KuncijawabD = kuncijawabD;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
