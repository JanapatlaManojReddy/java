import java.util.Scanner;
class Bike
{
     public static void main(String args[])
     {
     int price = 1200000;
     String brand = "Bajaj";
     String bike_name = "pulser125";
     double milage,discount;
     byte maxspeed = 110;
     float f=100.00f;
     char color ='B';
     String fuel = "petrol";
     Scanner d= new Scanner(System.in);
     System.out.println("enter discount percent");
     int dic_range = d.nextInt();
     System.out.println(dic_range);
     discount = (dic_range/f)*price;
     System.out.println("discount is "+discount);
     System.out.println("after discount  "+(price-discount));
     Scanner sc = new Scanner(System.in);
     System.out.println("enter distance");
     int distance = sc.nextInt();
     System.out.println(distance);
     Scanner s = new Scanner(System.in);
     System.out.println("enter litters");
     float litters = s.nextFloat();
     System.out.println(litters);
     milage=(distance/litters);
     System.out.println(milage); 
     }
}