import java.util.*;
class lefttriangle{
public static void main(String[] aargs){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int a=65;
for(int i=0;i<m;i++)
{
for(int j=1;j<m-i;j++){
 System.out.print(" ");
 }
 for(int k=0;k<=i;k++){
  System.out.print((char)(a+k));
  }
  System.out.println();
  }
  }
  }