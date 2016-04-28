package com.ustc.test;

class LinkListApp
{
	static LinkList merge(LinkList one,LinkList two)
	{
		Link current=two.first;
		while(current !=null)
		{
			one.insertRear(current.iData, current.dData);
			current=current.next;
		}
		return one;
		
	}
public static void main(String[] args)
   {
	
   LinkList theList = new LinkList();  // make new list

   theList.insertFirst(22, 2.99);      // insert four items
   theList.insertFirst(44, 4.99);
   theList.insertFirst(66, 6.99);
   theList.insertFirst(88, 8.99);

   theList.displayList();              // display list
   LinkList theList1 = new LinkList();  // make new list

   theList1.insertRear(22, 2.99);      // insert four items
   theList1.insertRear(44, 4.99);
   theList1.insertRear(66, 6.99);
   theList1.insertRear(88, 8.99);
   theList1.displayList();
   //LinkList newlist=merge(theList,theList1);
   //newlist.displayList();
   
   /*Link f=theList.find(44);
   if(f != null)
	   System.out.println("Found link with key " +f.iData );
   else 
	   System.out.println("can not find link");
   Link d=theList.delete(88);
   if(d != null)
	   System.out.println("Delete link with key " +d.iData );
   else 
	   System.out.println("can not delete link");
   theList.displayList();              // display list
*/   }  // end main()
}  // end class LinkListApp