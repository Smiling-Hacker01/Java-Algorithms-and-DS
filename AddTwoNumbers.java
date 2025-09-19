public class AddTwoNumbers{
      Node head;
      static class Node{
        int data;
        Node next;
        Node(int data){
           this.data = data;
           this.next = null;
        }
    }
    //function to add node in a list only for the vs code not needed on leetcode
    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
             current = current.next;
        }
        current.next = newNode;
    }
    //public static add Numbers of the node reverse order
    public static Node addNumbers(Node l1, Node l2){
          Node dummy = new Node(0);
          Node current = dummy;
          int sum = 0;
          int carry = 0;
         while (l1 != null || l2 != null || carry != 0) {
            sum = carry;
            if(l1 != null){
              sum += l1.data;
              l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
         }
         return dummy.next;
    }
    
    //function to print the linked list
    public static void printList(Node list){
         if (list == null) {
            System.out.println("List is empty");
            return;
         }
         Node current = list;
         while(current != null){
            System.out.print(current.data + "-> ");
            current = current.next;
         }
         System.out.println("null");
         return;
    }

    //main function
    public static void main(String[] args){
        AddTwoNumbers list1 = new AddTwoNumbers();
        AddTwoNumbers list2 = new AddTwoNumbers();
        list1.addNode(2);
        list1.addNode(4);
        list1.addNode(3);
        list2.addNode(5);
        list2.addNode(6);
        list2.addNode(4);
        
        Node result = addNumbers(list1.head, list2.head);
        printList(result);
    }

}