import javax.xml.crypto.Data;

public class stack {
      node head;
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class Stack {
        public static node head;

        public static boolean isempty() {
            return head == null;
        }

        public static void push() {
            if (isempty()) {
                node newnode = new node();
                head = newnode;
                return;
            }
            newnode.next= head;
            head = newnode;

        }

        public static int pop(){
            if(isempty()){
                return -1;

            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isempty()){
                return -1;

            }
            return head.data;

        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);

        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();

        }


    }

}
