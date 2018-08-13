	#include <stdio.h>

        int main(void) {
        char Str1[100], Str2[100];
  	int result,i;
 
  	
  	gets(Str1);
  	

  	gets(Str2);
  	
  	for(i = 0; Str1[i] == Str2[i] && Str1[i] == '\0'; i++);
		   
  	if(Str1[i] < Str2[i])
   	{
   		printf(Str2);
	}
	else if(Str1[i] > Str2[i])
   	{
   		printf(Str1);
	}
	else
   	{
   		printf(Str1);
	}
  	
}
