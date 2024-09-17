package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;




public class App 
{
    public static void main( String[] args )
    {
        // // My code starts here

        //     System.out.println("Hello World");

        //     // Part 1 reading input

        //     String vards = "Dmitrijs";
        //     Integer age = 17;
        //     Boolean isinSchool = true; 

        //     System.out.println(vards);
        //     System.out.println(age);
        //     System.out.println(isinSchool);
        //     System.out.println();


        //     //Part 1, 4: Variables

        //     String text = "contains text";
        //     int wholeNumber = 123;
        //     double floatingPoint = 3.141592653;
        //     boolean trueOrFalse = true;

        //     System.out.println("Text variable: " + text);
        //     System.out.println("Integer variable: " + wholeNumber);
        //     System.out.println("Floating-point variable: " + floatingPoint);
        //     System.out.println("Boolean: " + trueOrFalse);

        //     //

        //     //double pi = 3.14;
        //     //double pi = 3.141592653;

        //     //System.out.println("The value of pi is: " + pi); Izvades 3.14

        //     //

        //     int value = 10;
        //     System.out.println(value);
        //     value = 4;
        //     System.out.println(value);

        //     //

        //     double a = 3.14;
        //     double b = 22.0;
        //     double c = a * b * b;
        //     System.out.println(c);
        //     //1519.76

        //     //

        //     double pi = 3.14;
        //     double radius = 22.0;
        //     double surfaceArea = pi * radius * radius;
        //     //1519.76, more understandable

        //     //

        //     //int 7variable = 4; nav atļauts!
        //     //int variable7 = 4; atlļauts


        //     Scanner scanner = new Scanner(System.in);

        //     String input = scanner.nextLine();
        //     //Gaida liietotāja ievādi

        //     System.out.println("Sveiks " + input + "!");
        //     //Izvada tekstu un lietotāja ievadi










        //     System.out.println("Ievadiet savu vardu: ");
        //     String name = scanner.nextLine();

        //     System.out.println("Ievadiet savu uzvardu: ");
        //     String surname = scanner.nextLine();

        //     System.out.println("Ievadiet savu grupu: ");
        //     String group = scanner.nextLine();

        //     System.out.println("Students: " + name + " " + surname + ", grupa: " + group);



        Scanner scanner = new Scanner(System.in);
        // 70
          //String input = scanner.nextLine();
        // Sāņemam ievadi ka string vērtibu

          //int inputAsInt = Integer.valueOf(input);
        //Veidojam int tipa mainīgo, konvertējam input uz int data tipu

          //System.out.println("Rezultāts: " + inputAsInt * 10);


        // System.out.println("Ievadiet 1. ciparu:");
        // String number1 = scanner.nextLine();
        // int number1AsInt = Integer.valueOf(number1);
        
        // System.out.println("Ievadiet 2. ciparu:");
        // String number2 = scanner.nextLine();
        // int number2AsInt = Integer.valueOf(number2);

        // System.out.println("Rezultāts: " + number1AsInt * number2AsInt);


        // int skaitlis = Integer.valueOf(scanner.nextLine());

        // System.out.println(skaitlis * 10);



        // Double skaitlis2 = Double.valueOf(scanner.nextLine());

        // System.out.println(skaitlis2 * 10);
        




// String userInput = scanner.nextLine();

// int userInputAsInt = Integer.valueOf(userInput);

// System.out.println(userInputAsInt);




// // int cipars1 = Integer.valueOf(scanner.nextLine());
// // int cipars2 = Integer.valueOf(scanner.nextLine());
// // int cipars3 = Integer.valueOf(scanner.nextLine());


// // System.out.println("summa: " + (cipars1 + cipars2 + cipars3));
// // System.out.println("reizināšana: " + cipars1 * cipars2 * cipars3);
// // System.out.println("videjais aritmetiskais: " + (cipars1 + cipars2 + cipars3) /  3);






// int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
// System.out.println(calculationWithParentheses); // prints 23


// int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
// System.out.println(calculationWithParentheses); // prints 23



// int x = 10;
// x += 10;

// System.out.println(x);
// x++; //Lai pieskaitīt viens (20 + 1)




// int first = 3;
// int second = 2;
// double result = first / second;
// System.out.println(result); //prints 1




// //pareizi
// double first3 = 3.0;
// int second3 = 2;
// double result6 = first3 / second3;
// System.out.println(result6); //prints 1






// double whenDividendIsFloat = 3.0 / 2;
// System.out.println(whenDividendIsFloat); // prints 1.5

// double whenDivisorIsFloat = 3 / 2.0;
// System.out.println(whenDivisorIsFloat); // prints 1.5






// int first2 = 3;
// int second2 = 2;

// double result1 = (double) first2 / second2;
// System.out.println(result1); // prints 1.5

// double result2 = first2 / (double) second2;
// System.out.println(result2); // prints 1.5

// double result3 = (double) (first2 / second2);
// System.out.println(result3); // prints 1.0






// int sum = 3;
// int digitCount = 2;

// double result4 = sum / (double) digitCount;


// //vispirms 3/2 = 1, tad double -> 1.0
// double result5 = (double) (sum / digitCount);
// System.out.println(result5);


// // var arī tā
// // double result5 = 1.0 * (sum / digitCount);







// System.out.println("Give speed: ");
// String speed = scanner.nextLine();
// int speedAsInt = Integer.valueOf(speed);

// if (speedAsInt > 120) {
//   System.out.println("Speeding ticket!");
// }





// int number = 3;

// if (number == 1) {
//     System.out.println("The number is one"); //skip line, jo number != 1
// } else if (number == 2) {
//     System.out.println("The given number is two"); //skip line, jo number != 1
// } else if (number == 3) {
//     System.out.println("The number must be three!"); //no skip, number = 1
// } else {
//     System.out.println("Something else!");
// }


// System.out.println("Give me the first number: ");
// String number1 = scanner.nextLine();
// int number1AsInt = Integer.valueOf(number1);


// System.out.println("Give me the second number: ");
// String number2 = scanner.nextLine();
// int number2AsInt = Integer.valueOf(number2);


// if (number1AsInt > number2AsInt) {
//   System.out.println("Greater number is: " + number1AsInt );
// } else if (number1AsInt < number2AsInt) {
//   System.out.println("Greater number is: " + number2AsInt );
// } else {
//   System.out.println("The numbers are equal!");
// }




// int number = 5;

// if (number == 0) {
//     System.out.println("The number is zero.");
// } else if (number > 0) {
//     System.out.println("The number is greater than zero.");
// } else if (number > 2) {
//     System.out.println("The number is greater than two.");
// } else {
//     System.out.println("The number is less than zero.");
// }


// OUTPUT:   The number is greater than zero.


// The example above prints the string "The number is greater than zero." even if the condition number > 2 is true.
//  The comparison stops at the first condition that evaluates to true.




// Logical and -> &&
// Logical or -> ||
// Logical not -> !

// if (!(number > 10))     ja NAV number lielāks par 10 



System.out.println("Give points [0-100]: ");
String grade = scanner.nextLine();
int gradeInt = Integer.valueOf(grade);


if (gradeInt < 0) {
  System.out.println("Impossible!");
} else if (gradeInt > 0 && gradeInt < 49) {
  System.out.println("Failed!");
} else if (gradeInt > 50 && gradeInt < 59) {
  System.out.println("1");
} else if (gradeInt > 60 && gradeInt < 69) {
    System.out.println("2");
} else if (gradeInt > 70 && gradeInt < 79) {
  System.out.println("3");
} else if (gradeInt > 80 && gradeInt < 89) {
  System.out.println("4");
} else if (gradeInt > 90 && gradeInt < 100) {
  System.out.println("5");
} else {
  System.out.println("Incredible!");
}























































        // My code ends here
    }

}