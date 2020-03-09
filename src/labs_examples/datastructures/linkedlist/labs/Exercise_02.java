package labs_examples.datastructures.linkedlist.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import sun.awt.image.ImageWatched;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

class CustomLinkedListController {
    public static void main(String[] args) {

            LinkedList<String> myLinkedList = new LinkedList<>();
            //the last one in is first one out
            try {
                System.out.println(myLinkedList.get());
            }catch (ListIsEmptyException e){
                System.out.println(e.toString());
            }

//
//            myLinkedList.add("Ryan");
//            myLinkedList.add("Joe");
//            myLinkedList.add("Jade");
//            myLinkedList.add("Mimi");
//            myLinkedList.add("Isadora");
//            myLinkedList.add("Ben");
//
//            System.out.println("Before");
//            myLinkedList.printList();
//
//            //myLinkedList.printList();
//
////            String test = myLinkedList.get();
////            System.out.println(test);
//
//            System.out.println("\nAfter");
//            myLinkedList.remove("Ryan");
//            myLinkedList.printList();
//
  }

}
class LinkedList<T>{
    //set to private to make sure no one messes with the head
    private Node<T> head;

    public LinkedList(){
    }

    public LinkedList(T data) {
        Node n = new Node(data);
        this.head = n;
    }

    //ADD new node
    public void add(T data){
        Node n = new Node (data);
        n.next = head;
        head = n;
    }
    //GET (PEEK) Method
    public T get() throws ListIsEmptyException {
        if(head != null){
            return head.getData();
        }else {
            throw new ListIsEmptyException();
        }
    }

    //REMOVE
    public void remove(T data) {
        //making a copy of the head so we dont disturb head
        Node cursor = head;

        //if the first node (head) contains the data to delete, set head to cursor.next
        //this deletes the first node, and points head to the second node
        //head gets chopped off and the java garbage collector will come get it
        if (cursor.getData() == data) {
            //cursor.next becomes the new head
            head = cursor.next;
            return;
        } else {
            //otherwise, while cursor.next is not empty & cursor.next does not contain the data
            //we want to delete, iterate down the list
            while (null != cursor.next && cursor.next.getData() != data) {
                cursor = cursor.next;
            }//after the while loop, cursor.next will either be null meaning we've reached
            //the end of the list without finding the data to delete
            if (null == cursor.next) {
                //in which case return
                return;
            }else {
                //otherwise we've found the data, and we need to delete
                //first we check if cursor.next is the last node in the list
                if (null == cursor.next.next){//at the end of the list
                    //if so, simply cut off the last node and return
                        cursor.next = null;
                        return;
                }else {
                    //otherwise, we're in the middle of the list, leapfrog delete
                    cursor.next = cursor.next.next;
                }
            }
        }
    }
    public void printList(){
        Node cursor = head;

        System.out.println(cursor.toString());

        while (cursor.next != null){
            cursor = cursor.next;
            System.out.println(cursor.toString());
        }
    }
}
class Node<T>{
    private T data;
    protected Node next;//link to next node

    //first node adding to list, there is no next node
    public Node(T data) {
        this.data = data;

    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}

//hash

//get

//set

//remove
class ListIsEmptyException extends Exception {

    public ListIsEmptyException(){
        super("The list is empty:(");
    }
}

