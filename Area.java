abstract class shape
{
    int dim1 = 5;
    int dim2 = 6 ;
    abstract void area();
}
class triangle extends shape{
    void area()
    {
        System.out.println("area of triangle is "+(dim1+dim2)*2);
    }
}
class rectangle extends shape{
    void area()
    {
        System.out.println("area of rectangle is"+4*(dim1+dim2));

    }
}

public class Area
 {
    public static void main(String args[])
    {
     shape t =new triangle();
     t.area();
     shape r = new rectangle();
     r.area();

    }
 }