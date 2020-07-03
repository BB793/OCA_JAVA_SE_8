package ml.Boettger.Ouestion_23_For_Loops_i_j;

public class TestClass {
	public static void main(String[] args) {
	outer:
	    for ( int i = 0 ; i<3 ; i++ ){
	        for  ( int j = 0 ; j<2 ; j++ ){
	            if ( i == j ){
	                continue outer;
	            }
	            System.out.println( "i=" + i + " , j=" + j );
	        }
	    }	
	}
}
