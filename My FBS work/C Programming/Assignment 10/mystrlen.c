#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main()
{
	char a[10];
	printf("Enter length :");
	scanf("%s",&a);
	
	int l=mystrlen(a);
	printf("%d",l);
}
int mystrlen(char* a)
{
	int i=0;
	while(a[i]!='\0')
	{
		i++;
	}
	return i;
}
