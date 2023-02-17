package ru.muctr.Inheritance.SimpleInheritance;

import ru.muctr.Interfaces.BeStudent;

/**
 * @author Evgenia Skichko
 */
public class Developer extends Employee implements BeStudent {
    String[] langs;
    String level;

    public void writeCode(){};

    public static void main(String[] args) {
        Developer developer = new Developer();
//        developer.
    }

    @Override
    public void doHomework() {

    }

    @Override
    public void doScientificWork() {

    }
}
