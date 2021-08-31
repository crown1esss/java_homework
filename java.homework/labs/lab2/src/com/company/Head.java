package com.company;

public class Head {
    public String hairColor;
    public Head( String hairColor)
    {
        this.hairColor = hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public String getHairColor(String hairColor){
        return hairColor ;
    }

    @Override
    public String toString(){
            return "цвет волос  : " + hairColor;
    }
}
