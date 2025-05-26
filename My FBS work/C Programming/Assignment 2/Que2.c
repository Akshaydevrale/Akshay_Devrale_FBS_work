#include<stdio.h>
int main()
{
	int a=80, b=60, c=70;
	if(a>=b)
	{
		if(a>=c)
		printf("a is greater : %d",a);
		else
		printf("c is greater : %d",c);
	}
	else
	{
		if(b>=c)
		printf("b is greater : %d",b);
		else
		printf("c is greater : %d",c);
	}
	return 0;
}
