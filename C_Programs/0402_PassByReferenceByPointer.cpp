//create a program to explain pass by reference using pointer

#include<stdio.h>
#include<conio.h>
#include<string.h>
void changenum(int *ptr)
{
	*ptr =77;
	printf("\n value inside function = %d",*ptr); //77
}

int main()
{
	int num=66;
	printf("\n value of num before passing to function=%d", num); // 66
	changenum(&num); 
	printf("\n value of num after calling function=%d", num); //77
}


