package BTVN_module02_session04;

public class Th3_Category {
    public String categoryName;
    private int categoryID;


    // Constructor
    // phương thức khởi tạo không tham số
    public Th3_Category(){
    }
    public Th3_Category(String categoryName, int categoryId){
        this.categoryName=categoryName;
        this.categoryID=categoryId;
    }
    public String display(){
        return "Mã danh mục:  "+categoryName+ " \n" + "Tên danh mục:  "+categoryID;
    }
}
