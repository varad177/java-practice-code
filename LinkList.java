//PROPERTIES OF LINKLIST
//1. variable sixe
//2. non-contiguous memory
//3. insert in 0(1)
//4. search in 0(n)

//NODE
// NODE store 2 information
//1. data...2. reference

//HEAD means ll ka pehta point amd tail means last elements 

//type pf LL 
//1. SINGULAR....2.DOUBLE ENDED...3.CIRCULAR ...

//BASICALLI INSERTION KE LITE LINKLIST USE KRNA CHAHIYE 

public class LinkList {
    node head;
    private int size;    //private size ka int banaya
    
    LinkList(){
        this.size =0;        //size ko initialize 0 se kr diya ;;;
    }

    class node { // node cclass bana li hamne
        String data;
        node next;
       

        node(String data) { // CONSTRUCTOR bana liya
            this.data = data;
            this.next = null;
            size++;
           
        }
       

    }

    // ADD--1.FIRST...2.LAST
    //add first
    public void addfirst(String data) {
        node newnode = new node(data); //ek newnode banaya
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head; //head ko new node ke next me dal dila;;;matlab head ek kadam aage gaya 
        head = newnode; //badme new node ko hi head bana diya;;

    }

    // ADD LAST
    public void addlast(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        node currnode = head;  //pehle currnode ko head banaya;;
        while (currnode.next != null) {  //jabtak currnode ka head null nahi hota
            currnode = currnode.next;    // currnode ka jo next hai usko currnode me dalneka 

        }
        currnode.next = newnode; //currnpde ka next jo hai usko newnode bananeka;;

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
        size--;   //delete hone ke bad size ko kam karna padega
        head = head.next; // head.next ko head banaya to head carbej ho gya
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        size --;       ////delete hone ke bad size ko kam karna padega   
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
    public int getsize(){
        return size;
    }

    



    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.addfirst("is");
        list.addfirst("varad");
        list.addfirst("a");
        list.printlist();

        list.addlast("good");
        list.printlist();
        list.addlast("but");
        list.addlast("not");
        list.addlast("not");
        
        list.deletelast();
        list.deletefirst();
        list.deletelast();
        list.deletelast();
        list.printlist();
        list.addfirst("a");
        
        list.addlast("so");
        list.printlist();
        System.out.println(list.size);
        
    }

}
