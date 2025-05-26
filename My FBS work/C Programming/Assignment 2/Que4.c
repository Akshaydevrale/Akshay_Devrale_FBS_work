#include<stdio.h>
int main()
{
	int choice;
	printf("\nMenu :");
	printf("1. Check Even or Odd\n");
    printf("2. Calculate Basic Salary with GST\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);
    
    if(choice == 1)
    {
    	int num;
    	printf("Enter a number:");
    	scanf("%d", &num);
    	
    	if(num%2==0)
    	printf("%d Number is even",num);
    	else
    	printf("%d Number is odd",num);
	}
	if(choice == 2)
	{
	float basic, gst, totalamount;
	printf("Enter basic salary");
	scanf("%d", basic);
	
	gst=basic*0.18;
	totalamount=basic-gst;
	printf("GST :%.2f",gst);
	printf("Total amount with GST :%f",totalamount);
	}
	
}
