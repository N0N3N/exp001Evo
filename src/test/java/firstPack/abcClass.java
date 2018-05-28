package firstPack;

import java.util.Scanner;

public class abcClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int value;
        do{
            System.out.println("Enter 1024");
            value = scan.nextInt();
        } while(value!=1024);

        System.out.println("1024 confirmed");
    }
}
