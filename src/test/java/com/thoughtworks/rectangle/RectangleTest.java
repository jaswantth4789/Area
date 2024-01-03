package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    void shouldReturnAreaOfRectangleAs50WhenLengthIs10AndBreadthIs5(){
        Area area= new Area();
        int result=area.RectangleArea(10,5);
        assertThat(result,is(equalTo(50)));

    }
}