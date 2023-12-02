
public class App {
    public static void main (String[] args){
        System.out.println("Test Push");

        Employee employee = new Employee();

        employee.setName("Shay");
        employee.setAge(21);
        employee.setEmployeeId(1234);
        employee.setJobTitle("Software Engineer Apprentice");
        employee.setSalary(20000);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getJobTitle());
        System.out.println(employee.getSalary());

        Manager lisa = new Manager();
        lisa.setName("Lisa");
        lisa.setAge(32);
        lisa.setEmployeeId(12);
        lisa.setJobTitle("Sales Manager");
        lisa.setSalary(50000);
        lisa.setDepartment("Sales");
        System.out.println(lisa.getName());
        System.out.println(lisa.getAge());
        System.out.println(lisa.getEmployeeId());
        System.out.println(lisa.getJobTitle());
        System.out.println(lisa.getSalary());
        System.out.println(lisa.getDepartment());
        SalesPerson mika = new SalesPerson();
        mika.setName("Lisa");
        mika.setAge(32);
        mika.setEmployeeId(12);
        mika.setJobTitle("Sales Manager");
        mika.setSalary(50000);
        mika.setSalesTarget(10);
        System.out.println(mika.getName());
        System.out.println(mika.getAge());
        System.out.println(mika.getEmployeeId());
        System.out.println(mika.getJobTitle());
        System.out.println(mika.getSalary());
        System.out.println(mika.getSalesTarget());

    }
}
