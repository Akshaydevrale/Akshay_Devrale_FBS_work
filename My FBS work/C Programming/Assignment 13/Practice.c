#include<stdio.h>
#include<string.h>
typedef struct student
{
	int roll;
	char name[10];
	int marks;
}student;
void main()
{
	student s1;
	
	printf("Enter ROll:");
	scanf("%d",&s1.roll);
	printf("Enter name :");
	scanf("%s",s1.name);
	printf("Enter marks :");
	scanf("%d",&s1.marks);
	
	printf("Roll :%d Name :%s Marks :%d",s1.roll,s1.name,s1.marks);
}
