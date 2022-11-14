public class Turtle extends Animal{


    //Parental class method override
    @Override
    public void eat() {
        System.out.println("Turtle is eating");
    }

    //Subclass method
    public void swim(){
        System.out.println("Turtle swims");
    }
}
