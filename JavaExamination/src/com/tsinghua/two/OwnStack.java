package com.tsinghua.two;

public class OwnStack {
	private int stackLength=2;
	private String[] stack=new String[stackLength];
	private int pointer=0;
	private int size=0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OwnStack ownStack=new OwnStack();
		ownStack.pop();
		System.out.println("是否空了："+ownStack.isEmpty());
		ownStack.push("你好");
		System.out.println("是否空了："+ownStack.isEmpty());
		ownStack.pop();
		ownStack.pop();
		ownStack.push("one");
		ownStack.push("two");
		ownStack.push("three");
		ownStack.push("four");
		System.out.println("是否满了："+ownStack.isFull());
		ownStack.print();
		ownStack.getSize();
		ownStack.pop();
		ownStack.getSize();
		System.out.println("是否满了："+ownStack.isFull());
		ownStack.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("=========start print=======");
		for (int i = size-1; i >=0 ; i--) {
			System.out.println(stack[i]);
		}
		System.out.println("=========end print=========");
	}

	public void push(String string){
		if (isFull()) {
			System.out.println("栈已经满了，请不要再添加了");
		}else {
			System.out.println("将\""+string+"\"放入栈中");
			stack[pointer]=string;
			pointerMoveToNext();
		}
		
	}
	
	public boolean isFull() {
		if (pointer==stackLength) {
			return true;
		}
		return false;
	}

	public String pop(){
		if (isEmpty()) {
			System.out.println("栈已经拿完了，没什么可以送你的了");
			return null;
		}else {
			String result=stack[pointer-1];
			System.out.println("将\""+result+"\"从栈中取出");
			pointerMoveToPrevious();
			return result;
		}
		
	}
	public boolean isEmpty() {
		if (pointer==0) {
			return true;
		}
		return false;
	}

	public int getSize(){
		System.out.println("个数"+this.size);
		return this.size;
		
	}
	private void pointerMoveToNext() {
		if (pointer<stackLength) {
			pointer++;
			size++;
		}
	}
	private void pointerMoveToPrevious() {
		if (pointer>0) {
			pointer--;
			size--;
		}
	}
}
