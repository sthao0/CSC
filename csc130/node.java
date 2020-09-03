import java.io.*;
import java.util.*;
//DLL_Students.cpp

//Double linked list for student names


//create node with double pointers and student name
public class node
{
   public String name;
   public node prev;
   public node next;
}

//package <missing>;

 class GlobalMembers
{
	public static node header = null; //declare global names header and tail
	public static node tail = null;

	//function adds name to double linked list
	public static void addName(String name)
	{
	   //code here
	   if (header == null) //when empty header
	   {
		   header = new node(); //allocate new node
		   header.name = name; //store name to list
		   header.next = header.prev = null; //set prev and next to null
		   tail = header; //header is also referred by tail
	   }
	   else if (name.compareTo(header.name) < 0) //when smaller new name
	   {
		   header.prev = new node(); //allocate new node before header
		   header.prev.name = name; //store name
		   header.prev.next = header; //connect prev of header to header
		   header = header.prev; //new header is new node(prev of header)
		   header.prev = null; //again set prev of header is NULL
	   }
	   else if (name.compareTo(tail.name) > 0) //when greater new name than tail
	   {
		   tail.next = new node(); //allocate new node after tail
		   tail.next.name = name; //store name
		   tail.next.prev = tail; //connect next of tail to tail
		   tail = tail.next; //new tail is going to tail now
		   tail.next = null; //again set tail next is null
	   }
	   else //some where in middle
	   {
		   node temp = header; //temp for traversing
		   while (temp.name.compareTo(name) < 0) //traverse upto list name is less than new name
		   {
			   temp = temp.next;
		   }
		   //when temp name greater than name loop is stopped
		   node nn = new node(); //allocate new node nn
		   nn.name = name; //store name
		   temp.prev.next = nn; //connect nn is before temp
		   nn.prev = temp.prev;
		   nn.next = temp;
		   temp.prev = nn;
	   }

	}

	public static String convertLower(String st)
	{
	   String nst = ""; //new string
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: for(unsigned int i=0;i<strlen(st.c_str());i++)
	   for (int i = 0;i < String.valueOf(st).length();i++) //repeat string
	   {
		   if (st.charAt(i) >= 65 && st.charAt(i) <= 90) //when upper case found
		   {
			   nst += Character.toLowerCase(st.charAt(i)); //convert lower and add to new string
		   }
	   }

	   return nst; //return new string
	}

	//function deletes name for double linked list
	public static void deleteName(String name)
	{
	   //code here
	   node temp = header; //start from header
	   if (convertLower(header.name).equals(convertLower(name))) //when found at head
	   {
		   header = header.next; //move header to next
		   header.prev = null; //prev is null
		   temp = null; //delete it
	   }
	   else if (convertLower(tail.name).equals(convertLower(name))) //when found at tail
	   {
		   temp = tail; //refer temp to tail
		   tail = tail.prev; //move tail to previous
		   tail.next = null; //connect back null to end
		   temp = null; //delete it
	   }
	   else //other than tail and head, may be at middle
	   {
		   while (temp != null && !convertLower(temp.name).equals(convertLower(name))) //repeat until it is found or null is reached
		   {
			   temp = temp.next; //move to next
		   }
		   if (temp != null) //when found
		   {
			   temp.next.prev = temp.prev;
			   temp.prev.next = temp.next;
			   temp = null; //now alone temp is remove
		   }
	   }
	}

	public static int Main()
	{
	   Scanner infile = new Scanner(new File("input.txt")); //open file for reading
	   String line;
	   String name = "";

//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>) is more appropriate:
	   if(infile > line); //reading first line or word
	   while (!infile.of()) //repeat until end of file
	   {
		   if (line.equals("delete")) //when command delete is found
		   {
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>) is more appropriate:
			   if(infile > name); //read name to delete
			   deleteName(name); //call delete function
		   }
		   else
		   {
			   addName(line); //add function with line as argument
		   }
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>) is more appropriate:
		 if(  infile > line); //reading the next line or word
	   }
	   infile.close(); //close the file

	   //print order in ascending
	   ofstream outfile = new ofstream("output.txt"); //open file for writing
	   node temp = header;
	   while (temp != null) //traverse forward
	   {
		   System.out.print(temp.name);
		   System.out.print("\n");
		   if(outfile < temp.name < "\n");
		   temp = temp.next;
	   }

	   System.out.print("================");
	   System.out.print("\n");
	   if(outfile < ("================\n"));
	   temp = tail;
	   while (temp != null) //traverse reverse
	   {
		   System.out.print(temp.name);
		   System.out.print("\n");
		   if(outfile < temp.name < "\n");
		   temp = temp.prev; //previous moving
	   }
	   outfile.close(); //close the file


	   return 0;
	}
}
