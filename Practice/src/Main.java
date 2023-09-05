//public class Main{
//    public static void main(String[] args){
        // Code for printing a hello world on screen
//        System.out.println("Hello World");
//        System.out.print("Hello Yash");


    // Variables
//        String name = "Yash";
//        int age = 30;
//        String cpy = name;
//
//        System.out.println(age);


//    byte - 1[-128 to 127]
//    short 2;
//    int - 4,1,2,3;
//    long - 8
//    float - 4 3.14
//    double - 8
//    char - 2 a,b,c,d
//    boolean - 1 true/false


//      byte age = 12;
//      int phone = 123456789;
//      long phone2 = 123456789000L;
//      float pi = 3.14F;
//      char letter = '@';
//      boolean isAdult = false;
//    }
//}


// Casting in JAVA
//import java.util.*;
//public class Main{
//public static void main(String[] args) {
//    double price = 100.00;
//    double finalprice = price + 18;
//    System.out.println(finalprice);
//
//    int p = 100;
//    int fp = p + (int)18.99;
//    System.out.println(fp);
//}
//}



// Constants in JAVA
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        final float pi = 3.14F;
//        pi = 2.14; // gives an error
//    }
//}



// Using Maths class
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        System.out.println(Math.max(5.1,5.2));
//        System.out.println(Math.min(5.1,5.2));
//        System.out.println((int)(Math.random()*100));
//    }
//}



// Code for taking input in JAVA
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your age: ");
//        int age = sc.nextInt(); // replace int with float, byte, long, boolean;
//        System.out.println(age);

//        System.out.println("Input your name: ");
//        String name = sc.next(); // This function is used for input a string as a token
//        System.out.println(name);

//        System.out.println("Input your name: ");
//        String name1 = sc.nextLine(); // This function is used for input a string as a line
//        System.out.println(name1);
//    }
//}



// Conditonal Statements
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        boolean issumup = true;
//        if(issumup == true){  //true/false
//            System.out.println("DAY");
//        }
//
//        else{
//            System.out.println("NIGHT");
//        }
//    }
//}



// Logical Operators
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        int a = 20;
//        int b = 30;
//
//        if (a < 50 && b < 50) { // ||, !
//            System.out.println("Both are less than 50");
//        }
//    }
//}




// Conditional Statement - Switch Case
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        int day = 2;
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            default:
//                System.out.println("Wednesday - Sunday");
//                break;
//        }
//    }
//}



// Loops
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
        // for loop
//        for(int i=1; i<=100; i++){
//            System.out.println(i);
//        }

        // while loop
//        int i=1;
//        while(i<=100) {
//            System.out.println(i);
//            i++;
//        }

        // do while loop
//        int k = 1;
//        do {
//            System.out.println(k);
//            k++;
//        }while (k<=100);

//    }
//}



// Exceptional Handling - Try and Catch
//import java.util.*;
//public class Main{
//    public static void main(String[] args) {
//        int[] marks={34, 56, 78};
//        try {
//            System.out.println(marks[5]);
//        } catch (Exception exception){
//            // do something after catching
//            System.out.println(marks[2]);
//        }
//
//        System.out.println("The student name is sanskriti");
//    }
//}




//import java.util.*;
//public class Main{
//    public static void printjava(){
//        System.out.println("Print Java");
//    }
//
//    public static void printname(String name){
//        System.out.println(name);
//    }
//
//    public static void printnum(int a, int b){
//        int sum = a+b;
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        printjava();
//        printjava();
//
//        printname("Yash");
//
//        printnum(3,5);
//    }
//}








// Mini Project
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)Math.random()*100;
        int usernumber;
        do{
            System.out.println("Guess my number");
            usernumber = sc.nextInt();
            if(usernumber == number){
                System.out.println("WHOO.... CORRECT NUMBER");
                break;
            }

            else if (usernumber>number) {
                System.out.println("Your number is too large");
            }

            else {
                System.out.println("Your number is too small");
            }
        } while (usernumber>=0);

        System.out.println("My number was");
        System.out.println(number);
    }
}