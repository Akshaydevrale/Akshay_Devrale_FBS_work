#include<stdio.h>
void main()
{
	char a[10];
	printf("Enter the string :");
	scanf("%s",&a);
	
	char s=strrev(a);
	printf("%s",&s);
}
