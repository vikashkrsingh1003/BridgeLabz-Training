import java.util.*;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double radius = sc.nextDouble();

        double area = 3.14 * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);
      
    }
}

