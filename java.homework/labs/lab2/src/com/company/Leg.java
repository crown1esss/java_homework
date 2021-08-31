package com.company;

public class Leg {
private int size;
public Leg ( int size)
{
    this.size=size;
}
public int getSize()
{
    return size;
}
public void setSize()
{
    this.size=size;
}
@Override
    public String toString()
{
    return  " размер ноги :" + size;
}
}
