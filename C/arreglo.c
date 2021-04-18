#include <stdio.h>

int arrMax(int vec[],int tam){
    int aux=0;
    aux=vec[0];
    int i=0;
    for(i=0;i<tam;i++){
        if(aux<vec[i]){
            aux=vec[i];
        }
    }
    return aux;
}


int main(){
   printf("Dame 5 numeros\n");
   int i=0;
   int vec[5];
   for(i=0;i<5;i++){
       scanf("%d",&vec[i]);
   }
   int max=arrMax(vec,5);
   printf("El valor maximo del vector es %d\n",max);
   return 0;
}
