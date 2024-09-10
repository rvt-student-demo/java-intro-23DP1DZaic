package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;




public class App 
{
    public static void main( String[] args )
    {
        // My code starts here

            System.out.println("Hello World");

            // Part 1 reading input

            String vards = "Dmitrijs";
            Integer age = 17;
            Boolean isinSchool = true; 

            System.out.println(vards);
            System.out.println(age);
            System.out.println(isinSchool);
            System.out.println();


            //Part 1, 4: Variables

            String text = "contains text";
            int wholeNumber = 123;
            double floatingPoint = 3.141592653;
            boolean trueOrFalse = true;

            System.out.println("Text variable: " + text);
            System.out.println("Integer variable: " + wholeNumber);
            System.out.println("Floating-point variable: " + floatingPoint);
            System.out.println("Boolean: " + trueOrFalse);

            //

            //double pi = 3.14;
            //double pi = 3.141592653;

            //System.out.println("The value of pi is: " + pi); Izvades 3.14

            //

            int value = 10;
            System.out.println(value);
            value = 4;
            System.out.println(value);

            //

            double a = 3.14;
            double b = 22.0;
            double c = a * b * b;
            System.out.println(c);
            //1519.76

            //

            double pi = 3.14;
            double radius = 22.0;
            double surfaceArea = pi * radius * radius;
            //1519.76, more understandable

            //

            //int 7variable = 4; nav atļauts!
            //int variable7 = 4; atlļauts


            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            //Gaida liietotāja ievādi

            System.out.println("Sveiks " + input + "!");
            //Izvada tekstu un lietotāja ievadi





            




            System.out.println("Ievadiet savu vardu: ");
            String name = scanner.nextLine();

            System.out.println("Ievadiet savu uzvardu: ");
            String surname = scanner.nextLine();

            System.out.println("Ievadiet savu grupu: ");
            String group = scanner.nextLine();

            System.out.println("Students: " + name + " " + surname + ", grupa: " + group);












        // My code ends here
    }

}
