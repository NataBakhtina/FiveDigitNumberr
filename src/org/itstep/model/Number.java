package org.itstep.model;

public class Number {

    //1------------------------------------------------------
    public static int sumUsingOperator(int num) {
        int sum = 0;
        while (num % 10 != 0) {
            int r = num % 10;
            num = num / 10;
            sum = sum + r;
        }
        //       System.out.println("sum = " + sum);
        return sum;
    }
    //2------------------------------------------------------
    public static int SumUsingDataTypeConversion(int num) {
        String number = Integer.toString(num);
        char[] charArray = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            sum = sum + c;
        }
        //       System.out.println("sumStr = " + sum);
        return sum;
    }
        /*если метод возвращает String
        System.out.println("sumStr = " + Integer.toString(sum));
        return number = Integer.toString(sum);*/
}
