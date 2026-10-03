import java.util.Scanner;
public class Homework
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary amount: ");
        float sal = sc.nextFloat();
        double tax=0;
        if (sal >250000 & sal<500000)
        {
            tax=0.5 * sal;
            System.out.println("Your Salary after Paying TAX of 5%: "+tax);
        }
        else if (sal>=500000 & sal<=1000000)
        {
          tax=0.20*sal;
          System.out.println("Your Salary after paying TAX of 20%: "+tax);
        }
        else if (sal>1000000)
        {
            tax=0.30*sal;
            System.out.println("Your Salary after paying TAX of 30%: "+tax);
        }
        else
        {
            System.out.println("Your Salary was under 250000, So no tax have been availed! "+sal);
        }
    }
}
