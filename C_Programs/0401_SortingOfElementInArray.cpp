//wap to sort the elements in an array
//arr[]={1,2,3,4,5} ------- temp =5 i=4 and j=5
//after sorting arr[] = {1,2,3,4,5}

#include<stdio.h>
int main()
{
	int arr[5]= {4,1,5,2,3}; 
	int i,j, temp=0;
	for(i=0;i<5;i++) //i =4
	{
		for(j=i+1;j<5;j++) // j =5
		{
			if(arr[i] > arr[j]) // 5 > 4
			{
				temp=arr[i]; //5
				arr[i]=arr[j]; // 4
				arr[j]=temp ; //5
			}

		}
	}
			for(i=0;i<5;i++)
			{
				printf("%d\t",arr[i]);
			}
}
