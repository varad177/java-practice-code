import java.util.LinkedList;
import java.util.jar.Attributes.Name;

//ek LL di hai use sirf reverse karna hai
// [1 , 2 , 3 , 4 ] ...
// [4 , 3 , 2 , 1 ]..
//by iterate 
//isme ham 3 verable banayenge (prev , curr , next);;
//curr ka next ko hame prev banana hai;;--> curr.next=prev;
//

public class LinkList_reverse {
    node head;
    private int size; // private size ka int banaya

    LinkList_reverse() {
        this.size = 0; // size ko initialize 0 se kr diya ;;;
    }

    class node { // node cclass bana li hamne
        int data;
        node next;

        node(int data) { // CONSTRUCTOR bana liya
            this.data = data;
            this.next = null;
            size++;

        }

    }

    // ADD--1.FIRST...2.LAST
    public void addfirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;

    }

    // ADD LAST
    public void addlast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;

        }
        currnode.next = newnode;

    }

    // print
    public void printlist() {
        if (head == null) {
            System.out.println(" LL is empty");
            return;
        }
        node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "-->");
            currnode = currnode.next;

        }
        System.out.println("null");
    }

    // DELETE
    // first ko delete karna hai to first ke next ko head banana hoga
    // last ko agr delete karna hai ..to next-next karna hai aur jaise hi second
    // last node tak pohochenge .
    // to second last node ko null bana lenge
    // delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return;

        }
        size--; // delete hone ke bad size ko kam karna padega
        head = head.next; // head.next ko head banaya to head carbej ho gya
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        size--; //// delete hone ke bad size ko kam karna padega
        node seclast = head; // head ko sechead banaya
        node lastnode = head.next; // head next ko last node banaaya

        if (head.next == null) { // jisme LL me ek hi node hoga //next karte wakt null ka next null nahi ho sakta
            head = null;
            return;
        }

        while (lastnode.next != null) { // jabtak last node null nahi ho jata
            lastnode = lastnode.next; // lastnode next ko last node me dalneka
            seclast = seclast.next; // aur seclast node ke next ko sec last me dalneka jo ki head banaya hai

        }
        seclast.next = null;
        // lastnode = null;

    }

    public int getsize() {
        return size;
    }

    public void reverseiterate() {
        if (head == null || head.next == null) {
            return;

        }
        node prenode = head; // head ko prenode kr diya
        node currnode = head.next; // head ke next ko currnode kr diya
        while (currnode != null) { // jab tk currnode null nahi ho jyata
            node nextnode = currnode.next; // currnode ke next ko nextnode kr diya;;
            currnode.next = prenode; // prenode ko currnode ke next me dalne ka ;;;

            // uodate
            prenode = currnode; // simply aage ka ek kadam pichhe aayega ;;; currrnode ko prenode matlan ek
                                // kadam pichhe
            currnode = nextnode; // nextnode ko currnode

        }
        head.next = null; // last me head ka next null hoga
        head = prenode; // head hoga prenode;;;
    }

    public node reverserecursive(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node newhead = reverserecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

    }

    public static void main(String[] args) {
        LinkList_reverse list = new LinkList_reverse();
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(3);
        list.addfirst(4);
        list.printlist();
       // list.reverseiterate();
       // list.printlist();
        list.head = list.reverserecursive(list.head);
        list.printlist();
    }

}

// ye hame iteratively reverse kiya
