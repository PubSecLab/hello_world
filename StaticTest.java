/**
 * This program demonstrates static methods.
 * @version 1.01 2018-01-17
 * @author gmc
 */

public class StaticTest
{
    public static void main(String[] args)
    {
        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];


        //print out information about all the Employee objects
        for(Employee e : staff)
        {
            e.setId();
            System.out.println( "name=" +e.getName()+ ",id=" +e.getId()+ ",salary=" +e.getSalary() );
        }

        int n = Employee.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }

}

hello world

class Employee
{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId;
        nextId++;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public static void main(String[] args) //unit test
    {
        Employee e = new Employee("Harry",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
