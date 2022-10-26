import java.util.Arrays;
import java.util.Collections;

public class laba7_task1 {
    public static void main(String[] args) {
        String[] aray;
        aray = new String[]{"a", "b", "c", "d"};
        Collections.reverse(Arrays.asList(aray));
        System.out.println(aray[0] + aray[1] + aray[2] + aray[3]);
    }
}
