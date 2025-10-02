//code is to find the index of the node where the cycle exist leetcode 142
public class LinkedListCycle2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
           this.data = data;
           this.next = null;
        }
    }
    //function to add node in a list
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return;
    }
    //function to return the node where cycle exist in a linked list
    public static Node detectCycleFindNode(Node head){
        if (head == null || head.next == null) {
            return null;
        }
        Node hare = head;
        Node turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                turtle = head;
                while (hare != turtle) {
                    hare = hare.next;
                    turtle = turtle.next;
                }
                return turtle;
            }
        }
        return null;
    }
    //function to create a cycle
    public static Node createCycle(Node head){
        if (head == null) {
            System.out.println("Can't create a cycle not a enough node");
            return null;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = head.next; // creating cycle on index 2nd of list
        return head;
    }
    //function to print list 
    public static void printList(Node head){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }
    //main function
    public static void main(String[] args) {
        LinkedListCycle2 list = new LinkedListCycle2();
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(-4);
        printList(list.head);
        Node cycleList = createCycle(list.head);
        Node cycleNode = detectCycleFindNode(cycleList);
        System.out.println("The node where cycle exist is => " + cycleNode.data);
    }
}

