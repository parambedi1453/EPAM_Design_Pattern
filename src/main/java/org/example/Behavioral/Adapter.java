package org.example.Behavioral;

interface Bird{
    public void flying();
    public void makingSounds();
}

class Sparrow implements Bird{
    @Override
    public void flying() {
        System.out.println("Sparrow starts flyinggggggg..............");
    }

    @Override
    public void makingSounds() {
        System.out.println("Chirp Chirp Chirppppp ............");
    }
}

interface Duck{
    public void squeaking();
}

class PlasticDuck implements Duck{
    @Override
    public void squeaking() {
        System.out.println("Squeakk squeakkkk......................");
    }
}

class BirdAdapter implements Duck{
    Bird bird;
    public BirdAdapter(){
    }

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeaking() {
        bird.makingSounds();
    }
}

public class Adapter{
    public static void main(String args[]){
        Sparrow sparrow = new Sparrow();
        Duck duck = new PlasticDuck();
        Duck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow");
        sparrow.flying();
        sparrow.makingSounds();

        System.out.println("Duck");
        duck.squeaking();

        System.out.println("Bird Adapter");
        birdAdapter.squeaking();
    }
}