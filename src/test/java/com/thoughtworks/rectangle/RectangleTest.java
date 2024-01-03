package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    void shouldReturnAreaOfRectangleAs50WhenLengthIs10AndBreadthIs5(){
        Area area= new Area();
        int result=area.RectangleArea(10,5);
        assertEquals(50,result);

    }
}