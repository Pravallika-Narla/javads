import java.util.HashMap;
import java.util.Map;

public class SocksCount {

    public static void main(String[] args) {
        int[] arrNumbers = {70, 60, 60, 70, 70, 40, 90, 70, 20};
        int SocksCount = countSocks(arrNumbers);
        System.out.println("Count of socks = " + SocksCount);
    }

    public static int countSocks(int[] num) {
        Map<Integer, Integer> sockCounts = new HashMap<>();

        // Count the occurrence 
        for (int socks : num) {
            sockCounts.put(socks, sockCounts.getOrDefault(socks, 0) + 1);
        }

        int SocksCount = 0;

        // Finding count of socks
        for (int count : sockCounts.values()) {
            if (count % 2 != 0) {
                SocksCount++;
            }
        }

        return SocksCount;
    }
}
