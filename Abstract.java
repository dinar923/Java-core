abstract class Tab
{
    public abstract void captureImage();

    public void captureVideo()
    {
        System.out.println("Stored in Drive");
    }
}

class Mobile extends Tab
{
    public void captureImage()
    {
        System.out.println("Stored in Gallery");
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        Tab obj = new Mobile();

        obj.captureImage();
        obj.captureVideo();
    }
}