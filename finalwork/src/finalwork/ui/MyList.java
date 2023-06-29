package finalwork.ui;

public class MyList {
    Main head;

    public void reverse() {
        Main prev = null;
        Main current = head;
        Main next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    public void printList() {
        Main node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
    	MyList list = new MyList();
        list.head = new Main(1);
        list.head.next = new Main(2);
        list.head.next.next = new Main(3);
        list.head.next.next.next = new Main(4);

        System.out.println("Список: ");
        list.printList();

        list.reverse();

        System.out.println("\nСписок в обратном порядке:");
        list.printList();
    }
}