public abstract class WesternPerson {

    public String name;
    public int ID;

    public  WesternPerson(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract void getInfo();
}
