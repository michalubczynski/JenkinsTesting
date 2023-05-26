package com.example.autentykacja;

public class Cytat {
    private String autor;
    private String tresc;

    public Cytat(String autor, String tresc) {
        this.autor = autor;
        this.tresc = tresc;
    }

    public Cytat() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
