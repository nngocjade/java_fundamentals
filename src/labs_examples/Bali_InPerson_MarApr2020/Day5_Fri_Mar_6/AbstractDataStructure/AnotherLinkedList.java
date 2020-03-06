package labs_examples.Bali_InPerson_MarApr2020.Day5_Fri_Mar_6.AbstractDataStructure;
//
//public class AnotherLinkedList<T> {
//    Node<T> head;
//    // add to front of list
//    public void addToFront(T data){
//        if(isEmpty()){
//            head = new Node(data);
//            return;
//        }
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    // add to back of list
//    public void addToBack(Node<T> node){
//        if(isEmpty()){
//            head = node;
//            return;
//        }
//        Node iterator = head;
//        while(iterator.next != null){
//            iterator = iterator.next;
//        }
//        iterator.next = node;
//    }
//    // contains? (boolean)
//    public boolean contains(T data){
//        if(isEmpty()){
//            return false;
//        }
//        Node iterator = head;
//        while(iterator.data != data){
//            iterator = iterator.next;
//        }
//        if (iterator.data == data){
//            return true;
//        }
//        return false;
//    }
//    public boolean isEmpty(){
//        if(null == head){
//            return true;
//        }
//        return false;
//    }
//    public void clear(){
//        head = null;
//    }
//    // remove(data)
//    public void remove(T data){
//        if (isEmpty()){
//            return;
//        }
//        // trying to remove first element?
//        if (head.data == data){
//            if (null == head.next){
//                // this means there's only one element
//                // and we want to delete it
//                head = null;
//                return;
//            } else {
//                // otherwise, there's more than one in the list
//                // and we just need to delete the first one
//                head = head.next;
//                return;
//            }
//        }
//        Node iterator = head;
//        while(null != iterator.next && iterator.next.data != data){
//            iterator = iterator.next;
//        }
//        if(iterator.next == null){
//            return;
//        } else {
//            // is the element we're deleting in the middle?
//            if (null != iterator.next.next){
//                // deleting element from the middle
//                iterator.next = iterator.next.next;
//            } else {
//                // deleting the last element
//                iterator.next = null;
//            }
//        }
//    }
//    // T get()
//    public Node get(Node node) throws ListEmptyException, ItemNotFoundException {
//        if (isEmpty()){
//            throw new ListEmptyException();
//        }
//        if(head.data == node.data){
//            return new Node(head.data);
//        }
//        Node iterator = head;
//        while (iterator.next != null && iterator.next.data != node.data){
//            iterator = iterator.next;
//        }
//        if(iterator.next == null){
//            throw new ItemNotFoundException("item not found in list");
//        }
//        return new Node(iterator.next.data);
//    }
//    public void printList() {
//        Node cursor = head;
//        if (cursor == null){
//            System.out.println("The list is empty");
//            return;
//        }
//        System.out.println(cursor.toString());
//        while(cursor.next != null){
//            cursor = cursor.next;
//            System.out.println(cursor.toString());
//        }
//    }
//}
//
//public class LinkedListController {
//    public static void main(String[] args) {
//        AnotherLinkedList<String> myLinkedList = new AnotherLinkedList<>();
//        System.out.println(myLinkedList.isEmpty());
//        myLinkedList.addToFront("Ryan");
//        myLinkedList.addToFront("Joe");
//        myLinkedList.addToFront("Mimi");
//        myLinkedList.printList();
//        System.out.println(myLinkedList.contains("Joe"));
//        myLinkedList.remove("Mimi");
//        System.out.println("after remove");
//        myLinkedList.printList();
//        myLinkedList.remove("Ryan");
//        myLinkedList.clear();
//        System.out.println("after clear");
//        myLinkedList.printList();
//    }
//}