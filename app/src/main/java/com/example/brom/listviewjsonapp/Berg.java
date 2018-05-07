package com.example.brom.listviewjsonapp;

/**
 * Created by a17amama on 2018-05-07.
 */

public class Berg {

    private String name;
    private String location;
    private int height;

    public Berg (String inName,String inLocation, int inHeight) {
        name=inName;
        location=inLocation;
        height=inHeight;
    }


    public String toString() {return name;}

    public String info() {
        String str=name;
        str+=" is located in ";
        str+=location;
        str+=" and has an height of ";
        str+=Integer.toString(height);
        str+="m.";
        return str;
    }

    public void setHeight(int newHeight) {
        height=newHeight;
    }

    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }

    public int getHeight(){
        return height;
    }
}


