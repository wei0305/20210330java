package com.wei.mail;

public class Box3 extends Box {
    public Box3(){
        length = 10;
        width = 10;
        height = 10;

        }

    //command+N
    @Override
    public String getGame() {
        return "Box 3";
    }

    @Override
    public int getPrice() {
        return 60;
    }


}
