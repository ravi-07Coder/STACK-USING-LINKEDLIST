package implementation;
import myinterface.StackADT;
public class MyStack implements StackADT {
//head
    private Node top;
    //to keep number
    // of nodes
  private int size;
//add first

    public MyStack() {
        top=null;
        size=0;
    }
    @Override
    public void push(int element) {
         Node node = new Node(element);
            node.setNext(top);
            top = node;
            size++;

    }

    @Override
    public int pop() {
      int response=0;
        if (!isEmpty())
        {
            response=top.getData();
            top=top.getNext();
           size--;
        }
        else {
            System.out.println("stack underflow");
        }
    return  response;
    }//end of the method
    @Override
    public int peek() {
        int response=0;
        if (!isEmpty())
            response=top.getData();
        else
            System.out.println("stack is empty");
        return response;
    }//end of the method
    @Override
    public boolean isEmpty() {
        return top==null;
    }

    @Override
    public int size() {
        return size;
    }
    public void traverse()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.getData() + ",");
            temp=temp.getNext();
        }
        System.out.println("end of the loop");
    }//end of the method

    @Override
    public int sizeByTraverseing() {
        int count=0;
        Node temp=top;
        while(temp!=null)
        {
            count=count+1;
            temp=temp.getNext();
        }
        return  count;
    }
    }//end of the class
