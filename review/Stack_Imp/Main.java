class stack{
	int size;
	int top;
	int[] arr;
	public stack(int size)
	{
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	public void pushelement(int ele)
	{
		if(top==arr.length)
			System.out.print("stack already full");
		else
			arr[++top]=ele;
	}
	public int peekele() {
		if(top==-1) {
			System.out.print("stack is empty");
			return -1;
		}
		return arr[top];
		
	}
	public void popele() {
		if(top==-1) {
			System.out.print("stack is already empty");
			
		}
		top--;
	}
	
}
public class Main{
	public static void main(String[] args) {
		stack st=new stack(5);
		st.pushelement(1);
		st.pushelement(2);
		st.pushelement(3);
		System.out.print(st.peekele());
		st.popele();
		
	}
}

