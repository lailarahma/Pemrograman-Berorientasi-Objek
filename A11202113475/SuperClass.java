class SuperClass{
int a, b, c;
SuperClass(int p, int q, int r){
a=p;b=q;c=r;
}
void Show()
{
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
}
void Show(String s){
System.out.println(s);
}}
class SubClass extends SuperClass{
int d;
SubClass(int l, int m, int n, int o)
{ super(l,m,n);d=o;
}

void Show(){
super.Show("Class SuperClass ");
super.Show();
}
void Show(String x){
System.out.println(x);
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
System.out.println("d = " + d);
}
public static void main(String args[]){
SubClass b = new SubClass(4,7,1,8);
b.d=b.a*b.c;
b.Show();b.d+=4;
b.Show("Class SubClass");
}
}