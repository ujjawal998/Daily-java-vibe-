public class Overloading
{
    int add(int a ,int b)
    {
        return a+b;
    }
     double add(double a,double b)
    {
        return a+b;
    }
    int add(int a,int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        Overloading c = new Overloading();
        System.out.println(c.add(2,4));
        System.out.println(c.add(2.3,2.3));
        System.out.println(c.add(1,2,3));
    }
}