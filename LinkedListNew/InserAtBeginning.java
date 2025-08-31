package LinkedListNew;

public class InserAtBeginning {
}
Public ListNode InsertAtbeginning(ListNode head , int valtoInsert){

    //create a new list to with value to insert

    ListNoden newnode = new ListNode(valtoInsert);

    newNode.next = head;

    head = newnode;

    return head;
}

