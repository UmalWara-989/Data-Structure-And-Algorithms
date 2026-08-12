class LinkedList{
    Node head;

    public void insert(int data){
        // Created object for node
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head==null) {
            head = node;
        }else{
            Node temp = head;
            while (temp.next!=null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }

    public void show(){
        Node temp = head;

        while (temp.next!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public void addAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head==null) {
            head = node;
        }else{
            node.next = head;
            head = node;
        }
    }

    public void insertAtLocation(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index==0) {
            addAtStart(data);
        }else{
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;}
    }

    public void deleteAtLocaton(int index){
        if (index==0) {
            head = head.next;
        }else{
            Node temp = head;
            Node tempdel = null;

            for (int i = 0; i < index-1; i++) {
              temp = temp.next;  
            }
            tempdel = temp.next;
            temp.next = tempdel.next;
            
            tempdel = null;
        }
    }
}
