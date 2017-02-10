/**
 * Created by Antonella on 2/10/17.
 */
public class Dog extends Animal implements Mammal{

    @Override
    public void toEat() {
        System.out.println("I am eating the Instructor");
    }

    @Override
    public void warmBlooded() {
        System.out.println("But I still need a blanket");
    }

    @Override
    public void name() {
        System.out.println("I am a dog");

    }

    @Override
    public void speak() {
        System.out.println("Bark");

    }

    @Override
    public void bodyParts() {
        System.out.println("I have four legs");
    }

    @Override
    public void size() {
        System.out.println("I am big");
    }








}
