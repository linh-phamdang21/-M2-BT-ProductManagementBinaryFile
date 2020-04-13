package model;

import java.io.*;
import java.util.ArrayList;

public class ProductFile extends ProductList {
    private static String productFilePath = "ProducFile.txt";

    public ProductFile() {

    }

    public void readProductFile() throws Exception {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(productFilePath);
            objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList resultList = (ArrayList) objectInputStream.readObject();
            for (Object product : resultList) {
                System.out.println(product);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null){
                    objectInputStream.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void writeProductFile(ArrayList<Product> productList) {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutput = null;
        try {
            fileOutputStream = new FileOutputStream(productFilePath);
            objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(productList);
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                if (objectOutput != null){
                    objectOutput.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
