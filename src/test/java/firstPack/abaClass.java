package firstPack;


import java.util.Scanner;

public class abaClass {
    public static void main(String[] args){
        // String string = new String("dnbdfn"); //
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of cycles for the experiment");
        int i = s.nextInt();
        long e=1;
        for (int v=0; v<i; v++){
            e=e*2;
        }
        System.out.println("2^"+i+"="+e);
    }
}
