package BTVN_module02_session04;

public class Th3_Product {
    private int productId;
    private String productName;
    private float productPrice;
    Th3_Category category;

    // contrusctor
    // phương thức khởi tạo không tham số
    public Th3_Product(){

    }
    // phương thức khởi tạo có tham số
    public Th3_Product(int productId, String productName, float productPrice, Th3_Category category){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    // phương thức khởi tạo các thông tin của sản phẩm
    public void display(){
        System.out.println(" Mã sản phẩm : "+productId+"\n"+
                           " Tên sản phẩm: "+productName+"\n"+
                           " Giá: "+productPrice+"\n"+
                           " Danh mục: "+category.categoryName);

    }

}
