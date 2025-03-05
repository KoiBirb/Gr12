public class Main {
    public static void main(String[] args) {
        /*
        1. What is an object?

            An object is something that stores data and can preform actions

        2. What is a class?

            A class is the blueprint for objects

        3. How does one create a class, and what does it consist of?

            Consists of a declaration (access level and name)
            and body (attributes, constructors, methods) *class members*

        4. What is an attribute?

            A variable in the class

        5. What is the order of organization in a class?

            Attributes, constructors, methods

        6. Explain the purpose of the keyword this.

            Refers to the classes value and not the argument

        7. What is a constructor?

            A method that allows for the creation of an object defined by the class

        8. What are accessor methods?

            returns the value of a given private attribute

        9. What are modifier methods?

            Changes the value of a given private attribute

        10. What is a helper method?

            Does something usually

        11. What is encapsulation?

            Creating private variables and getter/setter methods

        12. How do we encapsulate data in Java?

            private access modifier

        13. What is a “getter” method?

            accessor

        14. What is a “setter” method?

            modifier

        15. What are some benefits of using encapsulation?
.
            Allow for input and output control
            Better security

        16. What is a static class method?

            Allows the method to be used without creating an object of the class

         */

        //17

        Coin nickel = new Coin();
        nickel.flip();
        if (nickel.getFaceUp() == 0) System.out.println("Heads up!");
        else System.out.println("Tails up!");
    }
}