package firstPack;

// While //

public class aadClass {
    public static void main(String[] args) {
        System.out.println("Simulation started");
        int value = 0;
        while(value<10){
            System.out.println("Cycle #"+value);
            value = value+1;
        }
        System.out.println("Simulation finished with "+value+" cycles");
    }
}
