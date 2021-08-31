package com.company;

public class MovableCircle extends  MovablePoint {
    int radius;
    public void MovableCircle(int x , int y  , int xSpped , int ySpped){
        this.x = x ;
        this.y = y ;
        this.xSpeed = xSpped;
        this.y = ySpped;
    }

    @Override
    public java.lang.String toString() {
        return super.toString();
    }
}