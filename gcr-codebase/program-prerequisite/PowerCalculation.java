import java.util.*;

class PowerCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        int exponent = sc.nextInt();

        double res = Math.pow(base, exponent);

        System.out.println(res);
       
    }
}