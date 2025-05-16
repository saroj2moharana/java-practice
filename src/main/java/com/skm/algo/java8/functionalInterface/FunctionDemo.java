package com.skm.algo.java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String str[]) {
        getNumbers().stream().map(Number::getMult).forEach(System.out::println);
    }


    public static List<Number> getNumbers() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(new Number(1, 2));
        numbers.add(new Number(3, 4));
        numbers.add(new Number(5, 6));
        numbers.add(new Number(7, 8));
        numbers.add(new Number(9, 10));
        return numbers;
    }

}

class Number {
    int a, b;

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Function...
    public Function<Integer, Integer> getMult() {
        return (Integer input) -> a * b;
    }

    //Consumer...
    public Consumer<Integer> disp() {
        Consumer<Integer> integerConsumer = (Integer val) -> System.out.println(val);
        return integerConsumer;
        //integerConsumer.accept(12);
    }
}
