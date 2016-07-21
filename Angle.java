package com;
import java.util.Scanner;
public class Tester
{
 
 public static void main(String []args)
 {
  int h=0;
  int m=0;
  try{
  String time= args[0];
  String hrs[] = time.split(":");

h = Integer.parseInt(hrs[0]);
m= Integer.parseInt(hrs[1]);


      double hangle,minangle,angle;
        hangle=h*30+(m*30)/60;
        minangle=m*6;
        angle=(hangle-minangle);
        if(angle==360)
        {
            System.out.println("angle is zero degree");
        }
        else if(angle<0)
        {
            angle=-(angle);
             System.out.println("angle is:" +angle);
        }
        else if(angle>180)
        {
            angle=angle-180;
             System.out.println("angle is:" +angle);
        }
        else
        {
         System.out.println("angle is:" +angle);   
        }
  }
  catch(ArithmeticException e){System.out.println(e);}
  catch (NumberFormatException e) {System.out.println(e);}
  catch (ArrayIndexOutOfBoundsException e){System.out.println(e);}   

  }
}