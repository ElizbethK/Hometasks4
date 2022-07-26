# Hometask4: Parameterization, Java collections

  1. Implement the linked list shown in the UML diagram below.
        
 ![image](https://user-images.githubusercontent.com/101325108/180993560-6f78ada6-3eb3-40fa-9329-7a905bd96bd3.png)
 

 

 
  2. Make a comparative analysis of the performance of the main Java collections.
 
        
Write a test class that measures the execution time of basic operations – adding, inserting, deleting elements

 a. Compare the performance of ArrayList and LinkedList for basic operations

 b. Compare the performance of HashSet, LinkedHashSet, TreeSet for basic operations

 c. Compare the performance of HashMap, LinkedHashMap, TreeMap
      
   
   *******************************************************
  --> 1. Performance comparison of MyLinkedList and java.util.LinkedList.
  
/Units of measurement: nanoseconds/

![image](https://user-images.githubusercontent.com/101325108/180994338-44299ee4-a8f2-41ae-88c1-98f2f4351847.png)

![image](https://user-images.githubusercontent.com/101325108/180994438-a29de2b2-9e11-42ab-bb4e-bb7520ade57d.png)

        The MyLinkedList I wrote has much better performance in terms of performing the clear operation. 
        In the add by index, get, remove operations, it has also become more efficient, yielding to the Java implementation only in the execution of add.
        
![image](https://user-images.githubusercontent.com/101325108/181000809-542a8c7e-5cf2-4e8b-8f8e-b10815f47f5f.png)




  --> 2. Comparative analysis of the performance of the main Java collections.
  
/Units: Nanoseconds/ 
 

 a) Compare ArrayList and LinkedList performance for basic operations


 - Add and clean operations:

![image](https://user-images.githubusercontent.com/101325108/180995386-8d91766e-d7bc-4778-941b-4094abfbbd44.png)

      The add operation is most quickly performed in LinkedList, and clear – in ArrayList.

 - Operations of inserting by index, receiving, deleting an element:

![image](https://user-images.githubusercontent.com/101325108/180995571-f44b825e-5ee3-4a13-9bc9-8b902a62ff60.png)

      In this case, the longest operations add, get, remove proved themselves in ArrayList.
      
 ![image](https://user-images.githubusercontent.com/101325108/180995741-549dd244-826b-448d-910e-cac0917fd5e0.png)


        ArrayList is implemented internally as a regular array.
        
              + the elements are arranged one after the other; 
              + quick get and set operations, since access is performed by index;
              - When inserting an element in the middle, you have to shift all the elements after it by one, then insert the element into an empty space. 
              This is more than in LinkedList.

        LinkedList is implemented internally as a linked list. The elements are connected to each other, but are located in different memory cells;
              + it is convenient to insert elements in the middle - only references to neighbors change;
              - it is inconvenient to use get and set, because you need to go through all the elements. It's a long time.

        In almost all cases, it is advised to use ArrayList. 
        LinkedList will be useful if you often need to insert elements not at the beginning or end.
        
        
  b)	Compare HashSet, LinkedHashSet, TreeSet performance for basic operations
 
 
 - Add and clean operations:

![image](https://user-images.githubusercontent.com/101325108/180996303-fbe1d484-ecfa-4fdc-9fcd-13bd927635f4.png)

          The add operation in the TreeSet turned out to be the longest, but the clear operation in the same TreeSet became the fastest.
          

 - Operations of inserting by index, receiving, deleting an element:

![image](https://user-images.githubusercontent.com/101325108/180996416-a17ec97e-eb9f-4fa1-8861-dbcbb374c3c2.png)

        As you can see, TreeSet again turned out to be the owner of the longest contains and remove operations. 
        In this case, LinkedHashSet's performance is higher in all parameters.
  
  
  ![image](https://user-images.githubusercontent.com/101325108/180996714-be9bcc2c-8bd7-4da5-a934-60e3735f8973.png)

          Thus, LinkedHashSet was in the first place in terms of performance. Next comes the HashSet. 
          If we need a guaranteed order of elements, we use LinkedHashSet.
          If you need it to be added to a new bucket every time, we take a HashSet.
          TreeSet is better to use if you need an ordered data structure and fast search is important.
          
          
   c) Compare the performance of HashMap, LinkedHashMap, TreeMap
   

 - Add and clean operations:

![image](https://user-images.githubusercontent.com/101325108/180998093-e225d6aa-9b36-42c5-b5bd-8a66f7042451.png)

        LinkedHashMap showed the highest performance in performing the put operation. Clear – TreeMap.
        

 - Operations of inserting by index, receiving, deleting an element:

![image](https://user-images.githubusercontent.com/101325108/180998126-4e5a5aad-4c4c-4550-a7e1-aada1f662b1a.png)


        TreeMap spent the most nanoseconds executing remove. 
        LinkedHashMap was the leader in performance in get and remove operations.
        
 ![image](https://user-images.githubusercontent.com/101325108/180998328-6e163566-21c1-4de4-9a33-4dff0837de3a.png)



![image](https://user-images.githubusercontent.com/101325108/181000936-8c94aedf-567b-4164-878a-18abb5ab292f.png)  ![image](https://user-images.githubusercontent.com/101325108/181000974-fe1a8934-e0c9-4c8e-86c8-5f21e90c3d94.png)



**********************************************
When & What should be used: 

HashMap – if the order of elements is the same when traversing; if we are satisfied that when an element with the same key is added again, the first value will be lost.

LinkedHashMap – if it is important to keep the order of adding elements;

TreeMap – if you need a set of elements sorted by keys.
**********************************************





 
