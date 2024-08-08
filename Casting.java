class F
{
    public void show1()
    {
        System.out.println("F");
    }
}

class G extends F 
{
    public void show2()
    {
        System.out.println("G");
    }
}

public class Casting
{
    public static void main(String[] args)
    {
        F obj1 = (F) new G();
        obj1.show1();

        G obj2 = (G) new G();
        obj2.show2();
    }
}