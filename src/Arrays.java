import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}