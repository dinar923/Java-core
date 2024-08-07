class A
{
    public A()
    {
        System.out.println("A as Default");
    }

    public A(int n)
    {
        System.out.println("A as Parameterized");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("B as Default");
    }

    public B(int n)
    {
        super(n);
        System.out.println("B as Parameterized");
    }
}

public class Extension
{
    public static void main(String[] args)
    {
        B obj = new B(23);
    }
}