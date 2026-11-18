package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset{
    private BigDecimal moolah;

    public Cash(String description, String dateAcquired, BigDecimal originalCost, BigDecimal moolah) {
        super(description, dateAcquired, originalCost);
        this.moolah = moolah;
    }

    public BigDecimal getValue(){
        return moolah;
    }
}
