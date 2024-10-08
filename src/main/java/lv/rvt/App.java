package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;




public class App 
{
    public static void main( String[] args )
    {
    //     // // My code starts here

        Scanner scanner = new Scanner(System.in);
        printStars(5);
        printStars(3);
        printStars(9);

        printSquare(4);

        printRectangle(17, 3);

        printTriangle(4);
    }



public static void printStars(int number) {
for (int i = 0; i < number; i = i + 1) {
System.out.print("*");
}
System.out.println("");
}



public static void printSquare(int size) {
  System.out.println("");
for (int i = 0; i < size; i++) {
  printStars(4);
}
System.out.println("");
}



public static void printRectangle(int width, int height) {
for ( int i = 0; i < height; i++) {
  printStars(width);
}
System.out.println("");
}



public static void printTriangle(int size) {
for (int i = 0; i < size + 1; i++) {
  printStars(i);
}
System.out.println("");
}
}