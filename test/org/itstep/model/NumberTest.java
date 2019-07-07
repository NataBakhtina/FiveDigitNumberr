package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberTest {

    @Test
    void sumUsingOperator() {
        int testData1 = Number.sumUsingOperator(12345);
        Assertions.assertEquals(15,testData1);
    }

    @Test
    void sumUsingDataTypeConversion() {
        int testData2 = Number.SumUsingDataTypeConversion(12345);
        Assertions.assertEquals(15,testData2);
    }
}