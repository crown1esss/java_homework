package com.company;
        import  java.lang.String;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Human human = new Human("Коля " , 28 , "m", 80.5f , 180f ,  new Leg(45) ,
                new Hand(10 ),  new Head("Тёмный"));
        System.out.println(human);
        human.sayHello("как дела? ");

    }
}
