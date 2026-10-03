import java.util.Scanner;
public class card
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int pass=1234;
        int count=0;
        int input=2;
        do
        {
            System.out.println("Enter the Correct Password: ");
            int pasw=sc.nextInt();
            if(pasw==pass)
            {
                System.out.println("The Password is correct!");
                break;
            }
            else
            {
                System.out.println("Wrong Password!" +
                        "Try Again ");
                ++count;
                System.out.println("Attempt : "+count+" Attempt left: "+input);
                --input;
            }
        }while(count<3);
        sc.close();
    }
}