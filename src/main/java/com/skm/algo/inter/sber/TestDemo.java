package com.skm.algo.inter.sber;

import java.util.stream.Stream;

public class TestDemo {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b);

        System.out.println(c == d);
        A a1 = new B();

        var s1 = new String("saroj");
        var s2 = "saroj";
        var s3 = s2;
        System.out.println(s3 == "sa"+"roj");
        System.out.println(s1.intern() == s2);
        System.out.println(s2 == s3);

        Stream<String> s = Stream.of("A","B","C");
        s.forEach(System.out::println);
        s.forEach(System.out::println);//it will throw an error as it's closed...
    }
}

class A {
    static { System.out.println("A static block"); }//2nd
    {
        System.out.println("A instance block"); //6th
    }
    public A() {
        System.out.println("A constructor"); }//5th
}

class B extends A {
    static {
        System.out.println("B static block"); }//1st
    { System.out.println("B instance block"); }//4th
    public B() { System.out.println("B constructor"); }//3rd
}
