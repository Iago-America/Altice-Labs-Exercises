import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void ordenaArrayInteiros(byte[] nums) {
        int[] intValues = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intValues[i] = nums[i];
        }

        Arrays.sort(intValues);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (byte) intValues[i];
        }

    }

    public static void main(String[] args) {

        String str = "byte array size example";
        byte values[] = str.getBytes();
        for (int i = 0; i < values.length; i++) System.out.print(values[i] + " ");
        System.out.println();
        ordenaArrayInteiros(values);
        for (int i = 0; i < values.length; i++) System.out.print(values[i] + " ");
    }
}