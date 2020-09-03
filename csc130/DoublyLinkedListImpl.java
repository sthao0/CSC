import java.io.*;
import java.util.*;
public class DoublyLinkedListImpl<E> {
 
    private Node head;
    private Node tail;
    private int size;
     
    public DoublyLinkedListImpl() {
        size = 0;
    }
    private class Node {
        E element;
        Node next;
        Node prev;
 
        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public boolean isEmpty() { 
    
      return size == 0; 
    
    }

    public void addLast(E element) {
         
        Node tmp = new Node(element, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
    }
     
 
    public void iterateForward(){
         
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }
     

    public void iterateBackward(){
         
        System.out.println("=============");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }
     
 
     
    void deleteNode(int position) 
    { 
       
        if (head == null) 
            return; 
  
       
        Node temp = head; 
  
        
        if (position == 0) 
        { 
            head = temp.next;   
            return; 
        } 
  
       
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
  
       
        if (temp == null || temp.next == null) 
            return; 
  

        Node next = temp.next.next; 
  
        temp.next = next; 
    } 
     
    public static void main(String a[]) throws IOException{
         
        DoublyLinkedListImpl<String> dll = new DoublyLinkedListImpl<String>();
      String file ="C:\\Users\\shamm\\Documents\\CSC\\csc130\\name4";
      Scanner scan = new Scanner(new File(file));
      String txt;
       int count=0;
      while(scan.hasNext()){
           

         if(scan.hasNext("delete")){
            txt = scan.next();
            txt= scan.next();
            
            dll.deleteNode(count);
            
         }else if(scan.hasNext()){ 
            txt = scan.next();
            dll.addLast(txt);
           
         
         }
         count++;
         
      }
        

        dll.iterateForward();

        dll.iterateBackward();
    }
}