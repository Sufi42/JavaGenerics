package Generics;

public class PrintArrayDemo {
    public static void intArray(Integer[] inputArray){
        for(Integer element : inputArray){
            System.out.print("  "+element);
        }
        System.out.println();
    }
    public static void doubleArray(Double[] inputDArray){
        for (double element : inputDArray){
            System.out.println(element);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] inputArray = {1,2,3,4,5,6,7};
        Double[] inputDArray = {1.2,1.3,1.5};

        PrintArrayDemo.intArray(inputArray);
        PrintArrayDemo.doubleArray(inputDArray);
    }



}
