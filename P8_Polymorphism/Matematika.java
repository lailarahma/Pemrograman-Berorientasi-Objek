public class Matematika{
    float hasil;int hsl;
    void pertambahan (int a,int b)
    {
        hsl=a+b;
        System.out.println("Pertambahan : " + a +" + "+ b + " = "+hsl);
    }
    void pertambahan(double a,double b)
    {
        double nilai = a+b;
        System.out.println("Pertambahan : " + a +" + "+ b + " = "+nilai);
    }
    float pertambahan (float a, float b)
    {
        return a+b;
    }
    float pertambahan (float a, float b, float c)
    {
        return a+b+c;
    }
    void perkalian(int a,int b)
    {
        hsl=a*b;
        System.out.println("Perkalian   : " + a +" * "+ b + " = "+hsl);
    }
    float perkalian(float a,float b)
    {
        return a*b;
    }
    void pembagian(int a, int b)
    { 
        hsl=a/b;
        System.out.println("Pembagian   : " + a +" / "+ b + " = "+hsl);
    }
    float pembagian (float a,float b)
    {
        return a/b;
    }
    double pembagian(double a,double b)
    { 
        return a/b;
    }
    void pengurangan(int a,int b)
    {
        hsl=a-b;
        System.out.println("Pengurangan : " + a +" - "+ b + " = "+hsl);
    }
    void pengurangan (double a,double b)
    {
        double nilai = a-b;
        System.out.println("Pengurangan : " + a +" - "+ b + " = "+nilai);
    }
    float pengurangan (float a,float b)
    {
        return a-b;
    }
    double pertambahan (double a,double b, double c){
        return a+b+c;
    }
    double pengurangan ( double a,double b,double c){
        return a-b-c;
    }
    double pembagian (double a,double b,double c){
        return a/b/c;
    }
    double perkalian (double a,double b,double c){
        return a*b*c;
    }
}