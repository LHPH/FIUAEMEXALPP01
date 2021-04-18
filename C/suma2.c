#include <stdio.h>

int suma(int i,int j,int k){
     if(k==j){
          return i;
     }
     else{
          return i+suma(i+1,j,k+1);
     }
}


int main(){

  int i=0,j=0;
  printf("Dame el primer numero\n");
  scanf("%d",&i);
  printf("Dame el segundo numero\n");
  scanf("%d",&j);
  if(i<j){
        printf("La suma  es %d\n",suma(i,j,i));
  }
  else{
       printf("Error el primer numero debe ser menor al segundo\n");
  }
 
  return 0;
}
