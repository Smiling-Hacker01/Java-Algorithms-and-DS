//code is to remove the same elements from the linked list which are present in the given array
import java.util.HashSet;
public class RemoveElementList {
    ListNode head;
    static class ListNode {
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
   //function to print linkedList
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
   //function to delete node which are present in the linked list
  public static ListNode deleteElements(ListNode list, int[] nums){
     if (list == null) {
        return null;
     }
     HashSet<Integer> set = new HashSet<>();
     for (int elem : nums) {
        set.add(elem);
     } 
     ListNode dummy = new ListNode(-1, list);
     ListNode current = dummy;
     while (current.next != null) {
        if (set.contains(current.next.val)) {
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
    RemoveElementList list = new RemoveElementList();
    list.addNode(1);
    list.addNode(2);
    list.addNode(3);
    list.addNode(4);
    list.addNode(5);
    int[]nums = {1,2,3};
    list.head = deleteElements(list.head, nums);
    printList(list.head);
  }
}
