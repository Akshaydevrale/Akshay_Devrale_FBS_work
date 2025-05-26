#include<stdio.h>
#include<string.h>
typedef struct product
{
	int id;
	char name[10];
	int quantity;
	int price;
}product;
product store(product);
void display(product);
void main()
{
	product p;
	p=store(p);
	display(p);
}
product store(product p)
{
	printf("Enter id :");
	scanf("%d",&p.id);
	printf("Enter name :");
	scanf("%s",&p.name);
	printf("Enter quantity :");
	scanf("%d",&p.quantity);
	printf("Enter price :");
	scanf("%d",&p.price);
	
	return p;
}
void display(product p)
{
	printf("Id :%d Name :%s Quantity :%d Price :%d",p.id,p.name,p.quantity,p.price);
}
