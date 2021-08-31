package com.company;
import java.lang.String;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author user1 = new Author("Alex" , "@edu.mirea" , 'm' );
        user1.setEmail("@edu.mirea");
        System.out.println(user1);
    }
}