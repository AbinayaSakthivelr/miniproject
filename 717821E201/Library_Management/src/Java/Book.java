package Java;

public class Book extends Library {
	private static  String Title;
	private static  String Author;
	private static int  Year;
public Book(int libraryid,String libraryName,String address,String Title,String Author,int Year)
{
	super();
	this.Title=Title;
	this.Author=Author;
	this.Year=Year;
}
public static void displayBookDetails()
{
		try {
			System.out.println("Title:"+Title);
			System.out.println("Author:"+Author);
			System.out.println("Year:"+Year);
		} catch (Exception e) 
		{
			System.out.println(e);
		}
}
}
