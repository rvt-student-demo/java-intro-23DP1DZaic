package lv.rvt;

public class Product {

    private double price;
    private int quantity;
    private String name;
    private String location;
    private int weight;
    private String name2;



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
            this.weight = weight;
            this.location = location;
            this.name2 = name2;
            location = "shelf";
            weight = 1;

            System.out.println( name + " (" + weight + " kg) can be found from the " + location);
        }



        public Product(String name, String location) {
            this.weight = weight;
            this.location = location;
            weight = 1;
            System.out.println( name + " (" + weight + " kg) can be found from the " + location);
        }



        public Product(String name, int weight) {
            this.weight = weight;
            this.location = location;
            location = "shelf";
            System.out.println( name + " (" + weight + " kg) can be found from the " + location);

        }


    }




