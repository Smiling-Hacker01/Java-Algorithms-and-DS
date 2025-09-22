//code is to remove duplicates from the sorted linked list
public class RemoveDuplicateNodes {
    ListNode head;
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
          this.val = val;
          this.next = null;
        }
        ListNode(){}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    //add node function
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
    public static void printList(ListNode head){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //function to remove duplicates from the list
    public static ListNode removeDup(ListNode head){
         if (head == null || head.next == null) {
            return head;
         }
         ListNode current = head;
         while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
         } 
         return head;
    }
    //main function
    public static void main(String[] args){
      RemoveDuplicateNodes sollution = new RemoveDuplicateNodes();
      sollution.addNode(1);
      sollution.addNode(2);
      sollution.addNode(2);
      sollution.addNode(3);
      sollution.addNode(3);
      ListNode newList = removeDup(sollution.head);
      printList(newList);
    }
}
