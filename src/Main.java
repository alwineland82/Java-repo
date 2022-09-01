import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String x = "([{}])";
        int[] arr = new int[]{1, 2, 3};
        boolean z = isValid(x);
        System.out.println(z);
        char c = 'v';
        String b = String.valueOf(c);

    }

    static boolean isValid(String braces) {
        int counter_sq = 0;
        char prev = ' ';
        for (char i : braces.toCharArray()) {
            if (counter_sq < 0) return false;
            if (i == '[' || i == '{' || i == '(') counter_sq++;
            if (i == ']' || i == '}' || i == ')') counter_sq--;
            if ((prev == '(' && "]}".contains(String.valueOf(i)) || (prev == '[' && ")}".contains(String.valueOf(i))) || (prev == '{' && "])".contains(String.valueOf(i))))) return false;
            prev = i;
        }
        return counter_sq == 0;
    }
}