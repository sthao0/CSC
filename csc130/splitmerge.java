import java.io.*;
import java.util.*;

class Node{
   String data;
   Node next;
   
   Node(String data){
      this.data = data;
      next = null;
   }
}

class Driver{
   public static void main(String[]args)throws IOException{
      Node head = null;
      Node list1 = null;
      Node list2 = null;
      
      head = readFile();
      display(head);
      Length(head);
      splitMerge(head,list1,list2);
   }
   static void display(Node curr){
      while(curr != null){
         System.out.println(curr.data);
         curr = curr.next;
      }
   }
   static Node readFile() throws IOException{
      Node head = null;
      String file ="C:\\Users\\shamm\\Documents\\CSC\\Csc130\\name.txt";
      Scanner scan = new Scanner(new File(file));
      String txt;
      while(scan.hasNext()){
         txt = scan.next();
         head = createNode(txt, head);
      }
      return head;
   }
   static Node createNode(String data, Node head){
     
      
      if(head == null)
         head = new Node(data);
      else{
         Node curr = head;
         while(curr.next != null)
            curr = curr.next;
         curr.next = new Node(data);
      }
      
      return head;
   }
   
   
   
   static int Length(Node head){
      int count=0; 
      Node ptr=head;
      while(ptr!=null){
      count++;
      ptr=ptr.next;
      
      }
      System.out.println(count);
      return count;
   }
   
   
 
   static Node splitMerge(Node head,Node list1, Node list2) throws IOException{
      Node currNode=head;
      
      System.out.println("\nlist1");
      for(int i = 0; i < 2; i++){
         Node last = deleteLast(currNode);
         list1 = last;
      }
      display(list1);
      
      System.out.println("\nlist2");
      head = readFile();
      list2 = head.next.next;
      display(list2);
      
      return head;
   
   }
   
   static Node deleteLast(Node head){
      Node list1 = head;
      if(list1 == null){
         return head;
      }
      Node last = list1;
      Node ptl = null;
      while(last.next != null){
         ptl = last;
         last = last.next;
      }
      ptl.next = null;
      return head;
  }
  
  static Node addToEnd(Node head, String data){
   Node tail = new Node(data);
   if(head == null){
      return tail;
   }
   Node curr = head;
   while(null != curr.next){
      curr = curr.next;
   }
   curr.next = tail;
   return head;
   }
}
