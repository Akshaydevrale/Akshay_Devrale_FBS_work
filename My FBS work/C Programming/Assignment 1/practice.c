#include<stdio.h>
int main()
{
	int maleage;
	printf("Enter the maleage :");
	scanf("%d",&maleage);
	
	if(maleage<=21)
	printf("Male not eligible:");
	else
	printf("Male is eligible:");
	
	int female;
	printf("Enter the femaleage :");
	scanf("%d",&female);
	
	if(female<=18)
	printf("female not eligible:");
	else
	printf("female is eligible:");
	
}
