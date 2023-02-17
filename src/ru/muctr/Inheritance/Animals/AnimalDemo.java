package ru.muctr.Inheritance.Animals;

/**
 * @author Evgenia Skichko
 */
abstract class Animal{
    String type;
    int age;

    void eat(){
    }

    abstract void getVoice();
}

class Dog extends Animal{
    @Override
    void getVoice() {
        System.out.println("Gav");
    }
}

class Cat extends Animal{
    @Override
    void getVoice() {
        System.out.println("Meou");
    }
}

public class AnimalDemo {
    Animal animal1 = new Dog();
public static void main(String[] args) {
    Animal[] animals = new Animal[]{new Dog(), new Cat()};
    for(Animal animal: animals){
        animal.getVoice();
    }
//    Animal someAnimal = new Animal() {
//        @Override
//        void getVoice() {
//
//        }
//    }
}

}
