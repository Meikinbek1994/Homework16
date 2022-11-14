import java.util.Objects;

public class Main {
    public static void main(String[] args) {



        //Create an Array
        Animal[] animals = {new Eagle(), new Shark(), new Turtle()};

        //Create and Array for subclasses individually
        Eagle[] eagles=new Eagle[1];
        Shark[] sharks=new Shark[1];
        Turtle[] turtles=new Turtle[1];



        //Prints animal methods
        for (Animal animal : animals
        ) {
            System.out.println(animal);
            animal.eat();
            if (animal.getClass().equals(Eagle.class)) {
                ((Eagle) animal).fly();
                eagles[0]=(Eagle) animal;
            } else if (animal.getClass().equals(Shark.class)) {
                ((Shark) animal).attack();
                sharks[0]=(Shark) animal;
            } else {
                ((Turtle)animal).swim();
                turtles[0]=(Turtle) animal;
            }
        }

        //instanceOf checking
        for (Animal animal1:animals
        ) {
            animal1.eat();
            System.out.println(animal1 instanceof Animal);

        }


    }

}