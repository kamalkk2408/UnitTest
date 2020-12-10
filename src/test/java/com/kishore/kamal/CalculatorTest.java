package com.kishore.kamal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CalculatorTest {

    Calculator calculator = null;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals((long)5, (long) calculator.add(2,3));
    }
}
