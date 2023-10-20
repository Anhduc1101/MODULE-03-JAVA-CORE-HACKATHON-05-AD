package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.List;
import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String description;
    private boolean catalogStatus;
    public static int count = 0;

    public Catalog() {
        this.catalogId = count++;
    }

    public Catalog(int catalogId, String catalogName, int priority, String description, boolean catalogStatus) {
        this.catalogId = count++;
        this.catalogName = catalogName;
        this.priority = priority;
        this.description = description;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData(List<Catalog> catalogList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên danh mục: ");
        this.catalogName=scanner.nextLine();
        System.out.println("Nhập độ ưu tiên: ");
        this.priority= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả danh mục: ");
        this.description=scanner.nextLine();
        System.out.println("Nhập trạng thái: ");
        this.catalogStatus= Boolean.parseBoolean(scanner.nextLine());
    }


    @Override
    public void displayData() {
        System.out.println("Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                '}');
    }
}
