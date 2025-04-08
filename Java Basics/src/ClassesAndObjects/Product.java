package ClassesAndObjects;

public class Product {
    //Attributes Of product class
    String name;
    int price;
    String category;
    int quality;
    boolean isOnSale;

    // Contructor to initialize product object
    public Product (String name, int price,String category, int quality){
        this.name=name;
        this.price=price;
        this.category = category;
        this.quality = quality;
    }

    public void putOnSale(){
        isOnSale = true;
    }

    public double getReturnDiscountedPrice(){
        if(isOnSale && price > 100){
            return price * 0.90;
        }
        return price;
    }

    public void printProductDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + getReturnDiscountedPrice());
        System.out.println("On Sale: " + isOnSale);
        System.out.println();
    }

    public static void main(String[] args) {

        //Creating new product

        Product product = new Product("Book", 22, "electronic", 3);
        Product product2 = new Product("Laptop", 120, "electronic", 6);
        Product product3 = new Product("TV", 50, "electronic", 10);

        product2.putOnSale();
        product3.putOnSale();

        product3.printProductDetails();
        product2.printProductDetails();
        product.printProductDetails();

    }

}





