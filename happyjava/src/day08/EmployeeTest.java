package day08;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.name;   -- private한 필드는 외부에서 접근 불가능
        employee.salary = 1000;  //같은 패키지에서 가능
        employee.department = "";  //protected 같은패키지가능!!
    }
}
