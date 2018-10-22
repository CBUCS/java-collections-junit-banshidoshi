
 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;

 import java.util.*;
 import java.util.concurrent.LinkedBlockingQueue;

 import static org.junit.jupiter.api.Assertions.fail;

 /**
  * This class contains text cases for
  * 1. Set
  * 2. Linked List
  * 3. Stack
  * 4. Queue
  * 5. HashMap
  */
 public class JUnitTest {
     //Set
     private Set<Integer> integerSet;
    //Linked List
    private List<Integer> linkedList;
    private ArrayList<Integer> intList;
    //Stack
    Stack<Integer> integerStack;
    //Queue
    Queue<Integer> integerQueue ;
    //Hash Map
    HashMap<Integer,Integer> integerHashMap;
    
     /**
      * 1. Set Tests
      */
     @Test
     public void setAdd(){
         integerSet = new HashSet<Integer>();
         Assertions.assertTrue(integerSet.add(1));
     }
     @Test
     public void setClear(){
         integerSet = new HashSet<Integer>();
         integerSet.add(1);
         integerSet.add(2);
         integerSet.clear();
         Assertions.assertEquals(0,integerSet.size());
     }
     @Test
     public void setContains(){
         integerSet = new HashSet<Integer>();
         integerSet.add(1);
         Assertions.assertTrue(integerSet.contains(1));
     }
     @Test
     public void setContainsAll(){
         integerSet = new HashSet<Integer>();
         integerSet.add(1);
         integerSet.add(2);
         intList = new ArrayList<Integer>();
         intList.add(1);
         intList.add(2);
         Assertions.assertTrue(integerSet.containsAll(intList));
     }
     @Test
     public void setIsEmpty(){
         integerSet = new HashSet<Integer>();
         Assertions.assertTrue(integerSet.isEmpty());
     }

     @Test
     public void setEquals(){
         integerSet = new HashSet<Integer>();
         Set<Integer> integerSet2 = new HashSet<Integer>();
         integerSet.add(1);
         integerSet2.add(1);
         Assertions.assertTrue(integerSet.equals(integerSet2));
     }
     @Test
     public void setRemove(){
         integerSet = new HashSet<Integer>();
         integerSet.add(1);
         Assertions.assertTrue(integerSet.remove(1));
     }
     @Test
     public void setRetainsAll(){
         integerSet = new HashSet<Integer>();
         Set<Integer> integerSet2 = new HashSet<Integer>();
         integerSet.add(1);
         integerSet.add(2);
         integerSet2.add(1);
         Assertions.assertTrue(integerSet.retainAll(integerSet2));
     }
     @Test
     public void setSize(){
         integerSet = new HashSet<Integer>();
         integerSet.add(1);
         Assertions.assertEquals(1,integerSet.size());
     }


     /**
      * 2. Linked List Tests
      */
    //JUnitTest for null
     @Test
     public void linkedListNotNull(){
        linkedList = new LinkedList<Integer>();
        Assertions.assertNotNull(linkedList);
     }

     //JUnitTest for adding element to linked list
     @Test
     public void  linkedListAdd() {
         linkedList = new LinkedList<Integer>();
         Assertions.assertTrue(linkedList.add(1));
     }

     //JUnitTest for - after adding clearing linked list
     @Test
     public void  linkedListClear() {
         linkedList = new LinkedList<Integer>();
         linkedList.add(1);
         linkedList.clear();
         Assertions.assertEquals( 0,linkedList.size());
     }

     //JUnitTest for checking containing element or not
     @Test
     public void  linkedListContains(){
         linkedList = new LinkedList<Integer>();
         linkedList.add(1);
         Assertions.assertTrue(linkedList.contains(1));
     }

     //JUnitTest for checking containing elements or not
     @Test
     public void  linkedListContainsAll(){
         linkedList = new LinkedList<Integer>();
         linkedList.add(1);
         linkedList.add(2);
         intList = new ArrayList<Integer>();
         intList.add(1);
         intList.add(2);
         Assertions.assertTrue(linkedList.containsAll(intList));
     }

     //JUnitTest fir getting first element from added list
     @Test
     public void linkedListGetFirst()
     {
        LinkedList<Integer> multiLinkedList = new LinkedList<Integer>(); // [1 2 3 4 5 6]
         multiLinkedList.addFirst(1);
         multiLinkedList.addFirst(2);
         multiLinkedList.addFirst(3);
         multiLinkedList.addFirst(4);
         multiLinkedList.addFirst(5);
         multiLinkedList.addFirst(6);

         try {
             multiLinkedList.getFirst();
             fail();
         }
         catch (NoSuchElementException e) {
             /* JUnitTest passed */
         }
     }

     //JUnitTest for checking for empty
     @Test
     public void  linkedListIsEmpty() {
         linkedList = new LinkedList<Integer>();
         Assertions.assertTrue(linkedList.isEmpty());
     }

     //JUnitTest fir removing element from linked list
     @Test
     public void  linkedListRemove() {
         linkedList = new LinkedList<>();
         linkedList.add(1);
         Assertions.assertEquals((Integer) 1,linkedList.remove(0));
     }


     //JUnitTest for getting size of linked list
     @Test
     public void  linkedListSize(){
         linkedList = new LinkedList<>();
         linkedList.add(1);
         Assertions.assertEquals(1,linkedList.size());
     }

     /**
      * 3. Stack Tests
      */
     @Test
     public void stackNotNull(){
         integerStack = new Stack<>();
         Assertions.assertNotNull(integerStack);
     }

     @Test
     public void stackPush() {
         integerStack = new Stack<>();
         Assertions.assertEquals((Integer) 1,integerStack.push(1));
     }

     @Test
     public void stackPop() {
         integerStack = new Stack<>();
         integerStack.add(1);
         Assertions.assertEquals((Integer) 1,integerStack.pop());
     }

     @Test
     public void stackIsEmpty() {
         integerStack = new Stack<>();
         Assertions.assertTrue(integerStack.isEmpty());
     }

     @Test
     public void stackPeak() {
         integerStack = new Stack<>();
         integerStack.add(1);
         Assertions.assertEquals((Integer)1,integerStack.peek());
     }

     @Test
     public void stackSearch(){
         integerStack = new Stack<>();
         integerStack.add(1);
         Assertions.assertEquals(1,(integerStack.search(1)));
     }

     @Test
     public void stackSize(){
         integerStack = new Stack<>();
         integerStack.add(1);
         Assertions.assertEquals(1,integerStack.size());
     }

     /**
      * 4. Queue Tests
      */
     @Test
     public void queueAdd() {
         integerQueue = new LinkedBlockingQueue<>();
         Assertions.assertTrue(integerQueue.add(1));
     }
     @Test
     public void queueElement() {
         integerQueue = new LinkedBlockingQueue<>();
         integerQueue.add(1);
         Assertions.assertEquals((Integer) 1,integerQueue.element());
     }

     @Test
     public void queuePeak(){
         integerQueue = new LinkedBlockingQueue<>();
         Assertions.assertNull(integerQueue.peek());
         integerQueue.add(1);
         Assertions.assertEquals((Integer)1,integerQueue.peek());
     }

     @Test
     public void queueRemove(){
         integerQueue = new LinkedBlockingQueue<>();
         integerQueue.add(1);
         Assertions.assertEquals((Integer)1,integerQueue.remove());
     }

     @Test
     public void queuePoll(){
         integerQueue = new LinkedBlockingQueue<>();
         Assertions.assertNull(integerQueue.poll());
         integerQueue.add(1);
         Assertions.assertEquals((Integer)1,integerQueue.poll());
         Assertions.assertEquals(0,integerQueue.size());
     }

     /**
      * 5. HashMap Tests
      */
     @Test
     public void hashMapPut(){
         integerHashMap = new HashMap<>();
         Assertions.assertNull(integerHashMap.put(0,1));
     }


     @Test
     public void hashMapCompute(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         try
         {
             Assertions.assertEquals((Integer)2,integerHashMap.compute(0,(k, v) -> v==null ? 1: ++v));
         }catch (Exception e)
         {
         }
     }

     @Test
     public void hashMapGet(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         Assertions.assertEquals((Integer) 1,integerHashMap.get(0));
     }

     @Test
     public void hashMapClear(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         integerHashMap.clear();
         Assertions.assertEquals(0,integerHashMap.size());
     }

     @Test
     public void hashMapContainsKey(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         Assertions.assertTrue(integerHashMap.containsKey(0));
     }

     @Test
     public void hashMapSize(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         Assertions.assertEquals(1,integerHashMap.size());
     }

     @Test
     public void hashMapIsEmpty(){
         integerHashMap = new HashMap<>();
         Assertions.assertTrue(integerHashMap.isEmpty());
     }

     @Test
     public void hashMapContainsValue(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         Assertions.assertTrue(integerHashMap.containsValue(1));
     }

     @Test
     public void hashMapReplace(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         Assertions.assertTrue(integerHashMap.replace(0,1,2));
     }

     @Test
     public void hashMapEquals(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         HashMap<Integer,Integer> integerHashMap2 = new HashMap<>();
         integerHashMap2.put(0,1);
         Assertions.assertTrue(integerHashMap.equals(integerHashMap2));
     }


     @Test
     public void hashMapRemove(){
         integerHashMap = new HashMap<>();
         integerHashMap.put(0,1);
         Assertions.assertTrue(integerHashMap.remove(0,1));
     }

}