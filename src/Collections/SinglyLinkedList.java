package Collections;
// Problem: Create a Java class for a singly linked list. Include methods for:
// Inserting a node at the end
// Deleting a node by value
// Traversing the list and printing its elements

public class SinglyLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd (int data) {
        Node newNode = new Node (data);
        
        // If list is empty. begin the list.
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        // iterate through the list
        while (current.next != null) {
            current = current.next;
        }
        // Add new node at the end when next is null
        current.next = newNode;
    }

    public void deleteByValue(int data) {
        // if list is empty
        if (head == null) {
            return;
        }
        // delete if node is head
        if (head.data == data) {
            head = head.next;
            return;
        } 
        Node current = head;
        Node previous = null;
        // Iterate through the list
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }
        // If value not found after iterating through the list
        if (current == null) {
            return;
        }
        // deleting the current node
        previous.next = current.next;
    }

    public void traverseAndPrint() {
        Node current = head;
        // iterate through the list
        while (current != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);

        System.out.print("Linked List: ");
        list.traverseAndPrint(); // Output: 1 2 3 4

        list.deleteByValue(3);
        System.out.print("Linked List after deleting 3: ");
        list.traverseAndPrint(); // Output: 1 2 4

        list.deleteByValue(1);
        System.out.print("Linked List after deleting 1: ");
        list.traverseAndPrint(); //output: 2 4

        list.deleteByValue(4);
        System.out.print("Linked List after deleting 4: ");
        list.traverseAndPrint(); //output: 2

        list.deleteByValue(2);
        System.out.print("Linked List after deleting 2: ");
        list.traverseAndPrint(); //output:

        list.deleteByValue(10); //test delete non existent value
        System.out.print("Linked List after deleting 10: ");
        list.traverseAndPrint(); //output:
    }
}
