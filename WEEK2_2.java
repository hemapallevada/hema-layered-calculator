import java.util.*;
class Sweet{
String name;
int cost;
int weight;
Sweet(String st,int cs,int wi){
name=st;
cost=cs;
weight=wi;}
String getname(){

return name;
}
int getCost(){

return cost;
}
int getWeight(){
return weight;
}
int totalCost(int n){

return n*cost;
}
}
public class HelloWorld{
public static void main(String args[]){
int n,i,j,w,c,k=0,nc=0;String nw;
Scanner ob=new Scanner(System.in);
n=ob.nextInt();
Sweet[] sw=new Sweet[n];
int[] cs=new int[n];
for(i=0;i<n;i++){
nw=ob.next();
w=ob.nextInt();
c=ob.nextInt();
int q=ob.nextInt();
sw[i]=new Sweet(nw,w,c);
if(nw.equals("Chocolate")){nc++;
cs[k++]=sw[i].totalCost(q);

}

}
for(i=0;i<k-1;i++){

for(j=0;j<k-i-1;j++){
if(cs[j]>cs[j+1]){
int temp=cs[j];
cs[j]=cs[j+1];
cs[j+1]=temp;
}}
}

for(i=0;i<k;i++){

    System.out.print(cs[i]+"    ");



}

}


}