#include<stdio.h>
int main() 
{  
  float r,a,o;
  scanf("%f",&r);
  scanf("%f",&a);
  o= 2*3.14*r*(a/360);
  printf("%0.2f",o);
  return 0;
}