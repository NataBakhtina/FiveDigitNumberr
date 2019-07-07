package org.itstep;

import static org.itstep.model.Number.SumUsingDataTypeConversion;
import static org.itstep.model.Number.sumUsingOperator;

public class AppRunner {
    public static void main(String[] args) {

        //Найти суму цифр числа(int) двумя способами
//1.С помощью оператора %
        int sum1 = sumUsingOperator(12345);
        System.out.println("sumUsingOperator = " + sum1);
//2.С помощю преобразования типов данных
        int sum2 = SumUsingDataTypeConversion(12345);
        System.out.println("SumUsingDataTypeConversion = " + sum2);

    }
}
