import java.util.Scanner;
public class Miniproject
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Quantity: ");
        int quan=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Price: ");
        int price=sc.nextInt();
        float total=quan*price;
        float dis=(total>=1000 )? total-100:total;
        System.out.println("The Single Price of an Item: "+price);
        System.out.println("How many Quantity you bought: "+quan);
        if (total==dis)
        {
         System.out.println("Total Price:"+total);
        }
        else
        {
         System.out.println("Total Price by availing discount of 100rs: "+total);

        }
        
    }
}