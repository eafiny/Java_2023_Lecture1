package ru.muctr.Inheritance.SimpleInheritance;

import java.util.Objects;

/**
 * @author Evgenia Skichko
 */
public class Employee {
    private String inn;
    private String snils;
    private String name = "John";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String prepareDocuments(){
        return new String();
    };

    @Override
    public String toString() {
        return String.format("Employee %s", name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || !this.getClass().equals(obj.getClass())) return false;
        Employee employee = (Employee) obj;
        return  (this.getName().equals(employee.getName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        System.out.println(employee1.hashCode());
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1);
    }
}
