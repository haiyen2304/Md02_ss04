package BTVN_module02_session04;

public class Th2_Student {
    private int studentId, age;
    private String studentName,className,address;
    private boolean sex;


    public Th2_Student(){

    }

    public Th2_Student(int studentId, int age, String studentName, String className, String address, boolean sex){
         this.studentId = studentId;
         this.age = age;
         this.studentName = studentName;
         this.className = className;
         this.address = address;
         this.sex=sex;
    }

    public String display() {
        return studentName + " " + age + " " + className + " " + address+" "+studentId+" "+sex;
    }
}
