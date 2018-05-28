package firstPack;

public class abdClass {
    public static void main(String[] args) {
        int i = 0, e = 1;
        while (true) {
            if (i <= 32) {
                // break;
                i++;
                System.out.println("  " + i);
                e = e * 2;
                int r = e - 1;
                System.out.println("2^     = " + e + " - 1 = " + r);
                System.out.println();


            } else{
                break;
            }

        }
    }

}
