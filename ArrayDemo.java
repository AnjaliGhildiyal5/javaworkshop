import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args){
        int[] numbers = {4, 2, 4,82, 45};

        System.out.print("Array contents: ");
        for (int i =0; i< numbers.length; i++) {
            System.out.print(numbers[i] +" ");

        }

        int key = 3;
        int index = Arrays.binarySearch(numbers,key);

        if (index>0) {
            System.out.println("Element found at index" + index);
        } else {
            System.out.println("Element not found");
        }

       
    }
}