package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void rectangleArea(){
        Rectangle obj = new Rectangle();
        int ActualArea = obj.areaOfRectangle(3,4);
        assertEquals(12, ActualArea);
    }

}
