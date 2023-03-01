package week3;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abcdefghi");
		System.out.println(sb); //print before stringBuffer alteration 
		
		//arg 1 = start index
		//arg 2 = end index
		//arg 3 = what do you replace with 
		//this is kinda doing the same thing as two operations
			//first we delete the characters from position 0-5
			//then we insert the string at position 0 (start index)
		sb.replace(0, 3, "123456");
		System.out.println(sb);
		
		//this adds the character at position 0 
		
		sb.insert(0, "AbCdE");
		System.out.println(sb);
	}
}

//additional notes:
	//StringBuffers are mutable meaning you are not making a new variable in memory every time you alter string
		//basically a mutable version of string 
	//You can't use StringSuffers in place of strings but you should use them when concatenation (both support + tho)
	//StringBuffer.append() is very popular 
	//StringBuffers accept String input
	//you can easily convert from String to StringBuffer by using .toString() method
	//you cannot cast String to StringBuffer 
	

