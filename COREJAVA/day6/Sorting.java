import java.util.*;

class Sorting {

    public static int[] ascendingOrder(int arr[]) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the values: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ascendingOrder(arr);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
