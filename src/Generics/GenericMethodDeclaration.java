package Generics;

public class GenericMethodDeclaration <T>{
    private T[] inputArray;

    GenericMethodDeclaration(T[] inputArray){
        this.inputArray = inputArray;
    }
    public void toPrint(){
        GenericMethodDeclaration.toPrint(this.inputArray);
    }
    public static <E> void toPrint(E[] input){
        for(E ele : input){
            System.out.println(ele);
        }

    }

    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5};

        GenericMethodDeclaration.toPrint(input);
    }
}
