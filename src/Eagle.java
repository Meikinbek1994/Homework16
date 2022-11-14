public class Eagle extends Animal{


    //Parental class method override
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    //Subclass method
    public void fly(){
        System.out.println("Eagle flies");
    }
}
