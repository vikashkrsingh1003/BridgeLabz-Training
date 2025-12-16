import java.util.*;

class VolumeCylinder{
    public static void main(String args[]){
      
      Scanner sc = new Scanner(System.in);

      double radius = sc.nextDouble();
      double height = sc.nextDouble();

      double volume = 3.14 * Math.pow(radius , 2) * height;

      System.out.println("volume of cylinder is : "+ volume);


    }
}