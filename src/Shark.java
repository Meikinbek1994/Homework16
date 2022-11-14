public class Shark extends Animal{


    //Parental class method override
    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }

    //Subclass method
    public void attack(){
        System.out.println("Shark attacks");
    }

}
