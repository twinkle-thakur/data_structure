package stack;
import arraylist.Array_list_method;
public class StackUsingArrayList {
	Array_list_method list;
	StackUsingArrayList()
{
		list=new Array_list_method();
		}
	public void push(int data) {
		list.add(data);
	}
	public int pop() {
		int data=list.get(list.size()-1);
		list.deleteByIndex(list.size()-1);
		return data;
	}
	public int peek() {
		return list.get(list.size()-1);
	}
	public void print() {
	 for(int i=list.size()-1;i>=0;i--)	{
		 System.out.println(list.get(i)+" ");
	 }
	}
	
	public int size() {
		return list.size();
	}
}
