import java.util.Scanner;
public class StockBuyAndSell {
    
        public int maxProfit(int[] prices) {
            int maxProfit=0;
            int minValue=Integer.MAX_VALUE;
            int n=prices.length;
            for(int i=0;i<n;i++){
                if(prices[i]<minValue){
                    minValue=prices[i];
                }
                else if(prices[i]-minValue>maxProfit){
                    maxProfit=prices[i]-minValue;
                }
            }
            return maxProfit;
        }
    
    public static void main(String args[]){
        StockBuyAndSell sc=new StockBuyAndSell();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=s.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the values into array:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int x=sc.maxProfit(a);
        System.out.println("The max profit is:"+x);
    }
}
