package java;
import java.util.Scanner;
public class ifExample2 {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int n= j.nextInt();
        int [] date = new int[n];

        for(int i=0; i<n; i++)
            date[i]=j.nextInt();
        j.close();
    }
}
