#include<stdio.h>

int main()
{
  float r,area;
int d;
  scanf("%d",&d);
  r=(float)d/2;
  area=3.14*r*r;
  
 //double area=pi*r*r;
  printf("%0.2f",area);
  return 0;
}