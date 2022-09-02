import java.util.*;
class  area_train{
public static void main(String []args)
{
   int  h,b,area;	
   Scanner ob=new Scanner(System.in);
System.out.println("enter the height");
System.out.println("enter the base");
   h=ob.nextInt();
b=ob.nextInt();
    area=1/2*(b*h);
    System.out.println("area is:"+area);
}
}