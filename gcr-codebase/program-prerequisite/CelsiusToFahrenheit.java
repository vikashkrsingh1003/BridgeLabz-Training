import java.util.*;

class CelsiusToFahrenheit {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Fahrenheit is : " + fahrenheit);
    }
}
