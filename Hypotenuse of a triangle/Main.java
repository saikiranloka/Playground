#include <stdio.h>
int main()
{
  float a,b;
  float c;
  scanf("%f%f",&a,&b);
  c=sqrt(a*a+b*b);
  printf("%0.2f",c);
  return 0;
}