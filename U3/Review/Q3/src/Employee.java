public class Employee extends Person {

    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void displayInformation(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

}
