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
            myLinkedList.add("Ryan");
            myLinkedList.add("Joe");
            myLinkedList.add("Jade");
            myLinkedList.add("Mimi");
            myLinkedList.add("Isadora");
            myLinkedList.add("Jarrod");
            myLinkedList.add("Ben");

            System.out.println("Before");
            myLinkedList.printList();

            //myLinkedList.printList();

//            String test = myLinkedList.get();
//            System.out.println(test);

            System.out.println("\nAfter");
            myLinkedList.remove("Ryan");
            myLinkedList.printList();

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
    public T get(){
        return head.getData();
    }

    //REMOVE
    public void remove(T data) {
        //making a copy of the head and using that to iterate
        Node cursor = head;

        //checking to see if the first node (head) contains the data
        //head gets chopped off and the java garbage collector will come get it
        if (cursor.getData() == data) {
            //cursor.next becomes the new head
            head = cursor.next;
            return;
        } else if(cursor.next.getData() == data){

        } else {
            while (cursor.next != null) {
                if (cursor.next.getData() == data) {
                    if (null != cursor.next.next) {
                        cursor.next = cursor.next.next;
                    } else {
                        cursor.next = null;
                    }
                }
                //keep looping down the list
                cursor = cursor.next;
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

