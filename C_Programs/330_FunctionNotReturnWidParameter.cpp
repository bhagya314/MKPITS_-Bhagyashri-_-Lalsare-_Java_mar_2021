#include<stdio.h>
int sayhello()
{
	printf("\n hello to c programming");
	printf("\n c is a programming language");
	printf("\n we can create functions in c programming");
}

int main()
{
	
	sayhello(); 
	printf("\n back to main funcion");
	sayhello();  //again i am calling the function
	printf("\n back to main funcion");		
}

