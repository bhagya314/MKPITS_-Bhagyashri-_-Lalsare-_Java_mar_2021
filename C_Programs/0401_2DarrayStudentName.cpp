//create a 2 d array to store 5 students name.

#include<stdio.h>
int main()
{
	char name[5][20]; 
	int row;
	for(row=0;row<5;row++)
	{
		printf("\n enter student name");
		scanf("%s",&name[row]);
	}

//displaying the elements of 2 d array
	for(row=0;row<5;row++)
	{
		printf("\n student name are : %s",name[row]);
	}
}

