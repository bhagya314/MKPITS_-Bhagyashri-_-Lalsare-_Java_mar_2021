//wap to create a 2 d array(matrix ) of 3 rows and 2 column

#include<stdio.h>
int main()
{
	int num[3][2];
	int row,col;

	for(row=0;row<3;row++)
	{
		for(col=0;col<2;col++)
		{
			printf("\n enter number");
			scanf("%d",&num[row][col]);
		}

	}

//displaying the elements of 2 d array
	for(row=0;row<3;row++)
	{
		for(col=0;col<2;col++)
		{
			printf("%d\t",num[row][col]);
		}
			printf("\n");
	}
}

