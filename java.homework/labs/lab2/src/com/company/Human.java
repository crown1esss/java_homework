package com.company;

import javax.swing.*;

public class Human {
    private  String name;
    private  int age;
    private  float weight;
    private  float heigh;
    private  String  gender;
    private  Leg leftLeg;
    private  Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;
    private Head head;
    public Human( String name , int age ,  String gender , float weight , float heigh , Leg leg , Hand hand , Head head){
        this.name = name ;
        this.age = age;
        this.gender = gender ;
        this.weight = weight;
        this.heigh = heigh;
        this.leftHand = hand;
        this.rightHand = hand ;
        this.leftLeg = leg ;
        this.rightLeg = leg;
        this.head = head;
    }
    public void sayHello ( String message ){
        System.out.println("Привет , " + name + "    " + message );
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                "\nВозраст: " + age +
                "\nПол: " + gender+
                "\nВес: " + weight +
                "\nРост: " + heigh +
                "\n" + head +
                "\n" + leftLeg +
                "\n" + leftHand;
    }

}
