public class VolumeOfEarth{
    public static void main(String args[]){

        //Declear the radius of earth
        int radius = 6378;
        
        // formula  Volume of a Sphere is (4/3) * pi * r^3 :( pi = 3.14)
        double volumeInKm = (4/3) * 3.14 * Math.pow(radius,3);
        double volumeInMile = volumeInKm * 0.6;
        
        //Display the volume of earth 
        System.out.println("The volume of earth in cubic kilometers is :"+ volumeInKm +" and cubic miles is :"+ volumeInMile);

    }
}