//wap to create a pointer variable ptr and store the address of num variable

#include<stdio.h>
int main()
{
	int num=66;
int *ptr;
ptr=&num;
printf("\n value stored at address of ptr=%d", *ptr);
}
