package day08.test;

import day08.Employee;


public class EmployeeTest2 extends Employee{
    public void test(){
//        name = "";  private (비공개)
//        salary = 0; 디폴트영역 (같은 패키지에게만..)
        department = "";
        position="";
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.name;
//        employee.salary=1000;
//        다른 패키지이므로 접근 불가!!

        EmployeeTest2 employeeTest2 = new EmployeeTest2();
        employeeTest2.department="";

    }
}
