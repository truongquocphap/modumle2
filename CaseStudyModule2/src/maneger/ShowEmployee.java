package maneger;

import common.ReadAndWrite;
import module.Employee;

import java.util.*;

public class ShowEmployee {
    public static void inputEmployeeMap(){
        int count=1;
        String countString="00";
        List<Employee> employeeList= ReadAndWrite.readFileEmployee("employee.txt");
        Map<String ,Employee> employeeMap=new HashMap<String,Employee>();
        for(Employee employee: employeeList){
            employeeMap.put(countString+count,employee);
            count++;
        }
        Set<String> keySet=employeeMap.keySet();
        for(String key: keySet){
            System.out.println(key + "  " + employeeMap.get(key));
        }
    }
}
