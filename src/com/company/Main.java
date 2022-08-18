package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sheep[] sheep = new Sheep[3];
        sheep[0] = new Sheep(20, 3, "M", "Dolli");
        sheep[1] = new Sheep(15, 2, "F", "Mari");
        sheep[2] =  new Sheep(10, 1, "M", "Sofi");

        Cow[] cows = new Cow[5];
        cows[0] = new Cow(56, 2, "M", "Marik");
        cows[1] = new Cow(85, 3, "F", "Bella");
        cows[2] = new Cow(73, 3, "M", "Dani");
        cows[3] = new Cow(65, 2, "F", "Mari");
        cows[4] = new Cow(120, 4, "M", "Toddi");

        Horse[] horses = new Horse[2];
        horses[0] = new Horse(56, 6,"M", "Krasa", "Red");
        horses[1] = new Horse(45, 5, "F", "Laim", "Yellow");



        Farm farm = new Farm("Bishkek", cows, horses, sheep, "Munar" );
        System.out.println(farm);




        Sheep[] sheep1 = new Sheep[1];
        sheep1[0] = new Sheep(20, 3, "M", "Dolli");


        Cow[] cows1 = new Cow[1];
        cows1[0] = new Cow(56, 2, "M", "Marik");


        Horse[] horses1 = new Horse[1];
        horses1[0] = new Horse(56, 6,"M", "Krasa", "Red");




        Farm farm1 = new Farm("Batken", cows1, horses1, sheep1, "Munarbek" );
        System.out.println(farm1);





        }
    }

