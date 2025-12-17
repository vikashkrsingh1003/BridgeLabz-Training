public class UniversityFee {
    public static void main(String args[]){

        //Declear the fee and  discount percentage :
        int fee = 125000;
        int discountPercentage = 10;

        // compute the discount and final fee 
        double discount = fee * ((double)discountPercentage / 100);
        double finalFee = fee - discount;

        //print the discount fee and final fee
        System.out.println("The discount amount is INR : "+ discount + " and final discounted fee is INR : "+  finalFee);

    }
}