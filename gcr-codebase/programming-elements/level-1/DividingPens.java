 public class DividingPens{
    public static void main(String args[]){
    
    //Declear the numbers of pen and numbers of student:
        int pen= 14;
        int student= 3;

    // Find the reminder 
        int reminder = pen % student;

    // find the equal pen division 
    
      int equalPens = pen / student;

    // print the reminders and equal pens for each student;

      System.out.println("The Pen Per Student is "+ equalPens +" and the remaining pen not distributed is " + reminder);
   

    }
}