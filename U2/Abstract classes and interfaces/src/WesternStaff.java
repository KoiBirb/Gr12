public class WesternStaff extends WesternPerson {

    String faculty, title;
    int salary;

    public WesternStaff(String name, int ID, String title, String faculty, int salary) {
        super(name,ID);
        this.faculty = faculty;
        this.title = title;
        this.salary = salary;
    }

    @Override
    public void getInfo() {
        System.out.println("Western Student Info: " + name +  " " + ID + " " + faculty + " " + title + " " +  salary);
    }
}
