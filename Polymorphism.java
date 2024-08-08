class C
{
    public void show()
    {
        System.out.println("C");
    }
}

class D extends C
{
    public void show()
    {
        System.out.println("D");
    }
}

class E extends C
{
    public void show()
    {
        System.out.println("E");
    }
}

public class Polymorphism
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.show();

        obj = new D();
        obj.show();

        obj = new E();
        obj.show();
    }
}