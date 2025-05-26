//Finding area and perimeter of rectangle
#include<stdio.h>
int main()
{
	int length = 10, width = 5, area, perimeter;
	
    area = length*width;
    perimeter = 2*(length+width);
    
    printf("Area of the rectangle: %d\n", area);
    printf("Perimeter of the rectangle: %d\n", perimeter);
    
}
