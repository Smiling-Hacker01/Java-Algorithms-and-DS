public class LinkedListCycle {
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
    //function to detect cycle in a linked list
    public static boolean detectCycle(Node head){
        if (head == null || head.next == null) {
            return false;
        }
        Node hare = head;
        Node turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                return true;
            }
        }
        return false;
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
        currNode.next = head;
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
        LinkedListCycle list = new LinkedListCycle();
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(-4);
        printList(list.head);
        Node cycleList = createCycle(list.head);
        System.out.println(detectCycle(cycleList));
    }
}
