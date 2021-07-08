package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        Integer a = calc.plus.apply(1, 2);
        Integer b = calc.minus.apply(1,1);
        Integer c = calc.divide.apply(a, b);

        calc.println.accept(c);
        calc.println.accept(calc.abs.apply(-7));
        calc.println.accept(calc.pow.apply(7));
    }
}
