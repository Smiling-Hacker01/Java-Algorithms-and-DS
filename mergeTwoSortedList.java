public class mergeTwoSortedList {
    Node head;
   static class Node{
        int data;
        Node next;
        Node(int data){
           this.data = data;
           this.next = null;
        }
    }
    //functio  to add data in a list 
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    //function to merge two sorted list 
    public static Node mergeList(Node list1, Node list2){
        if (list1 == null && list2 == null) {
            return null;
        }
        Node dummy = new Node(-1);
        Node current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        return dummy.next;
    }
    //functio  to print the list
    public static void printList(Node list){
        if (list == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = list;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        return;
    }
    //main function
    public static void main(String[] args){
       mergeTwoSortedList list1 = new mergeTwoSortedList();
       mergeTwoSortedList list2 = new mergeTwoSortedList();
       list1.addNode(1);
       list1.addNode(2);
       list1.addNode(4);
       list2.addNode(1);
       list2.addNode(3);
       list2.addNode(4);
       
       Node result = mergeList(list1.head, list2.head);
       printList(result);

    }
}
