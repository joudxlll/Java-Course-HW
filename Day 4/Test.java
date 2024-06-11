package Day4;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        try {
            Employees newEmployee = new Employees(209, "Joud", "AR", "Joud@gmail.com", "0553499884",
                    "2024-01-01", 1, 20000.00, 100, 10);
            employeeDAO.insertEmp(newEmployee);
            System.out.println("Inserted new employee: " + newEmployee);

            newEmployee.setFirst_name("Ali");
            newEmployee.setLast_name("ER");
            employeeDAO.updateEmp(newEmployee);
            System.out.println("Updated employee: " + newEmployee);

            Employees selectedEmployee = employeeDAO.selectEMP(newEmployee.getEmployee_id());
            System.out.println("Selected employee: " + selectedEmployee);

            ArrayList<Employees> allEmployees = employeeDAO.selectAllEmps();
            System.out.println("All employees:");
            for (Employees emp : allEmployees) {
                System.out.println(emp);
            }

            employeeDAO.deleteEmp(newEmployee.getEmployee_id());
            System.out.println("Deleted employee with ID: " + newEmployee.getEmployee_id());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

