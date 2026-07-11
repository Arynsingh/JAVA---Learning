public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size = size + 1;
    }

   public void insert(int value,int index){//chat gpt this part
        if(index == 0){
            insertFirst(value);
        }
        if(index == size){
            insertLast(value);
        }

        Node temp = head;
        for(int i = 1;i< index;i++){
            temp = temp.next;
        }
        Node node =  new Node(value,temp.next);//why temp.next
        temp.next = node;
        size = size + 1;

   }
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");

    }
//Deleteion for last element
    public Node get(int index){
        Node node = head;
        for(int i = 0;i< index;i++){
            node = node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size <=1){
            head = head.next;
            if(head == null){
                tail = null;
            }
            size = size - 1;
        }
        Node second = get(size - 2);
        int val = tail.value;
        tail = second;
        tail.next = null;
        size--;
        return val;
    }




    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }



private class Node{
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }
    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
}
}
