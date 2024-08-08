package BTVN_module02_session04;

import java.util.Scanner;

public class RunAll {

    public static void main(String[] args) {
       //TH1
//        System.out.println("Thong tin cua Hinh Chu Nhat");
//        RectangleTh1 hinh1 = new RectangleTh1();
//        RectangleTh1 hinh2 = new RectangleTh1(5.4f,7.8f);
//
//        System.out.println(hinh1.display());
//        System.out.println(hinh2.display());
//
//        hinh1.setWidth(20.0f);
//        System.out.println(hinh1.display());
//        System.out.println(hinh2.getArea());
//        System.out.println(hinh2.getPerimeter());


        //TH2
//        StudentTh1 sv1 = new StudentTh1(12, 20, "son", "lop1a", "HN", true);
//        System.out.println(sv1.display());



//        //TH3
//        CategoryTh3 category1=new CategoryTh3("quần",1);
//        CategoryTh3 category2=new CategoryTh3("áo",2);
//        System.out.println(category1.display());
//
//        ProductTh3 product1=new ProductTh3(1,"quần âu",150,category1);
//        ProductTh3 product2=new ProductTh3(2,"áo dài",200,category2);
//        ProductTh3 product3=new ProductTh3(3,"quần cộc",300,category1);
//        ProductTh3 product4=new ProductTh3(4,"áo phông",500,category2);
//        product1.display();
//        product2.display();
//        product3.display();
//        product4.display();



//        //TH4
//        StudentTh4 studen1 = new StudentTh4(1,"anh",true,"JV01",20,"hà nội");
//        StudentTh4 studen2 = new StudentTh4(2,"anhhhh",false,"JV02",22,"hà Nam");
//        studen1.display();
//        studen2.display();


//          //Th5
//        System.out.println(" hello word");
//        Th5_Person p1=new Th5_Person("hoang","yen",20,true);
//        // truy cập trực tiếp các thuộc tính của đối tượng
//        System.out.println(p1.firstName);
//        // truy cập gián tiếp qua phương thức get set
//        System.out.println(p1.getLastName());



//            //Ex01
//            Ex01 circle = new Ex01(5.0F,"xanh");
//        System.out.println("\n hinh1: "
//                + "\n"+circle.getRadius()
//                + "\n"+circle.getColor()
//                +"\n diện tích \n"+
//                +circle.area()
//                +"\n chu vi \n"+
//                +circle.perimeter());



//            //Ex02
//        Scanner sr=new Scanner(System.in);
//        System.out.println("hãy nhập số a: ");
//        double a=sr.nextDouble();
//        System.out.println("hãy nhập số b: ");
//        double b=sr.nextDouble();
//        System.out.println("hãy nhập số c: ");
//        double c=sr.nextDouble();
//
//        Ex02 equation=new Ex02(a,b,c);
//        double delta=equation.getDelta();
//        if(delta>0){
//            System.out.println("phương trình có 2 nghiệm ");
//            System.out.println("\n nghiệm 1: "+equation.getroot1());
//            System.out.println("\n nghiệm 2: "+equation.getroot2());
//        } else if (delta==0) {
//            System.out.println("phương trình có 1 nghiệm");
//            System.out.println("\n nghiệm 1: "+equation.getroot1());
//        }else {
//            System.out.println("phương trình vô nghiệm");
//        }



//            //Ex03
//        int[]arr= new int[1000000];
//        for(int i=0;i<1000000;i++){
//            arr[i]=(int)Math.floor(Math.random()*100);
//        }
//        // 1. khởi tạo đối tuượng StopWatch -> set startTime        20000
//
//        Ex03 stopWatch = new Ex03();
//        // 2. thực thi chương trình đảo ngược mảng số 100.000 số    20
//        // thực thi đảo số trong mảng
//        for (int i = 0; i < arr.length / 2; i++)
//        {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        // 3. kết thức thì set endTime bằng thời gian hệ thống      20020
//        stopWatch.getEndTime();
//        // -> endTime - startTime => 20
//
//        System.out.println(stopWatch.getTime());



//            //Ex04
//        Ex04 fan1 = new Ex04(3,10,"yellow",true);
//        Ex04 fan2 = new Ex04(2,5,"blue",true);
//        System.out.println(fan1.toString());
//        System.out.println(fan2.toString());



//             //Ex05
//        Ex05 test = new Ex05();
//        test.setName("yen");
//        System.out.println(test.name);



//                //Ex06
//         Ex06 me=new Ex06();
//         me.setMyString("haiyen");
//         System.out.println(me.getMyString());



//                  //Ex07
//         Ex07 circle = new Ex07();
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());



                 //Ex08
//           Ex08 emp=new Ex08();
//           emp.inputData();
//           emp.salary();
//           emp.display();



                 //Ex09
        int choice=-1;
        public void run(){
            Scanner sc = new Scanner(System.in);
            while(choice!=0){
                System.out.println("hãy chọn chức năng bạn muốn sửa, Menu: \n");
                System.out.println("1. Hiển thị danh sách tất cả các học sinh\n");
                System.out.println("2. Thêm mới học sinh\n");
                System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh\n");
                System.out.println("4. Xoá học sinh\n");
                System.out.println("0. Thoát");
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("bạn đã lựa chọn 1. Hiển thị danh sách tất cả các học sinh\n ");
                        displayAllStudents();
                        break;
                    case 2:
                        System.out.println("bạn đã lựa chọn 2. Thêm mới học sinh\n");
                        addStudents();
                        break;
                    case 3:
                        System.out.println("bạn đã lựa chọn 3. Sửa thông tin học sinh dựa vào mã học sinh\n");
                        updeatStudens();
                        break;
                    case 4:
                        System.out.println("bạn đã lựa chọn 4. Xoá học sinh\n");
                        deleteStudens();
                        break;
                    case 0:
                        System.out.println("bạn đã thoát khỏi chương trình");
                        return;
                    default:
                        System.out.println("hãy chọn đúng số tương ứng với chức năng");
                }
            }
        }





//        //Ex09
////        Bước 1: khai báo mảng và kích thước của mảng
//        Scanner sc = new Scanner(System.in);
//        Ex09[] mangHs = new Ex09[2];
//        int doDaiMang = 2;
//        mangHs[0] = new Ex09(1,19,"Y", "HN", "0987654321", false);
//        mangHs[1] = new Ex09(2,29,"K", "TK", "0987654321", true);
////        Bước 2: hiển thị menu chức năng và cho người dùng chọn
//        int choice = -1;
//        while (choice != 0) {
//            System.out.println("C-R-U-D-E ::choice:: 1-2-3-4-0 Chon di: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    Ex09 newHs = new Ex09(2,29,"K", "TK", "0987654321", true);
//
//                    int doDaiMangMoi = doDaiMang + 1;
//                    Ex09[] newMangHs = new Ex09[doDaiMang+1];
//
//                    for(int i=0;i<doDaiMang;i++){
//                        newMangHs[i]=mangHs[i];
//                    }
//                    newMangHs[doDaiMangMoi - 1] = newHs;
//                    mangHs = newMangHs;
//                    doDaiMang = doDaiMangMoi;
//                    break;
//                case 2:
//                    for(int i=0;i<doDaiMang;i++){
//                        System.out.println(mangHs[i].displayData());
//                    }
//                    break;
//                case 3:
//                    System.out.println("Nhap vi tri sua: 0 -> " + (doDaiMang - 1));
//                    int vitriSua = sc.nextInt();
//                    mangHs[vitriSua].inputData(6,6,"S", "S", "SSSSSSSSSS", false);
//                    break;
//                case 4:
//                    System.out.println("Nhap vi tri xoa: 0 -> " + (doDaiMang - 1));
//                    int vitriXoa = sc.nextInt();
//                    for(int j=vitriXoa;j<=doDaiMang-2;j++){
//                        mangHs[j]=mangHs[j+1];
//                    }
//                    doDaiMang = doDaiMang-1;
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Nhap lai lua chon di");
//                    break;
//            }
//
//        }
////        Bước 3: thiết kế các chức năng theo yêu cầu

//        sc.close();
    }
}
