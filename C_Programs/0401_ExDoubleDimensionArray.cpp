//-create a 2d array of 2 rows and 2 column to store 4 no. in rows and column format.

#include<stdio.h>
int main()
{
	int num[2][2];
	int row,col;
	num[0][0]=11;
	num[0][1]=12;
	num[1][0]=13;
	num[1][1]=14;
//displaying the elements of 2 d array
	for(row=0;row<2;row++)
	{
		for(col=0;col<2;col++)
		{
			printf("%d\t",num[row][col]);
		}
			printf("\n");
	}
}
