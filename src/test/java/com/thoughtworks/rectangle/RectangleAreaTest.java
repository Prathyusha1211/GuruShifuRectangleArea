package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleAreaTest {
    @Test
    public void rectangleArea(){
        RectangleArea obj = new RectangleArea();
        int ActualArea = obj.areaOfRectangle(3,4);
        assertEquals(12, ActualArea);
    }

}
