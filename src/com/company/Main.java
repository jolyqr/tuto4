package com.company;

public class Main {

    public static void main(String[] args) {
        // test 1 : création d'un objet
        Personne object1=new Personne();
        object1.age=18;
        object1.demenage();

        // test 2 : héritage
        Enfant object2=new Enfant();
        object2.demenage();

        // test 3 : Polymorphisme
        Enfant object3=new Enfant();
        object3.demenage();

        // test 4 : Encapsulation
        //Enfant object4=new Enfant();
        //object4.ville="Versailles";
        //object4.demenagePas();

        // test 4 : Encapsulation
        Enfant object4=new Enfant();
        System.out.println("mon âge "+object4.age);
    }
}
