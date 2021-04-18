#include <stdio.h>
#include <stdlib.h>

int CompararDos(int x, int y){
    if(x > y){
        return x;
    }
    else{
        return y;
    }
}

int Recursion(int t,int a[]){
    if(t > 1){
        return CompararDos(Recursion(t - 2,a), a[t - 1]);
    }
    return a[t - 1];
}

int main(){
    int a[] = {10,2,45,6,23,100,9,7};
    printf("El mayor es: %d", Recursion(8,a));
    return EXIT_SUCCESS;
}
