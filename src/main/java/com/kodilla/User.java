package com.kodilla;

public class User {

        String name;
        int age;

        User(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public String getName(String name) {
                return name;
        }

        public int getAge(int age) {
                return age;
        }

    public static void main;(String[] args) {

        String[] user =new String[5];
        User michael= new User("Michael",30);
        user david = new User("Dawid",29);
        User anna= new User("Anna",32);
        User camilla= new User("Camilla", 32);
        User frank= new User("Frank", 27);

        String[]user={michael,david,anna,camilla,frank };
        int[]age =new int[] {30,29,32,32,27};


        int numberofUsers= user.length;

        System.out.println(numberofUsers);

        int result = 0;
        for (int i = 0; i < age.length; i++) {
            result = age[i] + result;
        }
        System.out.println();
        System.out.println("Wynik sumowania: " + result);

        double avg = (double) result /5;

        System.out.println("Srednia arytmetyczna: " + avg);


        for(int i=0;user.length;i++){
            if(age<double avg ){
                System.out.println(user[i]);
            }


        }
    }




}


