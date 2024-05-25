import java.util.*;

public class Main {
    static void countChars(String str) {
        HashMap<Character, Integer> stringCount= new HashMap<>();

        for (char c : str.toCharArray()) {
            stringCount.put(c, stringCount.getOrDefault(c, 0) + 1);
        }

        System.out.println(stringCount);
    }

    public static void main(String[] args) {
        countChars("acdBCDabc"); // {a=2, B=1, b=1, c=2, C=1, d=1, D=1}
    }
}