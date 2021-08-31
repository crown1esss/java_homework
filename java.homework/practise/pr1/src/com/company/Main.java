package com.company ;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book classic = new Book ("Максим Горький" , " На дне");
        Book fantasy = new Book ("Ден Браун " , "Происхождение");
        Book historic = new Book ("Морис Дрююн" , "Железный король");
        Book scientific = new Book("Стивен Хокинг" , "краткие ответы на большие вопросы");
        Book educational = new Book("Джереми Кларксон" , "Могло быть и хуже");
        System.out.println(" классичесская литература - " + classic);
        System.out.println(" Фантастика - " + fantasy);
        System.out.println(" историческая литература - " + historic);
        System.out.println(" научная литература - " + scientific);
        System.out.println(" познавательная литература - " + educational);
    }
}