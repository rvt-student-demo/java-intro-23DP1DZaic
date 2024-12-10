package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.ArrayList;




public class App 
{

    public static void main( String[] args, Person person) throws Exception{
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;

        while (isProgramRunning) {
            String command = scanner.nextLine();

                if (command.equals("exit")) {
                    System.out.println("Thanks, bye bye!");
                    isProgramRunning = false;
                } else if (command.equals("show")) {
                    System.out.printf("--------------------------------------------------");
                    System.out.printf("| Name | Age | Weight | Height | Body mass index |");
                    System.out.printf("| Jack | 12  |");
                    System.out.printf("| Jack | 12  |");
                    System.out.printf("| Jack | 12  |");
                    System.out.printf("| Jack | 12  |");
                    System.out.printf("--------------------------------------------------");

                    //Show persons using person manager
            }
        }
        // System.out.println("Your command was: " + command);






        PaymentCard petesCard = new PaymentCard(10);
        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());






//-------------------------





            // while (true) {
            //     System.out.println("Hello, choose your command");
            //     System.out.println("show - shows all persons");
            //     System.out.println("add - add a person");
            //     System.out.println("exit - exit the program");
            //     System.out.println("help - see available command");


            //     //Izveidot iespēju lietotājam izvēlēties komandu kuru izpildīt

            //     if (command.equals("show")) {
            //         ArrayList<Person> persons = PersonManager.getPersonList();
            //         for (Person person2 : persons) {
            //             System.out.println(person);
            //         }
            //     }



            //     else if (command.equals("add")) {
            //     System.out.println("Please enter name: ");
            //     String name = scanner.nextLine();
            //     System.out.println("Please enter age: ");
            //     int age = Integer.valueOf(scanner.nextLine());
            //     System.out.println("Please enter weight: ");
            //     int weight = Integer.valueOf(scanner.nextLine());
            //     System.out.println("Please enter height: ");
            //     int height = Integer.valueOf(scanner.nextLine());
            // }






            //     else if (command.equals("help")) {
            //         System.out.println("Hello, choose your command");
            //         System.out.println("show - shows all persons");
            //         System.out.println("add - add a person");
            //         System.out.println("exit - exit the program");
            //         System.out.println("help - see available command");
            //     }




//------------------------------






                // PersonManager.addPerson(person);
                // }
                // public static void modify(Person person) {
                // person.setName("Modified!");
                // }
        
                // helper.getWriter("persons.csv", StandardOpenOption.APPEND);
        

                




        
        //   Person person = new Person(name, age, weight, height);
                // PersonManager.addPerson(person);

            
            //    Person person = new Person("Andrew", 17, 69, 182);
            }

    //  My code starts here


// BufferedReader reader = Utils.getReader("persons.csv");

// ArrayList<Person> persons = new ArrayList<>();

//1. Pievienot Person klassei setAge() metodi, lai piemērot vērtību personas vecumam

//2. Izlastīt persons.csv failu
//3. Un aizpildīt persons masīvu ar Person klases objektiem

//4. Ar for-each ciklu printēt ar Person klases objektiem

//5. Izvadīt vidējo personu vēcumu


//line.split(", ");
//String[] parts = {"name", "age", "weight", "height"};

// Person pers1 = new Person(parts[0], parts[1], parts[2], parts[3]);
// // persons.add(pers1);

// //Ignore first line of csv
// reader.readLine();
// while ((line = reader.readLine()) != null) {
    
//     //Izveido Person objektu in ievieto
//     //ArrayList masīvā šeit
// }
// reader.close();



// while ((line = reader.readLine()) != null) {
//     System.out.println(line);
// }







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


        // PaymentCard card3 = new PaymentCard(10);
        // System.out.println(card3);

        // card3.addMoney(15);
        // System.out.println(card3);

        // card3.addMoney(10);
        // System.out.println(card3);

        // card3.addMoney(200);
        // System.out.println(card3);



        // PaymentCard card4 = new PaymentCard(10);
        // System.out.println("Paul: " + card4);
        // card4.addMoney(-15);
        // System.out.println("Paul: " + card4);



        // PaymentCard Paul = new PaymentCard(20);
        // PaymentCard Matt = new PaymentCard(30);
        // Paul.eatHeartily();
        // Matt.eatAffordably();
        // System.out.println("Paul: " + Paul);
        // System.out.println("Matt: " + Matt);
        // Paul.addMoney(20);
        // Matt.eatHeartily();
        // System.out.println("Paul: " + Paul);
        // System.out.println("Matt: " + Matt);
        // Paul.eatAffordably();
        // Paul.eatAffordably();
        // Matt.addMoney(50);
        // System.out.println("Paul: " + Paul);
        // System.out.println("Matt: " + Matt);




    // System.out.println(reader.readLine());
    // System.out.println(reader.readLine());
    // System.out.println(reader.readLine());




// Neprintēt kolonnu virsrakstus
// Ouput: Id: <id>; username: <usrnm>; password: <pwd>
// println() print()




// Product tapeMeasure = new Product("Tape measure");
// Product plaster = new Product("Plaster", "home improvement section");
// Product tyre = new Product("Tyre", 5);

// System.out.println(tapeMeasure);
// System.out.println(plaster);
// System.out.println(tyre);

// Counter counter2 = new Counter(40);

// counter2.printValue();


// counter2.decrease();
// counter2.decrease();
// counter2.decrease();
// counter2.printValue();







// System.out.println("Hello World");

// int number = 56;
// String name =  "enter your name: ";
// String userName = scanner.nextLine();

// System.out.println("Your name is " + userName);








    // BufferedReader reader = helper.getReader("persons.csv");

    // String row1 = reader.readLine();

    // String row2 = reader.readLine();

    // System.out.println(row1);
    // System.out.println(row2);










    // reader.readLine();
    // reader.readLine();
    // //

    // String line2;
    // reader.readLine(); //title row - mēs ignorējam pirmo rindu

    // while ((line2 = reader.readLine()) != null) {
    //     System.out.println(line2);


    // String[] parts = line2.split(", ");
    
    // System.out.println("Name: " + parts[0] + ", age" + parts[1]);





    // Kā uzzināt visu personu videjo vēcumu no dota csv faila ?

    // int ageSum = 0;
    // int ageCount = 0;

    // ageSum += Integer.valueOf(parts[1]);
    // ageCount ++ ;

    // System.out.println(1.0 * ageSum / ageCount);

}








