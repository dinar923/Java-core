class Desktop
{
    public void playTutorial()
    {
        System.out.println("Java");
    }

    public String needMouse(int cost)
    {
        if(cost > 1000)
        {
            return "Better-quality!";
        }
        else
        {
            return "Usable-quality...";
        }
    }
}

public class Method
{
    public static void main(String[] args)
    {
        Desktop obj = new Desktop();

        obj.playTutorial();

        String str = obj.needMouse(1500);
        System.out.print(str);
    }
}