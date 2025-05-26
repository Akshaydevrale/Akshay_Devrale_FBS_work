#include<stdio.h>
#include<string.h>
typedef struct distance
{
	int feet;
	int inch;
}distance;
void main()
{
	distance d1;
	
	printf("Feet :");
	scanf("%d",d1.feet);
	printf("Inch :");
	scanf("%d",d1.inch);
	
	print("Feet :%d Inch :%d",d1.feet,d1.inch);
}
