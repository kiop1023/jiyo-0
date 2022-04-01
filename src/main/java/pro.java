import java.util.Scanner;
public class pro {
    public static void main(String[] args) {
        System.out.println("hmzl");

        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a+b);






        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i=" + i);
            for (int j = i; j < 3; j++) {
                System.out.println("j=" + j);
            }
        }
    }
}
