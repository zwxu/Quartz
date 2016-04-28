package com.ustc.test;
public class LinkList
{
public Link first;            // ref to first link on list

//-------------------------------------------------------------
public LinkList()              // constructor
   {
   first = null;  // no links on list yet
   //带头结点做法，相应变动节点操作
   //first=new Link();
   //first.next=null;
   }
//-------------------------------------------------------------
public boolean isEmpty()       // true if list is empty
   {
   return (first==null);
   }
//-------------------------------------------------------------
//每次都会更新first
public void insertFirst(int id, double dd)
{                           // make new link
   Link newLink = new Link(id, dd);
   newLink.next = first;       // newLink --> old first
   first = newLink;            // first --> newLink 
}
//不断更新first。next，必须记录前缀
public void insertRear(int id,double dd)
{
	  Link newLink = new Link(id, dd);
	  Link previous=null;
	   Link current=first;
	   while(current != null)
	   { // or key > current,
		   previous = current;
		   current = current.next; 
	   }
	   if(previous==null) 
		   first = newLink; 
	   else // not at beginning
		   previous.next = newLink;
	   newLink.next = null; //置表尾为空

    
}
//-------------------------------------------------------------
public Link deleteFirst()      // delete first item
   {                           // (assumes list not empty)
   Link temp = first;          // save reference to link
   first = first.next;         // delete it: first-->old next
   return temp;                // return deleted link
   }
//-------------------------------------------------------------
public void displayList()
   {
   System.out.print("List (first-->last): ");
   Link current = first;       // start at beginning of list
   while(current != null)      // until end of list,
      {
      current.displayLink();   // print data
      current = current.next;  // move to next link
      }
   System.out.println("");
   }
public Link find(int key){
	Link current=first;
	while(current.iData != key){
		if(current.next == null)
			return null;
			else 
				current=current.next;
	}
	return current;
}
public Link delete(int key){
	Link current =first;
	Link previous = first;
	while(current.iData != key)
	{
		if(current.next == null)
		{
			return null;
		}
		else 
		{
			previous=current;
			current=current.next;
		}
	}
	if(current == first)
		first=first.next;
	else 
		previous.next=current.next;
		return current;
}
//-------------------------------------------------------------
}  // end class LinkList