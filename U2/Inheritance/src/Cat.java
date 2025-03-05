public class Cat extends Animal{

    public Cat (String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.print("Meow! ");
        super.speak();
        System.out.println("Meow!");
    }
}
