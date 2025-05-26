#include<stdio.h>
void minmax(int a[]);
void main()
{
	int a[5],i;
	printf("Enter the array: ");
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}	
	minmax(a);
}
void minmax(int a[])
{
	int min=a[0];
	int max=a[0];
	int i;
	
	for(i=0;i<5;i++)
	{
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	printf("Maximum number is: %d",max);
	printf("\nMinimum number is: %d",min);
}
