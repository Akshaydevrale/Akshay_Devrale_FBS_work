#include<stdio.h>
#include<string.h>
typedef struct Product
{
	int id;
	char name[10];
	int quantity;
	int price;
	
}Product;
void main()
{
	Product p1;
	
	printf("Enter id :");
	scanf("%d",&p1.id);
	printf("Enter name :");
	scanf("%s",&p1.name);
	printf("Enter Quantity :");
	scanf("%d",&p1.quantity);
	printf("Enter Price :");
	scanf("%d",&p1.price);
	
	printf("Id :%d Name :%s Quantity :%d Price :%d",p1.id,p1.name,p1.quantity,p1.price);
}

