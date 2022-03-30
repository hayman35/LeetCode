package SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;

        if (head == null){ // list is empty so add the node to the head and tail
            head = node;
            tail = node;

        }else if (location == 0){ // Inserting into the beginning of the list
            node.next = head; // the node to reference what the head is referenecing too
            head = node; // head to point to the node

        }else if (location >= size){ // inserting into the tail of the node
            node.next = null;
            tail.next = node;
            tail = node;

        }else{
            int index = 0;
            Node tempNode = head;
            while(index < location - 1){ // Finds the node starting from the head
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = node; // stores the next nodes reference to the new node
            node.next = tempNode.next; // the new nodes next reference is set to the lists next node
        }
    }
}
