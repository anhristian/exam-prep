package academy.learnprogramming;

public class WrapperType {

    public static void main(String[] args) {
        int myInt = 10;
        Integer myInteger = new Integer(10);
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null;

        System.out.println("myInteger=" + myInteger);
        System.out.println("myInteger2=" + myInteger2);
        System.out.println("myInteger3=" + myInteger3);
        System.out.println("myInteger4=" + myInteger4);
        System.out.println("myInteger5=" + myInteger5);

        // converting wrapper to primitive  -> unboxing
        int myInt3 = myInteger3; // unboxing
        //int myInt4 = myInteger5 // throw null pointer exception because myInteger5 is set to null

        //boxing -> converting primitive to wrapper
        Integer myInteger6 = new Integer(10);
        Integer myInteger7 = myInt;


        printSum(1,5); //autoboxing
        printSum(myInteger,myInteger2); //is not autoboxing
    }
    private static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum=" + sum);

    }
}
