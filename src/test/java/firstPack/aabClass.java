package firstPack;

public class aabClass {
    public static void main(String [] args){
        int myInt, mass;
        myInt = 587;
        mass = 1;
        System.out.println(myInt);
        System.out.println(mass);

        long myLong = 546573;
        short myShort = 32000;

        double myDouble = 3452.445999;
        float myFloat = 34354.0315f; // shows one or two digits after comma //
        float resFloat;
        double resDouble;

        char myChar = 'a';
        boolean b = true;

        byte myByte = 100; // -128 - 128;

        resFloat = myLong + myFloat;
        System.out.println(resFloat);

        resDouble = myLong + myDouble;
        System.out.println(resDouble);

    }
}
