package BTVN_module02_session04;

public class Th4_Student {
    private int studentId,age;
    private String studentName,className,address;
    private Boolean sex;

    // hàm tạo : Constructor
    // hàm k tham số
    public Th4_Student() {

    }
    //hàm có tham số
    public Th4_Student(int studentId, String studentName, Boolean sex, String className, int age, String address){
        this.studentId=studentId;
        this.studentName=studentName;
        this.sex=sex;
        this.className=className;
        this.age=age;
        this.address=address;
    }
    public void display(){
        System.out.println("Student ID: "+studentId +"\n"
        + "Student Name: "+studentName+"\n"
        + "Student Age: "+age+"\n"
        + "Student gender: "+sex+"\n"
        + "Student Class: "+className+"\n"
        + "Student Address: "+address+"\n"
        );
    }
}
