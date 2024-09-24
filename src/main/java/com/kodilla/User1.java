package com.kodilla;

String name;
double age;
double height;

public User1(String name, double age, double height) {
    this.name = name;
    this.age = age;
    this.height = height;
}
public void checkUser1Age(){
    if (age> 30) {
        System.out.println("User1 is older than 30.);
    }else{
        System.out.println("User1 is younger than 30.);
    }
}
public void checkUser1height(){
    if(height>160){
        System.out.println("User1 is taller than 160.);
    }else{
        System.out.println("User1 is shorter than 30.);
    }
}
        }



public static void main(String[] args) {

    User1 user = new User1("Adam", 40.5, 178);

    user.checkUser1Age();
    user.checkUser1height();
}