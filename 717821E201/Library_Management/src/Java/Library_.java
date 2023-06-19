package Java;

public class Library_ {
	private static int libraryid;
	private static String libraryName;
	private static String address;
public Library_(int libraryid,String libraryName,String address)
{
	this.libraryid=libraryid;
	this.libraryName=libraryName;
	this.address=address;
}
public static void displayLibraryDetails()
{
	System.out.println("LibraryId:"+libraryid);
	System.out.println("LibraryName:"+libraryName);
	System.out.println("Address:"+address);
}
}
