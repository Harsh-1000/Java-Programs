/* Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities. */


class Box
{
    private final float l,w,h;

    Box(float l,float w,float h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

    public float getBoxVolume()
    {
        return l*w*h;
    }
}


public class Volume {
    public static void main(String[] args) {
        System.out.println(new Box(2.5f,1.5f,2.0f).getBoxVolume());
    }
}
