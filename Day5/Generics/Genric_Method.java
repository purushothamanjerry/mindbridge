package day4;

public class genric_method {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World", "Java"};
        System.out.print("String array: ");
        printArray(stringArray);

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer array: ");
        printArray(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.print("Double array: ");
        printArray(doubleArray);
    }
}
