#include <stdio.h>

int main(){
   
   printf("Programa para calcular factorial de un numero\n");
   int x=0;
   scanf("%d",&x);
   if(x>=0){
       int i=0;
       int x2=1;
       for(i=x;i>=1;i--){
            x2=x2*i;
       }
       printf("El factorial del numero es %d",x2);
   }

}