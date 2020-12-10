package com.kishore.kamal;

import org.junit.Before;
import org.junit.Test;
import static  org.mockito.Mockito.*;
import static org.junit.Assert.*;
public class CalculatorTest {

    Calculator calculator = null;

    CalculatorService calculatorService = mock(CalculatorService.class);

    @Before
    public void setUp(){
        calculator = new Calculator(calculatorService);
    }

    @Test
    public void testAdd(){
        when(calculatorService.add(2,3)).thenReturn(5);
        assertEquals((long)10, (long) calculator.perform(2,3));
    }
}
