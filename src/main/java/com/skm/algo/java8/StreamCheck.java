package com.skm.algo.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author saroj on 28/09/23
 */
public class StreamCheck {
    public static void main(String[] args) {
        User u1 = new User("Saroj",1);
        User u2 = new User("Kumar",2);
        List<User> list = Arrays.asList(u1,u2);
        System.out.println(list);
        list.stream().forEach(user->{
            user.setAge(2);
        });
        System.out.println("after modification:");
        System.out.println(list);
    }

}
class User{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
