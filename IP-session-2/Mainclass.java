abstract class Bank
{
    abstract void interestr();
}
class SBI extends Bank
{
    void interestr() {
        System.out.println("The Interest Rate is 6% ");
    }
}
public class Mainclass
{
    public static void main (String[] args)
    {
        Bank obj=new SBI();
        obj.interestr();
    }
}
