package LinkedListNew;

public class traverseaLinkedList {


}
public void traverseALinkedList(ListNode head){

    ListNode temp = head;

    head = head.next;

    System.out.println(temp.val);

    temp=temp.next;
}
