package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.ArrayList;




public class App 
{
    public static void main( String[] args )
    {
    //  My code starts here
Scanner scanner = new Scanner(System.in);


//     Product product1 = new Product("Maize", 1.20, 13);
//     Product product2 = new Product("Piens", 1.10, 16);
//     Product product3 = new Product("Siers", 2.40, 9);

// product1.printProduct();
// product2.printProduct();
// product3.printProduct();



// Person pers1 = new Person("John");

// pers1.printPerson();
// pers1.growOlder();
// pers1.growOlder();
// pers1.growOlder();


// pers1.printPerson();

// int i = 0;
// while ( i != 30) {
// pers1.growOlder();
// pers1.printPerson();
// i = i + 1;
// }



DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();




        
    }
}