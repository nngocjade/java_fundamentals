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

class CustomLinkedList{
    public static void main(String[] args) {




    }

}
class LinkedList<T>{

    Node<T> head;

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
    public void remove(){

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
}

//hash

//get

//set

//remove

