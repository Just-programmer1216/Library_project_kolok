package com.example.Library_app.model;

import jakarta.persistence.*;
@Entity
public class Produkty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;
    private double cena;
    private String kategoria;
    private int ilosc;
    private String dostepnosc;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKategoria() {return kategoria;}
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getIlosc() {
        return ilosc;
    }
    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public String getDostepnosc() {return dostepnosc;}
    public void setDostepnoscs(String dostepnosc) {
        this.dostepnosc = dostepnosc;
    }


}