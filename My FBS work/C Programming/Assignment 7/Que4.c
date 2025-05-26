#include<stdio.h>
void main()
{
	int a[5],i;
	printf("Enter the numbers of array :");
	
	for(i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("The even numbers in array:");
	for(i=0;i<5;i++)
	{
		if(a[i]%2==0)
		{
			printf("%d ",a[i]);			
		}
	}
	
	printf("\nThe odd numbers in array:");
	for(i=0;i<5;i++)
	{
		if(a[i]%2!=0)
		{
			printf("%d ",a[i]);			
		}
		
	}
}
