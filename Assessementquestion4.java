//Write a Java program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;
public class Assessementquestion4{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(n + " * "+i+ " = "+ n *i);
        }

    }
}