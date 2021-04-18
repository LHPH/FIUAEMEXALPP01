#include <stdio.h>


int main(){

  int i=0;
  int j=0;
  int res=0;
  printf("Dame primer numero:\n");
  scanf("%d",&i);
  printf("Dame segundo numero:\n");
  scanf("%d",&j);
  if(i<j){
        int cont=0;
       for(cont=i;cont<=j;cont++){
          res=res+cont;
       }
       printf("La suma es %d\n",res);
  }
  else{
       printf("El primer numero debe ser menor\n");
  }
  return 0;
}
