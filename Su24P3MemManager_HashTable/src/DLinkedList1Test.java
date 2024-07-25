import student.TestCase;

/**
 * This is a testClass for DLinkedList
 * 
 *  @author Zhiming Li
 *  @version Jul 12, 2024
 * @param <T>
 */
public class DLinkedList1Test
    extends TestCase
{
    //~ Fields ................................................................
    
    //empty linked list
    private DLinkedList<Integer> listEmpty;
    
    //linked list contains 2 values
    private DLinkedList<Integer> list2;
    
    //~ Constructors ..........................................................
    /**
     * setUp method
     */
    public void setUp()
    {
        listEmpty = new DLinkedList<Integer>();
        list2 = new DLinkedList<Integer>();
        list2.insert(1);
        list2.insert(2);
    }
    //~Public  Methods ........................................................

    /**
     * test insert method
     */
    public void testinsert()
    {
        list2.insert(3);
        list2.insert(4);
        assertEquals(4,list2.getSize());
    }
    
    /**
     * test getSize method
     */
    public void testgetSize()
    {
        assertEquals(0,listEmpty.getSize());
        assertEquals(2, list2.getSize());
    }
}
