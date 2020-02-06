abstract class Shape{

abstract double area();

}
class triangle extends Shape{
int h,b;
triangle(int a,int c){
h=a;
b=c;
}
double area(){

return 0.5*h*b;
}

}
class rectangle extends Shape{
int l,b;
rectangle(int a,int c){
l=a;
b=c;
}
double area(){

return l*b;
}

}
public class HelloWorld{
static int findMax(int a,int b){
if(a>b)return a;
return b;
}
static double findMax(double a,double b){
if(a>b)return a;
return b;
}
public static void main(String args[]){
triangle tr=new triangle(1,2);
rectangle rt=new rectangle(1,2);
System.out.println("Area of triangle"+tr.area());
System.out.println("Area of rectangle"+rt.area());
System.out.println("MAXIMUM INTEGER"+findMax(2,3));
System.out.println("MAXIMUM INTEGER"+findMax(4.5,3.3));
}



}