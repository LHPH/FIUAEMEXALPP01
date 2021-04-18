package Calculadora;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Funciones {
    
    public Funciones() {
        super();
    }
    
    public float suma(float num, float nu){
        return num+nu;
    }
    
    public float mult(float num, float nu){
        return num*nu;
    }
    
    public float resta(float num, float nu){
        return num-nu;
    }
    
    public float div(float num, float nu) throws Exception{
         return num/nu;
    }
    
    /*
    public void seno(int num){
        acum=(float)Math.sin(num);
    }
    
    public void coseno(int num){
        acum=(float)Math.cos(num);
    }
    
    public void tan(int num){
        acum=(float)Math.tan(num);
    }
    
    public void exponente(int num,int exp){
        acum=(float)Math.pow(num, exp);
    }
    
    public void raiz(int num){
        acum=(float)Math.sqrt(num);
    }
    
    public void raiz(int num,int exp) throws Exception{
        acum=(float)Math.pow(num, 1/exp);
    }
    
    public void euler(int num){
        acum=(float)Math.exp(num);
    }
    
    public void promedio(){
        acum=acum/(float)cant;
    }
    
    public void aleatorio(){
        Random r = new Random(new Date().getTime());
        acum=(r.nextFloat()*100);
        
    }
    
    public void factorial(int num){
        if(num>=0){
               int i=0;
               int x2=1;
               for(i=num;i>=1;i--){
                    x2=x2*i;
               }
               acum=x2;
           }
        else{
            acum=1;
        }
    }
    
    public void logaritmo(int num){
        acum=(float)Math.log10(num);
    }
    
    public void logNat(int num){
        acum=(float)Math.log(num);
    }
    
    public void base10(int num){
        acum=(float)Math.pow(10,num);
    }
    */
    
    public float PROMEDIO(ArrayList<Integer> promedio){
        float n=0;
        for(int i=0;i<promedio.size();i++){
            n=n+promedio.get(i);
        }
        return n/promedio.size();
    }
}
