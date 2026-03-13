package Model;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String designation;
    private String reportingTo;

    public Employee(int id, String name, int age, String department, String designation, String reportingTo) {
        this.id = id;
        this.name=name;
        this.age=age;
        this.department=department;
        this.designation=designation;
        this.reportingTo=reportingTo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
    public String getDesignation(){
        return designation;
    }
    public String getReportingTo(){
        return reportingTo;
    }

}
