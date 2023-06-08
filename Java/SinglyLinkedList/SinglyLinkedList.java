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
        if (head == null){ // list is empty
            createSingleLinkedList(nodeValue);
            return;
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
            while(index < location){ // Finds the node starting from the head
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node; // stores the next nodes reference to the new node
            node.next = nextNode; // the new nodes next reference is set to the lists next node
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if (head == null){ // list is empty
            System.out.println("List is empty");
        }else{
            int count = 0;
            Node tempNode = head; // Set the temp node to the start of the list
            while (count < size){ // go on by one and print the values
                System.out.print(tempNode.value);
                if (count != size - 1) {
                    System.out.print("->");
                }
                if (tempNode.next == null){
                    System.out.println("\nList is done");
                    break;
                }
                tempNode = tempNode.next;
                count++;
            }
        }
    }

    boolean searchNode(int nodeValue) {
        int count = 0;
        Node tempNode = head; // Set the temp node to the start of the list
        while (count < size){ // go on by one and print the values
           if (tempNode.value == nodeValue){
               System.out.println("Found Node at " +count+"\n");
               return true;
           }
            if (tempNode.next == null){
                break;
            }
            tempNode = tempNode.next;
            count++;
        }
        System.out.println("Not found");
        return false;
    }

    public void deletionOfNode(int location) {
        if (head == null){ // list is empty
            return;
        }else if (location == 0){
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
            }
        }else if (location >= size){
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++){
                tempNode = tempNode.next;
            }
            if (tempNode == head){
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;

        }else{
            int count = 0;
            Node tempNode = head;
            while(count < location - 1){
                tempNode = tempNode.next;
                count++;
            }
           tempNode.next = tempNode.next.next;
            size--;
        }
    }
    public void deleteSLL() {
        head = null;
        tail = null;
    }
}
