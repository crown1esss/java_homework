package com.company;

public class Hand {
    public int number;
    public Hand ( int number)
    {
        this.number = number;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    public int getNumber()
    {
        return number;
    }
    @Override
    public String toString(){
        return  " количество пальцев :" + number;
    }

}
