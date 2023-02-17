package ru.muctr.Inheritance.CodeExamples;

/**
 * @author Evgenia Skichko
 */
class A{
    int a;
    A(int a){
        System.out.println("In class A");
    }
}

class B extends A{
    int b;
    B(int a, int b){
        super(a);
        this.b = b;
        System.out.println("In class B");
    }
}

public class Example1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        B bObj = new B(a, b);
    }

}
