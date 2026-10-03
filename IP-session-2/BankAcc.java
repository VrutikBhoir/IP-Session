class Account
{
    String acchold;
    int bal;
   public Account(String acchold,int bal)
    {
        this.acchold=acchold;
        this.bal=bal;
        System.out.println("Account Holder Name: "+acchold+"\n Balance: "+bal);
    }
}
public class BankAcc{
    public static void main(String[] args)
    {
        Account obj=new Account("Darshan",45645);

    }
}