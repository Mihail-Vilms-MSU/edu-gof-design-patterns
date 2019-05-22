package creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * ~~~~ Prototype pattern ~~~~
 *
 * - Problem: object creation is costly affair and requires a lot of time and/or resources
 *            and you have a similar object already created;
 *
 * - Solution: prototype pattern provides a mechanism to clone already existing object and modify its copy for our needs.
 *
 * - Pros:  You can clone objects without coupling to their concrete classes;
 *          You can get rid of repeated initialization code in favor of cloning pre-built prototypes.
 *          You can produce complex objects more conveniently.
 *
 * - Cons:  Cloning complex objects that have circular references might be very tricky.
 *
 */

public class Employees {
    private List<String> employeeList;

    public Employees(){
        employeeList = new ArrayList<String>();
    }

    public Employees(List<String> employeeList){
        this.employeeList = employeeList;
    }

    public void loadData(){
        // Extract information about employees from db/rest/ect

        employeeList.add("emp1");
        employeeList.add("emp2");
        employeeList.add("emp3");
        employeeList.add("emp4");
    }

    public List<String> getEmployeeList(){
        return employeeList;
    }

    @Override
    public Employees clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String emp: this.employeeList){
            temp.add(emp);
        }
        return new Employees(temp);
    }
}
