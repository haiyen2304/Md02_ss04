package BTVN_module02_session04;

import java.util.Scanner;

public class Ex09 {
    private int id,age;
    private String name,address,numberPhone;
    private boolean sex;
    //cac con contractor
    public Ex09(){
    }

    public Ex09( int id, int age, String name,String address, String numberPhone,boolean sex){
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.numberPhone = numberPhone;
        this.sex=sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void inputData(int id, int age, String name, String address, String numberPhone, boolean sex){
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.numberPhone = numberPhone;
        this.sex=sex;
    }

    public String displayData(){
        return "id: "+id+"\n"+"tuổi: "+age+"\n"+"Tên : "+name+"\n"+"Địa chỉ : "+address+"\n"+"số điện thoai : "+numberPhone+"\n"+"Giới tính : "+sex;
    }
    //        Bước 2: hiển thị menu chức năng và cho người dùng chọn

// các hàm render
    public void displayAllStudents(){
        Ex09[] mangHs = new Ex09[2];
        int doDaiMang = mangHs.length;
        mangHs[0] = new Ex09(1,19,"Y", "HN", "0987654321", false);
        mangHs[1] = new Ex09(2,29,"K", "TK", "0987654321", true);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số X mà bạn muốn chèn");
        int number=Integer.parseInt(sc.nextLine());
        System.out.println("nhp vị trí index cân chèn X mà bạn muốn chèn");
        int index=sc.nextInt();
        if(index<0 || index>doDaiMang){
            System.out.println("không chèn được phần tử va mảng");
        }else {
            // thực hien chèn
            Ex09[] newMangHs = new Ex09[doDaiMang+1];
            for(int i=0;i<doDaiMang;i++){
                newMangHs[i]=mangHs[i];
            }
            newMangHs[index]=number;




        }



    }
    public addStudents(){
        Scanner sc = new Scanner(System.in);
    }
    public updeatStudens(){
        Scanner sc = new Scanner(System.in);
    }
    public deleteStudens(){
        Scanner sc = new Scanner(System.in);
    }


}
