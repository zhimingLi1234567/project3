// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @author zl239
 * @version Jul 12, 2024
 * @param <T>
 */
public class DLinkedList<T>
{
    // ~ Fields ................................................................
    private Node<T> head;
    private Node<T> tail;
    private int size;

    // ~ Constructors ..........................................................
    /**
     * Create a new DLinkedList object.
     */
    public DLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // ~Public Methods ........................................................
    
    /**
     * insert at head
     */
    public void insert(T value)
    {
        Node<T> newNode = new Node<T>(value);
        if(this.size == 0)
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else
        {
            newNode.setNext(head);
            head.setPrev(newNode);
            this.head = newNode;
        }
        size++;
    }
    
    /**
     * insert at pos
     */
    public void insert(T value, int pos)
    {
    }
    /**
     * remove from tail
     */
    public T removeTail()
    {
        //keep tail node info at temp
        Node<T> temp = this.tail;
        
        // set the node before tail become new tail
        // disconnect old tail node from list
        this.tail = tail.prev();
        this.tail.setNext(null);
        temp.setPrev(null);
        this.size--;
        return temp.value();
    }
    
    /**
     * remove from head
     */
    public T removeHead()
    {
        //keep head node info at temp
        Node<T> temp = this.head;
        
        // set the node after head become new head
        // disconnect old head node from list
        this.head = head.next();
        this.head.setPrev(null);
        temp.setNext(null);
        size--;
        return temp.value();
    }
    
    /**
     * return current size of linkedlist
     */
    public int getSize()
    {
        return this.size;
    }
    
    
    /**
     * This is a private Node class implement DLinkedList class
     * 
     *  @author Zhiming Li
     *  @version Jul 12, 2024
     */
    private class Node<T>
    {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        /**
         * constructor for node class
         * 
         * @param <T>
         * @param <T>
         */
        public Node(T data)
        {
            this.value = data;
            next = null;
            prev = null;
        }


        /**
         * get next node
         */
        public Node<T> next()
        {
            return this.next;
        }


        /**
         * set next node
         */
        public void setNext(Node<T> next)
        {
            this.next = next;
        }


        /**
         * get prev node
         */
        public Node<T> prev()
        {
            return this.prev;
        }


        /**
         * set prev node
         */
        public void setPrev(Node<T> prev)
        {
            this.prev = prev;
        }


        /**
         * get node value
         * @return 
         */
        public T value()
        {
            return this.value;
        }


        /**
         * set node value
         */
        public void setValue(T value)
        {
            this.value = value;
        }
    }
}
