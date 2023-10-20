package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop,Comparable <Product>{
    private int productId;
    private String productName;
    private String title;
    private String description;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;
    public static int count=0;

    public Product() {
        this.productId=count++;
    }

    public Product(int productId, String productName, String title, String description, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = count++;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return importPrice*RATE;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData(List<Catalog> catalogList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        this.productName=scanner.nextLine();
        System.out.println("Nhập tiêu đề: ");
        this.title=scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        this.description=scanner.nextLine();
        System.out.println("Giá nhập vào: ");
        this.importPrice= Float.parseFloat(scanner.nextLine());
        System.out.println("Trạng thái của sản phẩm: ");
        this.productStatus= Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Chọn danh mục: ");
        for (int i = 0; i < catalogList.size(); i++) {
            System.out.println((i+1)+". "+catalogList.get(i).getCatalogName());
        }
        System.out.println("Hãy chọn danh mục theo số thứ tự: ");
        int number= Integer.parseInt(scanner.nextLine());
        if(number>=1&&number<=catalogList.size()){
            this.catalog=catalogList.get(number-1);
        }else {
            System.out.println("Không tìm thấy danh mục bạn vừa nhập!");
            return;
        }
    }

    @Override
    public void displayData() {
        System.out.println("Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", catalog=" + catalog.getCatalogName() +
                ", exportPrice=" + getExportPrice() +
                ", productStatus=" + productStatus +
                '}');
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.getExportPrice()-o.getExportPrice());
    }
}
