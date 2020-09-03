import java.util.*;

// C++ program for postfix to infix using expression tree

//C++ TO JAVA CONVERTER WARNING: The following #include directive was ignored:
//#include<bits/stdc++.h>


// An expression tree node

public class et

{

public char value;

public et left;
public et right;

}


class GlobalMembers
{
	// A utility function to check if 'c'

	// is an operator

	public static boolean isOperator(char c)

	{

	if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
	{

	return true;
	}

	return false;

	}

	// Utility function to do inorder traversal

	public static void inorder(et t)

	{

	if (t != null)

	{

	if (isOperator(t.value))
	{

	System.out.print("(");
	}

	inorder(t.left);

	System.out.print(t.value);

	inorder(t.right);

	if (isOperator(t.value))
	{

	System.out.print(")");
	}

	}

	}

	// A utility function to create a new node

	public static et newNode(int v)

	{

	et temp = new et();

	temp.left = temp.right = null;

	temp.value = v;

	return temp;

	}

	// Returns root of constructed tree for given

	// postfix expression

	public static et constructTree(String postfix)

	{

	Stack<et > st = new Stack<et >();

	et t;
	et t1;
	et t2;

	// Traverse through every character of

	// input expression

	for (int i = 0; i < postfix.length(); i++)

	{

	// If operand, simply push into stack

	if (!isOperator(postfix[i]))

	{

	t = newNode(postfix[i]);

	st.push(t);

	}

	else // operator

	{

	t = newNode(postfix[i]);

	// Pop two top nodes

	t1 = st.peek(); // Store top

	st.pop(); // Remove top

	t2 = st.peek();

	st.pop();

	// make them children

	t.right = t1;

	t.left = t2;

	// Add this subexpression to stack

	st.push(t);

	}

	}

	// only element will be root of expression

	// tree

	t = st.peek();

	st.pop();

	return t;

	}

	// Driver program to test above

	public static int Main()

	{

	String s;

	//char postfix[];

	System.out.print("Enter Postfix Expression : ");

	s = ConsoleInput.readToWhiteSpace(true);



	int n = s.length();

	// declaring character array

	String postfix = new String(new char[n + 1]);

	// copying the contents of the

	// string to char array

	postfix = s;



	et r = constructTree(postfix);

	System.out.print("\ninfix expression is : ");

	inorder(r);

	return 0;

	}
}