public class addF {
    
    
        public static class Node{
            int data;
            Node next;
            public   Node(int data )
            {
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data)
        {
            //step 1 create new node 
            Node newNode = new Node(data); 
            if(head==null)
            {
                head=tail=newNode;
                return;
            } 
          
            //newnode next =head
            newNode.next=head;
            // newnode =head
            head=newNode;
             
        }
        public void addLast(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head=tail=null;

            }
            tail.next=newNode;
            tail=newNode;
        }
        public void print()
        {
            if(head==null)
            {
                System.out.println("LL is empty");
                return ;
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        
        
        
    
        public static void main(String[] args) {
            addF ll=new addF();
            ll.addFirst(1);
            
            ll.addFirst(2);
          
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            ll.print();
            //5->4->3->2->1

           
    
        }
        
        
   
    
}

    

