package com.example.makingclasses;
import junit.framework.TestCase;

public class ArithmeticTest extends TestCase {
    Arithmetic a;
    Arithmetic b;
    Arithmetic c;
    Arithmetic d;
    TaxArithmetic t;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
        b = new Arithmetic();
        c = new Arithmetic();
        d = new Arithmetic();
        t = new TaxArithmetic();
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(), 5);
    }

    public void testArithmeticMulitpy() {
        assertEquals(b.multiply(), 6);
    }

    public void testArithmeticSubtract(){
        assertEquals(c.subtract(), -1);
    }

    public void testArithmeticDivide() {
        assertEquals(d.divide(),1.5);
    }

    public void testTaxArithmeticDiv(){ assertEquals(t.calculateTax(10,5), .5); }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }
}
