package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.createSingleLinkedList(5);
        System.out.println(list.head.value);
    }
}
