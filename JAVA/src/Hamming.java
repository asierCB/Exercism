public class Hamming {
	private int hammingDistance;
	
	public Hamming(String leftStrand, String rightStrand){
		String exceptionMessage = "strands must be of equal length";
		hammingDistance = 0;
		
		if (leftStrand.length() == rightStrand.length()) {
			int i = 0;
	        	        	        
	    	while(i < leftStrand.length()) {
	    		char caracterIzq = leftStrand.charAt(i);
		        char caracterDer = rightStrand.charAt(i);
		        
	    		if (caracterIzq != caracterDer) {
	    			hammingDistance ++;
	    			i++;
	    		}else{
	    			i++;
	    		}
            }
		}else {
			throw new IllegalArgumentException (exceptionMessage);
		}
	}
	public int getHammingDistance() {
		return hammingDistance;
	}
}