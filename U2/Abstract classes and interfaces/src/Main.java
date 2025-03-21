public class Main {
    public static void main(String[] args) {
        /*

        1. An abstract class is a template class so that the child classes require the methods

        2. public abstract class, needs to have at least 1 abstract method

        3. A method that must be in the child class

        4. public abstract void name

        5. A class with only method declarations, it can only be implemented, all methods must be overwritten in the child

        6. abstract method declarations

        7. public interface name {
            public abstract void name{
            }
            }

         8. abstract classes can be extended, can have attributes and any methods
            Interfaces only have abstract methods, can only be implemented, can only have static and final variables
         */

        //9

        WesternStudent bob =  new WesternStudent("Bob",1,"lobing","plobing",2025);
        bob.getInfo();

        WesternStaff rob = new WesternStaff("Rob", 2, "skibity", "toilet", 20000);
        rob.getInfo();

        
    }
}