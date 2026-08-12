public class LinkedList_Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(8);
        list.insert(2);
        list.insert(9);

        list.addAtStart(0);

        list.insertAtLocation(0, 11);

        list.deleteAtLocaton(3);

        list.show();
        
    }
    
}
