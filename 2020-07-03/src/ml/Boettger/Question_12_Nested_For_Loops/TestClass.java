package ml.Boettger.Question_12_Nested_For_Loops;

public class TestClass {
	public static void main(String[] args) {
		//for : for(int i = 0; i < 10; i++) {  syntax error
		outer : for(int i = 0; i < 10; i++) {  
			for (int j = 0; j < 10; j++) {
				//if (i+ j > 10)   break for;  syntax error
				if (i+ j > 10)
				{	
					break outer;
				}	
	        }
	        System.out.println(i + ". hello");
	    }
	}
}
