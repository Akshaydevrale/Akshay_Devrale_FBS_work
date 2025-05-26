#include<stdio.h>
#include<string.h>
void main()
{
	char a[10];
	printf("Enter the string :");
	scanf("%s",&a);
	
	char b[10];
	strcpy(b,a);
	printf("%s",&b);
}
