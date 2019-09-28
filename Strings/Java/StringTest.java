import java.util.*;

class StringTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str="", str1="",str2="";
		int strlen1,strlen2,strlen3,ch=0;
		char test;

		do
		{
			System.out.print("\n\t\t1.Take input from User\n\t\t2.Find Length of input String\n\t\t3.Print a part of String\n\t\t4.Find First index of occurance of specific character\n\t\t5.Find Last index of occurance of specific character\n\t\t6.Convert String to Integer\n\t\t7.Convert Integer to String\n\t\t8.Adding a string to another string\n\t\t9.Add a character to the end of the string\n\t\t10.Delete Element from End of String\n\t\t11.Copy One String to the other\n\t\t12.Erase a chunk of String\n\t\t13.Check if String is Empty or not\n\t\t14.Resize a string\n\t\tChoice:");
			ch = sc.nextInt();
			a: 
			switch(ch)
			{
				case 1:
					System.out.println("Enter A String for sc.nextLine():");
					sc = new Scanner(System.in);
					str = sc.nextLine();
					System.out.println("Enter Another String for sc.next():");
					sc = new Scanner(System.in);
					str1 = sc.next();
					break;
				case 2:
					strlen1 = str.length();
					System.out.println("len(str)="+strlen1);
					strlen2 = str1.length();
					System.out.println("len(str1)="+strlen2);
					break;
				case 3:
					System.out.println("Clipping a part of String......:");
					str2 = str.substring(0, 5); //IECSE FIrst CodeMeet
					System.out.println("Clipped String:"+str2);
					break;
				case 4:
					test = 'I';
					int pos = str.indexOf(test);
					System.out.println(test+"found at index "+pos);
					break;
				case 5:
					test = 'e';
					pos = str.lastIndexOf(test);
					if(pos !=-1)
						System.out.println(test+" found at index "+pos);
					else
						System.out.println("Not Found");
						break;
				case 6:
					String tmp= "123";
					System.out.println("Converted Value is:"+Integer.parseInt(tmp));
					break;
				case 7:
					int n=1234;
					String s = Integer.toString(n);
					System.out.println(1+2+s);
					break;
				case 8:
					str2 = str+str1;
					System.out.println("Modified str1+str2 :"+str2);
					str2 = str1+str;
					System.out.println("Modified str2+str1 :"+str2);
					break;
				case 9:
					str2 = str2 + str2.charAt(7);
					System.out.println("Appended String:"+str2);
					break;
				case 10:
					System.out.println("How many places you want to delete from string :\""+str1+"\"");
					int x= sc.nextInt();
					str1 = str1.substring(0,str1.length()-x);
					System.out.println(str1);
					break;
				case 11:
					System.out.println("Copy are carried out using assignment statements -> '='");
					break;
				case 13:
					//No Function exist to erase a part of the String as String in java are immutable
					//You can use Substring to get desired output
					break;
				case 14:
					//Resizing array is not possible because it is an immutable object, 
					//Refer to StringBuilder and StringBuffer to learn about resize and erase in strings in java,
					//feel free to contact the us if you have any doubt
					break;
				default:
					continue;
			}
		}while(ch<15);
	}
}