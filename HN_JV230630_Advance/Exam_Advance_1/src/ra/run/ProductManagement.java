package ra.run;

import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {

    static Scanner scanner=new Scanner(System.in);
    static List<Catalog> catalogList=new ArrayList<>();
    static  List<Product> productList=new ArrayList<>();
    static {
        catalogList.add(new Catalog(0, "nghệ thuật", 1, "SGK", true));
        catalogList.add(new Catalog(1, "văn học", 3, "SGK", true));
        catalogList.add(new Catalog(2, "khoa học và công nghệ", 2, "SGK", true));
    }

    static {
        productList.add(new Product(0, "làng", "truyện ngắn", "của tác giả Kim Lân", catalogList.get(1), 2000, 0, true));
        productList.add(new Product(2, "xuân tóc đỏ", "truyện ngắn", "của tác giả Vũ Tọng Phụng", catalogList.get(2), 1000, 0, true));
        productList.add(new Product(1, "abc", "truyện ngắn", "của tác giả Kim Lân", catalogList.get(0), 1200, 0, true));
    }

    public static void main(String[] args) {
        while (true){
        System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
        System.out.println("1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục ");
        System.out.println("2. Nhập số sản phẩm và nhập thông tin các sản phẩm ");
        System.out.println("3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần ");
        System.out.println("4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm ");
        System.out.println("5. Thoát");
        System.out.println("Mời lựa chọn: ");
        int choice= Integer.parseInt(scanner.nextLine());
        handleChoice(choice);
        }
    }
    private static void handleDisplayCatalogInfo(){
        for (int i=0;i<catalogList.size();i++) {
            catalogList.get(i).displayData();
        }
    }
    private static void handleDisplayProductInfo(){
        for (int i=0;i<productList.size();i++) {
            productList.get(i).displayData();
        }
    }
    private static void handleChoice(int choice) {
      switch (choice){
          case 1:
              handleAddCatalog();
              break;
               case 2:
                   handleAddProduct();
              break;
               case 3:
                   handleSortAcendByExportPrice();
              break;
               case 4:
                   handleFindProductByCatalogName();
              break;
               case 5:
                   System.out.println("Cảm ơn đã sử dụng chương trình !");
                   System.exit(0);
              break;
          default:
              System.out.println("Không có lựa chọn này !");
              break;

      }
    }

    private static void handleFindProductByCatalogName() {
        handleDisplayCatalogInfo();
        System.out.println("Nhập tên danh mục cần tìm: ");
        String input=scanner.nextLine();
        for(int i=0;i<productList.size();i++){
            if(productList.get(i).getCatalog().getCatalogName().toLowerCase().contains(input.toLowerCase())){
                productList.get(i).displayData();
            }
        }
        System.out.println("---------------- Tìm thành công ----------------");
    }

    private static void handleSortAcendByExportPrice() {
        System.out.println("Danh sách sản phẩm trước khi sắp xếp: ");
        handleDisplayProductInfo();
        Collections.sort(productList);
        System.out.println("Danh sách sản phẩm sau khi sấp xếp theo giá tăng dần là: ");
        handleDisplayProductInfo();
    }

    private static void handleAddProduct() {
        System.out.println("Nhập số lượng sản phẩm bạn muốn thêm: ");
        int num= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập thông tin sản phẩm: ");
            Product product=new Product();
            product.inputData(catalogList);
            productList.add(product);
        }
        handleDisplayProductInfo();
        System.out.println("---------------- Nhập thành công ----------------");
    }

    private static void handleAddCatalog() {
        System.out.println("Nhập số lượng danh mục bạn muốn thêm: ");
        int n= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin danh mục: ");
            Catalog catalog=new Catalog();
            catalog.inputData(catalogList);
            catalogList.add(catalog);
        }
        handleDisplayCatalogInfo();
        System.out.println("---------------- Nhập thành công ----------------");
    }
}
