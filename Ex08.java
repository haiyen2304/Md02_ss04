package BTVN_module02_session04;

import java.util.Scanner;

public class Ex08 {
    private int employeeId,age,rate;
    private String employeeName;
    private Boolean sex;
    private double salary;

    public Ex08() {

    }
    public Ex08(int employeeId,String employeeName,int age, Boolean sex, int rate, double salary ) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.sex=sex;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập id: ");
        this.employeeId = sc.nextInt();
        System.out.println("hãy nhập tên");
        this.employeeName=sc.next();
        System.out.println("hãy nhập tuổi : ");

        this.age = sc.nextInt();
        System.out.println("hãy nhập hệ số lương: ");
        this.rate = sc.nextInt();
        sc.close();
    }
    public void printData(){
        System.out.println("EmployeeName : "+employeeName);
        System.out.println("Age : "+age);
        System.out.println("Rate : "+rate);
        System.out.println("Salary : "+salary);
    }
    // phương thức tính lương
    public void salary(){
        this.salary=rate*1300000;
    }
    // thieeus 1 emp.displayData();
    public void display(){
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Employee Name : "+employeeName);
        System.out.println("Age : "+age);
        System.out.println("Rate : "+rate);
        System.out.println("Salary : "+salary);

    }
}

