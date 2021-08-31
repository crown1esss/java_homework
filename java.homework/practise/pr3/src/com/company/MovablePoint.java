package com.company;
public class MovablePoint  implements movable {
    int x ;
    int y ;
    int xSpeed;
    int ySpeed;
    public void MovablePoint( int x , int y  , int xSpeed , int ySpeed){
        this.x = x ;
        this.y = y ;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public java.lang.String toString() {
        return super.toString();
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}