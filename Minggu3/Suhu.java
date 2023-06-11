public class Suhu{
    int c;
    float hsl;
    public Suhu(){} //konstruktor -->overloading
    public Suhu(int c) // konstruktor dengan parameter
    {
        this.c=c;
    } 
    void setC(int c)
    {
        this.c=c;
    }
    int getC() //getter nilai celcius
    {return c;}
    float cToK()//method celcius to Kelvin
    {
        return c+273.15f;
    }
    float cToF()//method celcius to fahrenheit
    {
        return c+1.8f+32;
    }
    double cToRa()
    {
        return c*1.8f+491.67; 
    }
    float cToDe()
    {
        return (100-c)*1.5f;
    }
    float cToN()
    {
        return c*33/100;
    }
    float cToRe()
    {
        return c*0.8f;
    }
    float cToRo()
    {
        return c*21/40+7.5f;
    }
}