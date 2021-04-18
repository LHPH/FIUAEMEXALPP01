package Hora;

import java.text.DecimalFormat;

public class Tiempo1 extends Object{
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo1(int h, int m, int s) {
        
        if(h>24)
         hora=0;
        else
         hora=h;
        
        if(m>60)
         minuto=0;
        else
         minuto=m;
        
        if(s>60)
         s=0;
        else
         segundo=s;      
    }
    
    public String aStringUniversal(){
        DecimalFormat dosDigitos = new DecimalFormat("0 0");
        return dosDigitos.format(hora)+":"+dosDigitos.format(minuto)+":"+dosDigitos.format(segundo);
    }
    
    public String aStringEstandar(){
        DecimalFormat dosDigitos = new DecimalFormat("0 0");
        return ((hora==12 || hora==0) ? 12 : hora%12)+":"+dosDigitos.format(minuto)+":"+dosDigitos.format(segundo)+
               (hora<12 ? "AM":"PM");
    }
}