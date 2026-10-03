class Animal
{
    void mul(){
    System.out.println("Animal Eats Food!");}
}
class Dog extends Animal
{
    void dog(){
    System.out.println("Dog Barks");}
}
class Puppy extends Dog
{
    void pup(){
    System.out.println("Puppy Plays");}
}

public class Multi
{
    public static void main(String[] args)
    {
    Puppy pp=new Puppy();
    pp.mul();
    pp.dog();
    pp.pup();}
}