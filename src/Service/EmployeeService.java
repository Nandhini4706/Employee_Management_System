package Service;

import Model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeService {
    Connection con;

    public EmployeeService(Connection con) {
        this.con = con;
    }

    public void addEmployee(Employee emp) throws Exception {
        String query = "Insert into employee(id,name,age,department,designation,reporting_to)" +
                "values(?,?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, emp.getId());
        ps.setString(2, emp.getName());
        ps.setInt(3, emp.getAge());
        ps.setString(4, emp.getDepartment());
        ps.setString(5, emp.getDesignation());
        ps.setString(6, emp.getReportingTo());
        int row = ps.executeUpdate();
        System.out.println("Employee Added Successfully");
    }

    public void viewEmployee() throws Exception {
        String query = "SELECT * FROM employee";
        PreparedStatement ps1 = con.prepareStatement("SELECT * FROM employee");
        ResultSet rs = ps1.executeQuery();
        while (rs.next()) {
            int id1 = rs.getInt("id");
            String name1 = rs.getString("name");
            int age1 = rs.getInt("age");
            String dept1 = rs.getString("department");
            String desi = rs.getString("designation");
            String repo1 = rs.getString("reporting_to");

            System.out.println(id1 +" " + name1 +" " + age1 +" " +dept1 +" " +desi +" " +repo1);
        }
    }
}
