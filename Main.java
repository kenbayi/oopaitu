import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 1;
        for(double i = 1; i <= n; i++){
            sum *= 1 + 1/(i*i);
        }
        System.out.println(sum);
        sc.close();
    }
}