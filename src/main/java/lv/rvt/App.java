package lv.rvt; 
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader; 
import java.util.*;

import javax.sound.midi.Soundbank; 
 
public class App { 
    public static void main(String[] args) throws Exception {

    //     SimpleDate date1 = new SimpleDate(0, 0, 0);
    //     SimpleDate date2 = new SimpleDate(0, 0, 0);

    //     //SimpleDate date3 = new SimpleDate();


    //     Person person = new Person("Jack");

    //     System.out.println(
    //         date1.equals(person)
    //     );



    //     System.out.println(date1.equals(date2));



    //     PaymentTerminal unicafeExactum = new PaymentTerminal();

    //     double change = unicafeExactum.eatAffordably(10);
    //     System.out.println("remaining change: " + change);

    //     PaymentCard annesCard = new PaymentCard(7);

    //     boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
    //     System.out.println("there was enough money: " + wasSuccessful);
    //     wasSuccessful = unicafeExactum.eatHeartily(annesCard);
    //     System.out.println("there was enough money: " + wasSuccessful);
    //     wasSuccessful = unicafeExactum.eatAffordably(annesCard);
    //     System.out.println("there was enough money: " + wasSuccessful);

    //     System.out.println(unicafeExactum);
    // }
    // public static void modify(Person person) {
    //     person.setName("Modified!");
    // }

    // public static void modify(int value){
    //     value += 5;
    // }




    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
    Apartment RigaTwoBedroomApt = new Apartment(2, 45, 2925);


    System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
    System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true

    System.out.println();

    System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
    System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

System.out.println();

    System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
    System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
    System.out.println(RigaTwoBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // false



}
}