package connection;

public class Logic {
	
	
	public Logic() {
		
	}
	
	
	public int squareReturn(String inputLine) {
	
		int num = Integer.parseInt(inputLine);
		
		return(num*num);
	}
	
	public String stringReverse(String inputLine) {
		String rValue = "";
		
		for(int i = inputLine.length()-1; i >= 0; i--) {
			rValue += inputLine.substring(i,i+1);
		}
		
		return(rValue);
		
	}

}
