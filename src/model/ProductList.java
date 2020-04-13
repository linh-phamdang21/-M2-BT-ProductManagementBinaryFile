package model;

import java.util.*;

public class ProductList extends Product {
    ArrayList<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList getProducList(){
        return productList;
    }

    public void addProduct(int id, String name, String brand, int price){
        Product product = new Product(id, name, brand, price);
        productList.add(product);
    }

    public void editProducts(int ID){
        for (int i = 0; i < productList.size(); i++){
            Product product = (Product) productList.get(i);
            if (product.getID() == ID){
                System.out.println("Edit Product's ID: " + product.getID() + " Information");
                System.out.println("Product's Name: ");
                String name = scanner.nextLine();
                System.out.println("Product's Brand: ");
                String brand = scanner.nextLine();
                System.out.println("Product's Price: ");
                int price = scanner.nextInt();
                product.editProduct(name, brand, price);
            }
        }
    }

    public void deleteProoduct(int id){
        for (int i = 0; i < productList.size(); i++){
            Product product = (Product) productList.get(i);
            if (product.getID() == id){
                productList.remove(i+1);
                System.out.println("Product Deleted");
            } else {
                System.out.println("Product not found");
            }
        }
    }

    public void showProductList(){
        for (int i = 0; i < productList.size(); i++){
            Product product = (Product) productList.get(i);
            System.out.println(product.toString());
        }
        System.out.println();
    }
    public void searchByID(int id){
        for (int i = 0; i < productList.size(); i++){
            Product product = (Product) productList.get(i);
            if (product.getID() == id){
                System.out.println(product.toString());
                break;
            }
        }
        System.out.println();
    }

    public void searchByName(String name){
        for (int i = 0; i < productList.size(); i++){
            Product product = (Product) productList.get(i);
            if (product.getName() == name){
                System.out.println(product.toString());
                break;
            }
        }
        System.out.println();
    }

    public void searchByBrand(String brand){
        for (int i = 0; i < productList.size(); i++){
            Product product = (Product) productList.get(i);
            if (product.getBrand() == brand){
                System.out.println(product.toString());
            }
        }
        System.out.println();
    }

    public void searchByPrice(int price){
        for (int i = 0; i < productList.size(); i++){
            Product product = (Product) productList.get(i);
            if (product.getPrice() == price){
                System.out.println(product.toString());
            }
        }
        System.out.println();
    }

    public void sortByID (){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (o1.getID() - o2.getID());
            }
        });
    }

    public void sortByName (){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortByBrand (){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
    }

    public void sortByPrice (){
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
        });
    }
}
