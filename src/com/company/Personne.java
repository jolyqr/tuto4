package com.company;

public class Personne {
    public int age=999;
    private String ville="Paris";
    public String sexe="male";
    public String nom="Paul";

    public void demenage(){
        System.out.println("Personne déménage");
    }

    private void demenagePas(){
        System.out.println("Personne ne déménage pas");
    }
}
