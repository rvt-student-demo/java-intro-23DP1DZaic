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
ArrayList<Integer> num = new ArrayList<>();

System.out.println("Enter numbers (enter -1 to stop):");
while (true) {
    int input = scanner.nextInt();
    if (input == -1) {
        break;
    }

num.add(input);
    }
        
        
System.out.println("From where?");
int startIndex = scanner.nextInt();
System.out.println("To where?");
int endIndex = scanner.nextInt();
        
        
 System.out.println("Numbers in the range:");
 for (int i = startIndex; i <= endIndex; i++) {
     System.out.println(num.get(i));
        }
        }

}
