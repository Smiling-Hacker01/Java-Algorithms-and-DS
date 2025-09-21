//code is to remove given element from the list
public class RemoveGivenElementList {
    ListNode head;
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    //function to add node in a list
    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    //function to print list
    public static void printList(ListNode list){
        if (list == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode current = list;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //function to delete particualr element from an list
    public static ListNode modifiedList(ListNode head, int element){
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == element) {
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
       return dummy.next;
    }
    //main function 
    public static void main(String[] args){
        RemoveGivenElementList list = new RemoveGivenElementList();
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(1);
        list.addNode(5);
        printList(list.head);
     list.head = modifiedList(list.head, 1);
        printList(list.head);
        
    }
}
