import java.util.*;
class Capital
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
String s;
System.out.print("Enter String : ");
s=sc.nextLine();
s=" "+s;
String s1=" ";
for(int i=0;i<s.length();i++)
{
char a=s.charAt(i);
if(a==' ')
{
s1+=a;
i++;
a=s.charAt(i);
s1+=Character.toUpperCase(a);
}
else
{
s1+=a;
}
}
s1=s1.trim();
System.out.println("String with first letter capital of every word : "+s1);
}
}

output:

Enter String : this is coding class 
String with first letter capital of every word : This Is Coding Class
