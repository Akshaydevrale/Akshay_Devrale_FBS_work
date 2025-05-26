#include<stdio.h>
#include<string.h>
typedef struct student
{
	int rollno;
	char name[10];
	int marks;
	
}student;
void store(student *s);
void display(student *s);
void main()
{
	student s1;
	store(&s1);
	display(&s1);
}
void store(student*s)
{
	printf("Enter RollNo :");
	scanf("%d",&s->rollno);
	printf("Enter Name :");
	scanf("%s",&s->name);
	printf("Enter Marks :");
	scanf("%d",&s->marks);
}
void display(student*s)
{
	printf("Roll No is :%d ",s->rollno);
	printf("Name is :%s ",s->name);
	printf("Marks is :%d ",s->marks);
}
