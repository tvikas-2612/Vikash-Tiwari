import java.util.*;
public class Library
{
		public static void main(String[] args)
		{
			char r;
			do {
			System.out.println("***Library Management System***********");
			System.out.println("Press 1 to add Book");
			System.out.println("Press 2 to issue a Book");
			System.out.println("Press 3 to return a Book");
			System.out.println("Press 4 to print complete issue details");
			System.out.println("Press 5 to exit");
			Scanner obj1 = new Scanner(System.in);
			System.out.println("Enter any number:");
			int a = obj1.nextInt();
			switch(a)
			{
			case 1:
				Management aa = new Management(); 
				aa.add();
				break;
			case 2:
				Management bb = new Management(); 
				bb.iss();
				break;
			case 3:
				Management cc = new Management();
				cc.ret();
				break;
			case 4:
				Management is = new Management();
				is.detail();
				break;
			case 5:
				Management dd = new Management();
				dd.exit();
				break;
				default:
					System.out.println("Invalid number");
			}
			System.out.println("You want to select next option Y/N");
			r = obj1.next().charAt(0);
			}
			while(r=='y'||r=='Y');
			if(r=='n'||r=='N')
			{
				Management z = new Management();
				z.exit();
			}
			
	}
}
class Management
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.println("Enter book Name,Price and Book_No" );
		Scanner obj2 = new Scanner(System.in);
		String str = obj2.nextLine();
		float price = obj2.nextInt();
		int book_No = obj2.nextInt();
		System.out.println("Your details are "+ str + price + book_No);
	}
	void iss()
	{
		Scanner obj3 = new Scanner(System.in);
		System.out.println("Book Name");
		str=obj3.nextLine();
		System.out.println("Book_id");
		c=obj3.nextInt();
		obj3.nextLine();
		System.out.println("Issue Date");
		b = obj3.nextLine();
		System.out.println("total number of book issued");
		c = obj3.nextInt();
		obj3.nextLine();
		System.out.println("Return book date");
		date = obj3.nextLine();
		
	}
	int getId()
	{
		return a;
	}
	void ret()
	{
		System.out.println("Enter student_name and Book_id");
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		int book_id = sc.nextInt();
		if(a==book_id)
		{
			System.out.println("Total Details");
			System.out.println("Book Name::"+Management.str);
			System.out.println("Book id::"+ Management.a);
			System.out.println("Issue Date:"+Management.b);
			System.out.println("Total number of book issued:"+Management.c);
			System.out.println("Book returned date::"+Management.date);
		}
		else 
		{
			System.out.println("Wrong Id.Pls enter correct Id");
		}
	}
	void detail()
	{
		System.out.println("Book Name:"+Management.str);
		System.out.println("Book Id"+Management.a);
		System.out.println("Issue date"+Management.b);
		System.out.println("Total number of book issued::"+Management.c);
		System.out.println("Book return date::"+Management.date);
	}
	void exit()
	{
		System.exit(0);
	}
}
