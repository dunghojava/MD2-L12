package ArrayLish_LinkedList_JavaCollectionFramework;

import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> productArrayList = new ArrayList<>();

    public ProductManager(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    public void showProduct() {
        for (int i = 0; i < this.productArrayList.size(); i++) {
            System.out.println(this.productArrayList.get(i));
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < this.productArrayList.size(); i++) {
            if (this.productArrayList.get(i).getId() == id) {
                this.productArrayList.remove(i);
                showProduct();
            }
        }
    }

    public void changeProduct(Product product, ArrayList<Product> productArrayList,int id,String name,int price) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i)==product) {
                product = new Product(id, name, price);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(new Product(1,"apple",1000));
        productArrayList.add(new Product(2,"banana",3000));
        productArrayList.add(new Product(3,"cherry",2000));
        System.out.println(productArrayList);
        System.out.println("============================");

        ProductManager productManager = new ProductManager(productArrayList);
        productManager.addProduct(new Product(4,"berry", 9000));
        productManager.showProduct();
        System.out.println("========================");
        productManager.removeProduct(2);

    }
}
