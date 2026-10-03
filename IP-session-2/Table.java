import java.util.Scanner;
public  class Table
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println(" Enter the Number to print the table: ");
        int num=sc.nextInt();
        for (int i=1; i<=10;++i)
        {
            int num1=num*i;
            System.out.println(" "+num+ " * "+i+ " = "+num1);
        }
    }
}