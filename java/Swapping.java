class Swap
{
    public static void main(String args[])
    {
      int a=20,b=30;
      System.out.println("before swapping");
      System.out.println("a ="+a);
      System.out.println("b ="+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("after swapping");
      System.out.println("a ="+a);
      System.out.println("b ="+b);
     } 
} 
class Swap2
{
    public static void main(String[] args)
    {     
      int a=20,b=30;
      System.out.println("before swapping");
      System.out.println("a ="+a);
      System.out.println("b ="+b);
      a=a*b;
      b=a/b;
      a=a/b;
      System.out.println("after swapping");
      System.out.println("a ="+a);
      System.out.println("b ="+b);
    }
}