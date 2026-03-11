package Service;

import Model.Employee;

import java.util.ArrayList;

public class EmployeeService {
        ArrayList<Employee> emp;

    public EmployeeService(ArrayList<Employee> emp) {
        this.emp = emp;
    }
    public void viewDetails(){
        for(Employee e:emp){
            e.display();

        }
    }
}
