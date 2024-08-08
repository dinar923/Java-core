class J
{
    public void show()
    {
        System.out.println("J from 'J'");
    }
}

public class Anonymous
{
    public static void main(String[] args)
    {
        J obj = new J()
        {
            public void show()
            {
                System.out.println("J from 'Anonymous'");
            }
        };

        obj.show();
    }
}