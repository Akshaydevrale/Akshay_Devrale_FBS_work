#include<stdio.h>
#include<string.h>
typedef struct distance
{
	int feet;
	int inch;
}distance;
distance store(distance);
void display(distance);
void main()
{
	distance d1;
	d1=store(d1);
    display(d1);
}
distance store(distance d1)
{
	printf("Enter feet :");
	scanf("%d",&d1.feet);
	printf("Enter inch :");
	scanf("%d",&d1.inch);
	
	return d1;
}
void display(distance d1)
{
	printf("Feet :%d Inch :%d",d1.feet,d1.inch);
}
