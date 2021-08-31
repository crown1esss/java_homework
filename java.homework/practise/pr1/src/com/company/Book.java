package com.company;
import java.lang.*;
public class Book {
    private String writer;
    private String name ;
    public Book( String writer_1 ,String name_1){
        writer=writer_1;
        name=name_1;
    }
    /*public void setWriter ( String writer){
    this.writer=writer;
    }
    public void setName ( String name){
    this.name=name;
    }
    */
    public String getWriter(String writer)
    {
        return writer;
    }
    public String getName ( String name){
        return name;
    }
    @Override
    public String toString() {
        return " писатель - " + this.writer + " , название - " + this.name;
    }

}