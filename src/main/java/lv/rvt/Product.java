package lv.rvt;

public class Product {

    private double price;
    private int quantity;
    private String name;
    private String location;
    private int weight;



    // Automatically created constructor method
    // by Java



//Constructor
    public Product (String initialName, double initialPrice, int initialQuantity) {

        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }


        public void printProduct() {
            // Banana, price 1.1, 13 pcs
            System.out.println(
                this.name + ", price " + this.price + ", " + this.quantity + " pcs"
            );
        }



        public Product(String name) {
            System.out.println("Tape measure (" + weight+1 + ") can be found from the" + location);
        }



        public Product(String name, String location) {

        }



        public Product(String name, int weight) {

        }


    }




