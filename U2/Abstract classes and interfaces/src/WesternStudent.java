public class WesternStudent extends WesternPerson {

    String major, minor;
    int year;

    public WesternStudent(String name, int ID, String major, String minor, int year) {
        super(name,ID);
        this.minor = minor;
        this.major = major;
        this.year = year;
    }

    @Override
    public void getInfo() {
        System.out.println("Western Student Info: " + name +  " " + ID + " " + major + " " + minor + " " + year);
    }
}
