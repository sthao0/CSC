// A class's description to be provided by student
//Shammah Thao
//Lab6
//3/28/2018
// Fill in code in ALL commented areas

public class LinkedList {
   // Defined Node class
   private class Node {
      private Object Data = null;
      private Node Next = null;
      public Node() { 
          Data = null; 
          Next = null; 
      }
      public Node(Object element) { 
          Data = element; 
      }
      public Node(Object o, Node n) { 
          Data = o; 
          Next = n; 
      }      
      public void setNext(Node n) { 
         Next = n; 
      }
      public Node getNext() {  
         return Next; 
      }
      public Object getElement() {  
         return Data; 
      }
      public void setElement(Object element) { 
         Data = element; 
      }
   }

   // Internal data for LinkedList
   private Node head = null;
   private Node current = null;
   private int size = 0;
   
   // LinkedList constructor
   public LinkedList() {
      head = null;
      current = head;
   }
   
   // Move the current position forward one position
   public void forward() {
      if(size == 0)
         return;
      Node temp = current.getNext();
      if(temp != null)
         current = temp;
   }
   
   // Move the current position backward one position
   public void backward() {
      if( head != current) {
         //create node to traverse
         //find node prior to current
         Node tmp = head;
         //check to be sure not at end of list 
         //&& that the next node is not the current(this is how to check current?)
         while((tmp.getNext() != current) && (tmp.getNext() != null)) {
            tmp = tmp.getNext();
         }
         current = tmp;
      }
   }   
 
   // Get current object's data element
   public Object currentData() {
      if(size == 0)
         return null;
      return current.getElement();
   }
  
  
   // Add object to the first of the list
   public void addFirst(Object o) {
      Node temp = new Node(o, head);
      head = temp;
      if(current == null){
         current = head;
      }
      current = current==null?head:current;
      size++;
   }
   
   // resetCurrent at the first position
   public void resetCurrent() {
      current = head;
   }
   
   // Add object to the last of the list
   public void addLast(Object o) {
      //checks if there is at least one node
      if(head != null){
         Node newNode = new Node(o,null);
         size++;
         //traverse to find last node
         Node temp = head;
         while(temp.Next != null)
            temp = temp.Next;
         temp.setNext(newNode);
      }else {
         addFirst(o);
      }
   }
	
   // Add an object o before the current position
   public void insertBefore(Object o) {
      if(size ==0){
         return;
      }else if(size == 1){
         if(head == current)
            addFirst(o);
      } else if (head == current){
         addFirst(o);
      } else {
         backward();
         Node prev = current;
         forward();
         Node newNode = new Node(o, current);
         prev.setNext(newNode);
         size++;
      }
   }

   // Add an object o after the current position
   public void insertAfter(Object o) {
      //checks if there is at least one node
      if(head != null){
         Node newNode = new Node(o, current.getNext());
         size++;
         current.setNext(newNode);
      } else{
         //
      }
   }
   
   // Get first object
   public Object getFirst() {
      if(size == 0)
         return null;
      return head.getElement();
   }
	
   // Get last object
   public Object getLast() {
      //traverse to find last
      if(size == 0)
         return null;
      Node temp = head;
      while(temp.Next != null)
         temp = temp.getNext();
      return temp.getElement();
   }
	
   // Remove the first        object
   public Object removeFirst(){
      if(size == 0)
         return null;
      Node tempRemoved = head;
      Node temp = head.getNext();
      head = temp;
      size--;
      return tempRemoved.getElement();
   }
	
   // Remove the last object
   public Object removeLast() {
      if(size == 0)
         return null;
      //traverse to find last
      Node temp = head;
      while(temp.Next != null)
         temp = temp.Next;
      //traverse to find proir to temp
      Node tempPrior = head;
      while(tempPrior != temp)
         tempPrior = tempPrior.Next;
      tempPrior.setNext(null);
      size--;
      return temp.getElement();
   }
	
    // Remove object o from the list
    public void remove(Object o) {
       if(size != 0){
         Node prev = null;
         Node temp = head;
         while(temp.getNext() != null && temp.getElement() !=o){
            prev = temp;
            temp = temp.getNext();
         }
         if(temp.getElement() ==o){
            current = current == temp ? prev:current;
            prev.setNext(temp.getNext());
            size--;
         }
       }
   }

   // Returns the number of elements on the list
   public int size() {
      return size;
   }
	
   // Is the list emptied?
   public boolean isEmpty() {
      if(size == 0)
         return true;
    //  if(head == null)
    //     return true;
      return false;
   }

   // Display a content of a list
   public String toString() {
      String r = "( HEAD -> ";
      // Node l = head.getNext();
      Node l = head;
      while (l != null) {
         r = r + l.getElement() + " ->\n" ;
         l = l.getNext();
      }
      return  r + " )";
   }
	
   public static void main(String args[]) {
      LinkedList lst = new LinkedList();

      // create instances for testing
      CsusStudent instance1 = new CsusStudent("John Doe 1", 1, "1 Somewhere", "916-555-1211", "johndoe1@somewhere.com");
      CsusStudent instance2 = new CsusStudent("John Doe 2", 2, "2 Somewhere", "916-555-1212", "johndoe2@somewhere.com");
      CsusStudent instance3 = new CsusStudent("John Doe 3", 3, "3 Somewhere", "916-555-1213", "johndoe3@somewhere.com");
      CsusStudent instance4 = new CsusStudent("John Doe 4", 4, "4 Somewhere", "916-555-1214", "johndoe4@somewhere.com"); 
      CsusStudent instance5 = new CsusStudent("John Doe 5", 5, "5 Somewhere", "916-555-1215", "johndoe5@somewhere.com");
      CsusStudent instance6 = new CsusStudent("John Doe 6", 6, "6 Somewhere", "916-555-1216", "johndoe6@somewhere.com");
      CsusStudent instance7 = new CsusStudent("John Doe 7", 7, "7 Somewhere", "916-555-1217", "johndoe7@somewhere.com");
      CsusStudent instance8 = new CsusStudent("John Doe 8", 8, "8 Somewhere", "916-555-1218", "johndoe8@somewhere.com"); 
      CsusStudent instance9 = new CsusStudent("John Doe 9", 9, "9 Somewhere", "916-555-1219", "johndoe9@somewhere.com");         
   
     
     // for redo
 /*     Integer instance1 = new Integer(1);  
      Integer instance2 = new Integer(2);
      Integer instance3 = new Integer(3);
      Integer instance4 = new Integer(4); 
      LinkedList lst = new LinkedList(); 
      lst.addFirst(instance1);
      lst.addFirst(instance2);
      lst.backward();
      lst.insertAfter(instance3);
      lst.addLast(instance4);
      int mySize = lst.size();  */
      
      //begin adding instance1 to the list
      lst.addFirst(instance1);
      
      //test forward and backward for single entrry
      lst.forward();
      lst.backward();
      
      //now add instance2 and instance 3 via addFirst and instance4, instance5, instance6 via addLast
      lst.addFirst(instance2);
      lst.addFirst(instance3);
      lst.addLast(instance4);
      lst.addLast(instance5);
      lst.addLast(instance6);
      
      //move current forawrd a few times
      lst.forward();
      lst.forward();
      
      //insert instance 9 after
      lst.insertAfter(instance9);
      
      //remove instance9
      lst.remove(instance9);
      
      // print out the first and last entries
      System.out.print("\nShow the first entry and last entry:");
      System.out.print("\nFirst: \n"+lst.getFirst());
      System.out.print("\nLast: \n"+lst.getLast());

      // print out the whole list
      System.out.println("\nShow the whole list:");
      System.out.print("\n"+lst.toString());
      
      // remove entries starting from the last entry 
      System.out.println("\n\nCheck for the content of the emptied list:");
      //while(lst.isEmpty() == false){
      //   lst.removeLast();
      //}
   }
}