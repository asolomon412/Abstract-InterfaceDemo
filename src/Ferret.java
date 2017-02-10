/**
 * Created by Antonella on 2/10/17.
 */
public class Ferret extends Animal {
    @Override
    public void name() {
        System.out.println("I am a ferret.");
    }

    @Override
    public void speak() {
        System.out.println("LET ME OUT");

    }

    @Override
    public void bodyParts() {
        System.out.println("Tail, fur, legs.");

    }

    @Override
    public void size() {
        System.out.println("Tiny");

    }
}
