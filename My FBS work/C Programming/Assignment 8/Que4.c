#include<stdio.h>
void evenodd(int a[]);
void main()
{
	int a[10],i;
	printf("Enter the numbers in array: ");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
	}
	evenodd(a);
}
void evenodd(int a[])
{	
	int i;		
	printf("Even numbers in array: ");
	for(i=0;i<10;i++)
	{
		if(a[i]%2==0)
		printf("%d",a[i]);
	}
	
	printf("\nOdd numbers in array :");
	for(i=0;i<10;i++)
	{
		if(a[i]%2!=0)
		printf("%d",a[i]);
	}

}
