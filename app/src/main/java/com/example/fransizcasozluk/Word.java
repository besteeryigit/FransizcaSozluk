package com.example.fransizcasozluk;

public class Word {

    private String fransizca;
    private String turkce;
    private int resimId;
    private int sesId;

    public Word(String fransizca, String turkce, int resimId, int sesId) {
        this.fransizca = fransizca;
        this.turkce = turkce;
        this.resimId = resimId;
        this.sesId = sesId;
    }

    public Word() {

    }

    public String getFransizca() {
        return fransizca;
    }

    public void setFransizca(String fransizca) {
        this.fransizca = fransizca;
    }

    public String getTurkce() {
        return turkce;
    }

    public void setTurkce(String turkce) {
        this.turkce = turkce;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }

    public int getSesId() {
        return sesId;
    }

    public void setSesId(int sesId) {
        this.sesId = sesId;
    }
}
