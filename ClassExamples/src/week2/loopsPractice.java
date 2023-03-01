package week2;
import java.util.ArrayList;
import java.util.List;

public final class loopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> list = new ArrayList<>(); //int will not work here bc it is a primitive, it was to be wrapper
		 for (int i = 1; i <=10; i++) { //example of autoboxing, the compiler knows I am taking Integer and int
			 list.add(i);
		 }
		 for (Integer element : list) {
			 System.out.println(element);


	}

}
}
