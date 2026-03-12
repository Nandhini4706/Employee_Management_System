package Service;

import Model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeService {
      Connection con;

    public EmployeeService(Connection con) {
        this.con = con;
    }
    public void addEmployee(Employee emp)throws Exception  {
        String query = "Insert into employee(id,name,age,department,designation,reporting_to)" +
                "values(?,?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, emp.getId());
        ps.setString(2, emp.getName());
        ps.setInt(3, emp.getAge());
        ps.setString(4, emp.getDepartment());
        ps.setString(5, emp.getDesignation());
        ps.setString(6, emp.getReportingTo());
        int row=ps.executeUpdate();
        System.out.println("Employee Added Successfully");
    }

}
