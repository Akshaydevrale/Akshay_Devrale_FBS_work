#include<stdio.h>
#include<string.h>
typedef struct HR
{
	int id;
	char name[10];
	int salary;
	int commission;
	
}HR;
HR store(HR);
void display(HR);
void main()
{
	HR s1;
	s1=store(s1);
	display(s1);
}
HR store(HR s)
{
	printf("Enter id :");
	scanf("%d",&s.id);
	printf("Enter name :");
	scanf("%s",&s.name);
	printf("Enter salary :");
	scanf("%d",&s.salary);
	printf("Enter commission :");
	scanf("%d",&s.commission);
	return s;
}
void display(HR s)
{
	printf("Id :%d ",s.id);
	printf("Name :%s ",s.name);
	printf("Salary :%d ",s.salary);
	printf("Commission :%d ",s.commission);
}
