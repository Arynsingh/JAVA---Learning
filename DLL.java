public class DLL {

    Node head;
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;

    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value + "->");
            last = node;
            node = node.next;

        }
//print in reverse
        while(last!=null){
            System.out.println(last.value);
            last = last.prev;
        }
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        last = node;
    }

    public void insert(int after,int value){
        Node p = get(after);
        if(p == null){
            System.out.println("Does not exist");
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0;i< index;i++){
            node = node.next;
        }
        return node;
    }




    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
