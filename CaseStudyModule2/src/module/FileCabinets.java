package module;

import common.ReadAndWrite;

import java.util.List;
import java.util.Stack;

public class FileCabinets {
    public static void storageStack(){
        List<Employee> employeeList= ReadAndWrite.readFileEmployee("employee.txt");
        Stack<Employee> employeeStack=new Stack<>();
        for (Employee employee: employeeList){
            employeeStack.add(employee);
        }
        for (Employee employee: employeeStack){
            employee.showInFor();
        }
    }
}
