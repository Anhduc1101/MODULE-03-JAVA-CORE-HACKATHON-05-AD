package ra.bussiness;

import ra.bussinessImp.Catalog;

import java.util.List;

public interface IShop {
    float RATE=1.3F;
    void inputData(List<Catalog> catalogList);
    void displayData();

}
