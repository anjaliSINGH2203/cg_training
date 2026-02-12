import java.util.*;

class MoveZeros {
    public static void main(String args[]) {

        int arr[] = {1, 0, 3, 0, 5, 0, 7};
        int n = arr.length;

        int index = 0;   // position for non-zero elements

        // Move non-zero elements to front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < n) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
