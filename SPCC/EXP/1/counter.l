%{
	#include<stdio.h>
	//section 1 including header files
	//declaring variable and using as pointer value
	int lines=0, words=0,s_letters=0,c_letters=0, num=0, spl_char=0,total=0;
%}



%%
\n { lines++; words++;}
[a-z] s_letters++;
[A-Z] c_letters++;
[.@#$!%^&*()><?~`''"";?:] spl_char++;
[0-9] num++;
[ \t]+ words++;
%%


//logic for the last word and each line
//if any small case letter is found
//if any capital letters are found
//logic for special character
//logic for number from 0 to 9
//if any single whitespace or tabspace is found
//end of 2nd section


int main(void)
{
	yyin= fopen("input.txt","r"); //yyin is a input stream pointer opening input.txt in readmode
	yylex();
	//used to invoke lexer
	total=s_letters+c_letters+num+spl_char;
	printf(" This File contains ...");
	printf("\n\t%d lines", lines);
	printf("\n\t%d words",words);
	printf("\n\t%d small letters", s_letters);
	printf("\n\t%d capital letters",c_letters);
	printf("\n\t%d digits", num);
	printf("\n\t%d special characters",spl_char);
	printf("\n\tIn total %d characters.\n",total);
	//displaying total number values
}


	int yywrap()
{
	return(1);
}
