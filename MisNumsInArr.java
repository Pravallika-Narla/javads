import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MisNumsInArr {
    public static void main(String[] args) {
      
        int[] arr = {12, 42, 36, 54, 67, 82, 10, 11, 16};
        System.out.println("MisNumsInArr: " + misNums(arr));
    }

    public static String misNums(int[] arrNumbers) {
        Arrays.sort(arrNumbers);

        List<Integer> missingNumbers = new ArrayList<>();
        int minimum = arrNumbers[0];
        int maximum= arrNumbers[arrNumbers.length - 1];

        for (int j = minimum + 1; j < maximum; j++) {
            boolean found = false;
            for (int num : arrNumbers) {
                if (num == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(j);
            }
        }

        StringBuilder res = new StringBuilder();
        for (int j = 0; j < missingNumbers.size(); j++) {
            res.append(missingNumbers.get(j));
            if (j < missingNumbers.size() - 1) {
                res.append(", ");
            }
        }

        return res.toString();
    }
}


