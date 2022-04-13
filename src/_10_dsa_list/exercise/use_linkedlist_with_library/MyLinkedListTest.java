package _10_dsa_list.exercise.use_linkedlist_with_library;


public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        System.out.println("ORIGIN LIST");
        myLinkedList.printList();
        System.out.println("FIRST ELEMENT " + myLinkedList.getFirst());
        System.out.println("LAST ELEMENT " + myLinkedList.getLast());
        System.out.println("ADD 20 TO INDEX 2");
        myLinkedList.add(2,20);
        myLinkedList.printList();
        System.out.println("ADD 90 TO THE LAST OF THE LIST");
        myLinkedList.addLast(90);
        myLinkedList.printList();
        System.out.println("NUMBER OF ELEMENT");
        System.out.println(myLinkedList.size());
        System.out.println("REMOVE THE ELEMENT AT INDEX 2");
        myLinkedList.remove(2);
        myLinkedList.printList();
        System.out.println("DOES THE LIST HAVE ELEMENT WITH VALUE IS 20 " + myLinkedList.contains(20));
        System.out.println("DOES THE LIST HAVE ELEMENT WITH VALUE IS 90 " + myLinkedList.contains(90));
    }
}
