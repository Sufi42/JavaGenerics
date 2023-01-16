package Generics;

public class PrintArrayUsingGenerics {
    public static <E> void printIntArray(E[] inputElements){
        for(E elements : inputElements){
            System.out.println(elements);
        }
        System.out.println();
    }
    public static <E> void toPrintDouble(E[] inputDelements){
        for( E elements : inputDelements){
            System.out.println(elements);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] input = {1,2,3,4};
        Double[] inputDelements = {1.2,1.4,1.5};

        PrintArrayUsingGenerics.printIntArray(input);
        PrintArrayUsingGenerics.toPrintDouble(inputDelements);
    }
}
