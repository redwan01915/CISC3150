//REDWAN AHMED
// CISC3150 HW1Q2

import java.util.*;
public class CISC3150HWQ2
{
public static void main(String[] args)
{
double radius; double rsqure; double area;
Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter the radius of the cicle");
while(keyboard.hasNextDouble()){
radius= keyboard.nextDouble();
rsqure= Math.pow(radius,2);
area= Math.PI*rsqure;
System.out.println(" The Area of the cicle is "+Math.round(area));
 }
keyboard.close();
}
}