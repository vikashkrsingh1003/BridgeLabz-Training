 /* School Bus Attendance System 
 Track 10 students' presence.
   ● Use for-each loop on names.
   ● Ask "Present or Absent?"
   ● Print total present and absent counts. */

import java.util.Scanner;

public class BusAttendance {
    public static void main(String[] args) {
       
       //initialize the 10 student name 
        String[] students = {
            "Aarav", "Diya", "Rohan", "Meera", "Kunal",
            "Ananya", "Rahul", "Priya", "Samar", "Neha"
        };
       
        //take input to check their status
        Scanner sc = new Scanner(System.in);
        int count=0;
           for (String name : students) {   
            System.out.print(name + "  P or A ? ");
            String status = sc.nextLine();
           
            if(status.equals("A")){
                count++;
            }
            //print the name and status
            System.out.println(name + " : " + status);
            
        }
        System.out.println("total number of absent student :"+count);

        sc.close();
    }
}
