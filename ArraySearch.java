import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("Enter the search element: ");
        int search = input.nextInt();
        
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                index = i+1;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + index + " in the array.");
        }
    }
}
