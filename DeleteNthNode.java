public class DeleteNthNode {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //function to add node in a list ;
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
    //function to delete nth Node from the list
     public static Node deleteNth(Node list, int n){
          if (list == null) {
            return null;
          }
          if (n < 0) {
             return list;
          }
          int size = 0;
          Node currNode = list;
          while (currNode != null) {
            size++;
            currNode = currNode.next;
          }
          if (n > size) {
              return null;
          }
          if (n == size) {
              list = list.next;
              return list;
          }
          Node prevNode = list;
          for(int i = 1; i < size-n; i++){
               prevNode = prevNode.next;
          }
          prevNode.next = prevNode.next.next;

          return list;
     }
     //function to print the list
     public static void printList(Node list){
        if (list == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = list;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
     }
     //main function
     public static void main(String[] args){
        DeleteNthNode list = new DeleteNthNode();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        
        Node newList = deleteNth(list.head, 3);
        printList(newList);

     }
}
