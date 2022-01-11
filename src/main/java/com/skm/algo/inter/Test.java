package com.skm.algo.inter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Saroj on 06/01/22
 **/
public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,10000));
        employees.add(new Employee(20,30000));
        employees.add(new Employee(30,20000));
        employees.add(new Employee(40,4000));
        List<Employee> employees1 = employees.stream().filter(e-> e.salary>10000).sorted(new SortByAge()).collect(Collectors.toList());
        List<Employee> employees2 = employees.stream().filter(e-> e.salary>10000).sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println(employees1);
        System.out.println(employees2);
    }
}
class SortByAge implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.age.compareTo(e2.age);
    }
}
class Employee{
    Integer age;
    int salary;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(Integer age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                '}';
    }
}
