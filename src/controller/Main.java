package controller;

import model.Product;
import model.ProductFile;
import model.ProductList;

public class Main extends ProductFile {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        ProductFile productFile = new ProductFile();

        productList.addProduct(1,"SamsungGalaxyNote10","Samsung", 20000000);
        productList.addProduct(2,"IphoneXSMax", "Apple", 22000000);
        productList.addProduct(3,"VsmartJoy", "Vsmart",5000000);
        productList.addProduct(4, "SamsungA20","Samsung",12000000);
        //productList.showProductList();

        try {
            productFile.writeProductFile(productList.getProducList());
            productFile.readProductFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
