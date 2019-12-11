package com.example.makingclasses;

public class TaxArithmetic extends Arithmetic {
    public double calculateTax(double PurchaseAmount, double TaxRate){
        return PurchaseAmount*(TaxRate/100);
    }
}
