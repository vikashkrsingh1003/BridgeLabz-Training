public class ProfitAndPercentage{
    public static void main(String args[]){
      
      //intialize the costprice and sellingprice;
        int sellingPrice = 191;
        int costPrice = 129;

      //find the profit and profit Percentage
        int profit = sellingPrice - costPrice ;
        double profitPercentage = ((double)profit/costPrice) * 100;
       
      // Displaying  the profit and profitPercentage in one line ;
        System.out.println("The Cost Price is INR " + costPrice +"and Selling Price is INR "+ sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);

         }
     }
