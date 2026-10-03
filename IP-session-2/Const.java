class Constat
{
   Constat()
    {
        System.out.println("Hello World!");
    }
    Constat(String name)
    {
        System.out.println("Hello "+name);
    }
    Constat(int num)
    {
        System.out.println("Age: "+num);
    }
}
public class Const
        {
            public static void main(String[] args)
            {
                Constat obj=new Constat();
                Constat obj1=new Constat("Darshan ");
                Constat obj2=new Constat(23);
            }
        }
