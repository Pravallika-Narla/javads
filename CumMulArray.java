import java.util.Arrays;

public class CumMulArray {
    public static void main(String[] args) {
        int[] arrNumbers = {6, 5, 4, 2, 0, 9};
        calCumMul(arrNumbers);
        System.out.println("arrNum = " + Arrays.toString(arrNumbers));
    }

    public static void calCumMul(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            try {

                if (arr[k] != 0) {
                    arr[k] = arr[k - 1] * arr[k];
                } else {

                    for (int i = k; i < arr.length; i++) {
                        arr[i] = 0;
                    }
                    break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds exception occurred!");
                // Handle the exception 
            }
        }
    }
}


