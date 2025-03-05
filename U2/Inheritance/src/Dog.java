public class Dog extends Animal{

    public Dog (String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.print("Woof! ");
        super.speak();
        System.out.println("Woof!");
    }

    public void wag(){
        System.out.println("The Dog is wagging its tail");
    }
}
