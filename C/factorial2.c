#include <stdio.h>

int factorial(int x){
    if(x>=1){
        return x*factorial(x-1)   
    }
}

int main(){
    
    printf("Dame numero para obtener el factorial\n");
    scanf("%d",&x);
    if(x>0){
       printf("El factorial del numero es %d",factorial(x));
    }
    return 0;
}