package com.skm.algo.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Inside Main...");
        Parent parent = new Child();
        parent.display();//it will call child's method...
        child.extraDisplay();

        //Child child1 = (Child) new Parent();
        //child1.display();//we will get class cast exception as parent can't cast to child.
    }
}
class Parent{
    Parent(){
        System.out.println("Inside Parent class Constructor...");
    }
    public void display(){
        System.out.println("Inside Parent-Display method");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Inside Child class Constructor...");
    }
    public void display(){
        System.out.println("Inside Child-Display method");
    }
    public void extraDisplay(){//we can't access this with parent reference...
        System.out.println("Inside chlid extraDisplay method...");
    }
}
