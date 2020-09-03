/ C++ program for postfix to infix using expression tree



using namespace std;

// An expression tree node

struct et

{

char value;

et* left, *right;

};

// A utility function to check if 'c'

// is an operator

bool isOperator(char c)

{

if (c == '+' || c == '-' ||

c == '*' || c == '/' ||

c == '^')

return true;

return false;

}

// Utility function to do inorder traversal

void inorder(et *t)

{

if(t)

{

if (isOperator(t->value))

cout << "(";

inorder( t->left);

cout<< t->value;

inorder(t->right);

if (isOperator(t->value))

cout << ")";

}

}

// A utility function to create a new node

et* newNode(int v)

{

et *temp = new et;

temp->left = temp->right = NULL;

temp->value = v;

return temp;

};

// Returns root of constructed tree for given

// postfix expression

et* constructTree(char postfix[])

{

stack<et *> st;

et *t, *t1, *t2;

// Traverse through every character of

// input expression

for (int i=0; i<strlen(postfix); i++)

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

t1 = st.top(); // Store top

st.pop(); // Remove top

t2 = st.top();

st.pop();

// make them children

t->right = t1;

t->left = t2;

// Add this subexpression to stack

st.push(t);

}

}

// only element will be root of expression

// tree

t = st.top();

st.pop();

return t;

}

// Driver program to test above

int main()

{

string s;

//char postfix[];

cout << "Enter Postfix Expression : ";

cin >> s;

  

int n = s.length();

// declaring character array

char postfix[n+1];

// copying the contents of the

// string to char array

strcpy(postfix, s.c_str());

  

et* r = constructTree(postfix);

cout<<"\ninfix expression is : ";

inorder(r);

return 0;

}