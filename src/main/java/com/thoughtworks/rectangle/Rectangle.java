package com.thoughtworks.rectangle;

public class Rectangle{

    int areaOfRectangle(int length, int breadth){
        if(length<0 || breadth<0){
            throw new IllegalArgumentException("Lenght and Breadth must be positive");
        }
        return length*breadth;
    }

}