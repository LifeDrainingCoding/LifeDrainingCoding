import java.util.Scanner;
public class laba7_task2 {
    public static void main(String[] args) {
        String[] aray;
        aray = new String[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < aray.length; i++) {
            System.out.println("enter the elements of array:");
            aray[i] = sc.next();
            System.out.println("number elements of array is "+ (i+1));
        }
    }
}