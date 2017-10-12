package lab7;

import java.util.LinkedList;

public class LinkedListLab {
	
	public static void main(String[] args) {
		LinkedList<String> tester= new LinkedList<String>();//first linked list
		LinkedList<String> tester2= new LinkedList<String>();//second linked list
		LinkedList<String> t2copy= new LinkedList<String>();//second linked list copy
		//add elements to 1st
		tester.add("Tulsa");
		tester.add("Ada");
		tester.add("Broken Arrow");
		tester.add("Owasso");
		tester.add(1,"OKC");//add to 2nd spot in 1st
		//add elements to 2nd
		tester2.add("74104");
		tester2.add("74135");
		tester2.add("foo");
		tester2.add("hello world");
		tester2.add("777");
		int count=1;
		for(int i=0;i<tester2.size();i++) {//add tester2 to tester alternating elements of each list
			tester.add(count,tester2.get(i));
			count+=2;
		}
		int remover=1;
		while(remover<tester.size()) {//remove every other element from updated tester
			tester.remove(remover);
			remover++;
		}
		for(int i=0;i<tester2.size();i++) {//deepy copy tester2 into new linked list
			t2copy.add(tester2.get(i));
		}
	}

}