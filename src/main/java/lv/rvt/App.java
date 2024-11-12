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



// DecreasingCounter counter = new DecreasingCounter(100);

// counter.printValue();

// counter.reset();
// counter.printValue();

// counter.decrement();
// counter.printValue();


// Person pekka = new Person("Pekka");
//         Person antti = new Person("Antti");

//         pekka.growOlder();
//         pekka.growOlder();

//         antti.growOlder();

//         System.out.println("Pekka's age: " + pekka.returnAge());
//         System.out.println("Antti's age: " + antti.returnAge());
//         int combined = pekka.returnAge() + antti.returnAge();

//         System.out.println("Pekka's and Antti's combined age " + combined + " years");








        // Person pekka = new Person("Pekka");
        // Person antti = new Person("Antti");
    
        // int i = 0;
        // while (i < 30) {
        //     pekka.growOlder();
        //     i = i + 1;
        // }
    
        // antti.growOlder();
    
        // System.out.println("");
    
        // if (antti.isOfLegalAge()) {
        //     System.out.print("of legal age: ");
        //     antti.printPerson();
        // } else {
        //     System.out.print("underage: ");
        //     antti.printPerson();
        // }
    
        // if (pekka.isOfLegalAge()) {
        //     System.out.print("of legal age: ");
        //     pekka.printPerson();
        // } else {
        //     System.out.print("underage: ");
        //     pekka.printPerson();
        // }






        // System.out.println(antti); // same as System.out.println(antti.toString());
        // System.out.println(pekka); // same as System.out.println(pekka.toString());



        // Animal animal1 = new Animal("cat");
        // Animal animal2 = new Animal("dog");


        //     System.out.println(
        //         animal1
        //     );

        //     System.out.println(
        //         animal2
        //     );



        //     String animalString = animal1.toString();



            // Agent bond = new Agent("James", "Bond");
            
            // System.out.println(bond);





            // Person matti = new Person("Matti");
            // Person juhana = new Person("Juhana");
            // Person dima = new Person("Dima");
        
            // matti.setHeight(180);
            // matti.setWeight(86);
            // dima.setWeight(60);

            // juhana.setHeight(175);
            // juhana.setWeight(64);
            // dima.setHeight(180);
        
            // System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
            // System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
            // System.out.println(dima.getName() + ", body mass index is " + dima.bodyMassIndex());



            // Statistics statistics = new Statistics();
            // statistics.addNumber(3);
            // statistics.addNumber(5);
            // statistics.addNumber(1);
            // statistics.addNumber(2);
            // System.out.println("Count: " + statistics.getCount());
            // System.out.println("Sum: " + statistics.sum());
            // System.out.println("Average: " + statistics.average());



            // PaymentCard card = new PaymentCard(50);
            // System.out.println(card.toString());


            // card.eatAffordably();
            // System.out.println(card);
    

            // card.eatHeartily();
            // card.eatAffordably();
            // System.out.println(card);


//  PaymentCard card2 = new PaymentCard(5);
//         System.out.println(card2);

//         card2.eatHeartily();
//         System.out.println(card2);

//         card2.eatHeartily();
//         System.out.println(card2);


        PaymentCard card3 = new PaymentCard(10);
        System.out.println(card3);

        card3.addMoney(15);
        System.out.println(card3);

        card3.addMoney(10);
        System.out.println(card3);

        card3.addMoney(200);
        System.out.println(card3);



    }
}