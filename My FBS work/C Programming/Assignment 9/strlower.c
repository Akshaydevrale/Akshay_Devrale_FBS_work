#include<stdio.h>
void main()
{
	char a[10];
	printf("Enter the string :");
	scanf("%s",&a);
	
	int b=strlwr(a);
	printf("%s",b);
}
