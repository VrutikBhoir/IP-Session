class Outer
{
    static class Inner
    {
        void printer()
        {
            System.out.println("Hello World!!");
        }
    }

}
public class Darshan {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.printer();
    }
}