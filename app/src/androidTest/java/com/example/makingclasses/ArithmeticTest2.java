package com.example.makingclasses;

import junit.framework.TestCase;

/**
 * Created by wdumas on 2/24/2015.
 */

public class ArithmeticTest2 extends TestCase {

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic(5, 10);
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(), 15);
    }

    public void testArithmeticSubtract() {
        assertEquals(a.subtract(), -5);
    }

    public void testArithmeticMultiply() {
        assertEquals(a.multiply(), 50);
    }

    public void testArithmeticDivide() {
        assertEquals(a.divide(), 2.0);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}
