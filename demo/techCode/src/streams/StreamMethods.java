package streams;

import java.util.ArrayList;
import java.util.List;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamMethods {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        List<Product> list = productsList.stream()  
                             .filter(product -> product.price == 30000)  
                             .toList();    
        
        int[] []a,b= new int[2][8] ;
        a[0][0]= 9;
        System.out.println();
    }  
}  
