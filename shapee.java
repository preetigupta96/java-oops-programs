class Shape
{
  float len,ht,rad;
  double areaOfCircle( float a)
 {
double p=3.14*a*a;
   return p;

 }
double areaOfTriangle( float a, float b)
 {
double ap=(0.5*a*b);
   return ap;

 }
double areaOfRectangle(float a,float b)
 {
   double ad=a*b;
   return ad;

 }


}
class Calc
{

public static void main(String as[])
{
System.out.println("Starttt.....");
  Shape sh=new Shape();
  double x=sh.areaOfCircle(2);
  System.out.println(x);
  double y=sh.areaOfTriangle(2,8);
  System.out.println(y);
  double z=sh.areaOfRectangle(2,9);
  System.out.println(y);
 
  

}

}