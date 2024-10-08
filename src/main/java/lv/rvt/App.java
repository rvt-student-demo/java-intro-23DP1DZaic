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

        printTriangleTwo(4);

        christmasTree(10);


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


public static void printSpaces(int number) {
  for (int i = 0; i < number; i = i + 1) {
    System.out.print(" ");
    }
}

public static void printTriangleTwo(int size) {
for (int i = 1; i < size + 1; i++) {
printSpaces(size - i);
printStars(size - (size - i));
}

System.out.println("");
}


public static void christmasTree(int height) {
  int count = 1;
  int countStars = 1;
  


   for( int i = 1; i <= height; i++) {
      printSpaces(height-count);
      printStars(countStars);   
      count++;
      countStars += 2;
  }
  
  printSpaces(height-2);
  printStars(3);
  printSpaces(height-2);
  printStars(3);


System.out.println("");
}
}