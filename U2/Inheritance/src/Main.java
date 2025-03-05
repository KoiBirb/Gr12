public class Main {
    public static void main(String[] args) {
        /*
            1. What is inheritance, as it relates to computer science?

            Inheritance is the passing of information, characteristics, and behaviours from 1 class to another

            2 What terms do we use to refer to the class that is being inherited?

            Superclass

            3. What terms do we use to refer to the class that is inheriting from another class?

            Subclass

            4. How do we inherit a class when creating a subclass in Java?

            Extends keyword

            5. What is method overriding?

            Creating a method with the same name as a superclasses method but with a different function

            6. If a method is added to a subclass that doesn’t exist in a superclass, which objects can access the method?

            the subclasses object

            7. How do the access levels private and public affect inheritance?

            Anything private in the parent class will not be inherited

            8. What is multilevel inheritance?

           Classes can inherit more than 1 class by levels
           Ex. B extends A, C extends B, therefore C extends B and A

         */

        // 9
        Animal bob = new Animal("bob");
        bob.speak();

        //10
        Dog dog = new Dog("dog");
        dog.speak();
        dog.wag();

        //11
        Cat cat = new Cat("cat");
        cat.speak();

        //12
        Tiger tiger = new Tiger("Tiger");
        tiger.speak();
        tiger.swipe();
    }
}