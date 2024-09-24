package com.kodilla;

public class Notebook {

    int weight;
    int price;
    int year;

    Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        } else {
            System.out.println("The price is good");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("Urządzenie jest lekkie.");
        } else if (this.weight > 1500) {
            System.out.println("Bardzo ciężkie.");
        } else {
            System.out.println("Niezbyt ciężkie");
        }
    }

    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 500, 2018);
        System.out.println("Notebook weight:" + " " + notebook.weight);
        System.out.println("Notebook price" + " " + notebook.price);
        System.out.println("Notebook production year" + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();


        Notebook heavyNotebook = new Notebook(2000, 1500, 2022);
        System.out.println("heavyNotebook weight" + " " + heavyNotebook.weight);
        System.out.println("heavyNotebook price" + " " + heavyNotebook.price);
        System.out.println("heavyNotebook production year" + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1400, 700, 2020);
        System.out.println("oldNotebook weight" + " " + oldNotebook.weight);
        System.out.println("oldNotebook price" + " " + oldNotebook.price);
        System.out.println("oldNotebook production year" + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();

        if (notebook.year > 2022) {
            System.out.println("Laptop is high class");
        } else if (notebook.price < 2000) {
            System.out.println("Laptop is low class");
        } else if (notebook.price > 1500) {
            System.out.println("Laptop is medium class");
        } else {
            System.out.println("Laptop is very old ");
        }

    }
}



