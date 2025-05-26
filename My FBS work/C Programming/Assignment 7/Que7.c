#include<stdio.h>
int main()
{
	int a[]={12345};
	int b[]={11111};
	int c[5];
	int i;
	
	for(i=0;i<5;i++)
	{
		c[i]=a[i]+b[i];
	}
	printf("Sum of array :");
	for(i=0;i<5;i++)
	{
		printf("%d ",c[i]);
	}
}
