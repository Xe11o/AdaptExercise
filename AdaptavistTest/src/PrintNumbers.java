

public class PrintNumbers {
	
	static String num;
	
    public static void main(String[] args) {
    	
        PrintNumbers pn = new PrintNumbers();
            	
    	for (int i = 1; i <= 100; i++) {

    		num = getNumber(i);    		
    		System.out.println(num);
    	}
    }
    
    public static String getNumber(int i) {
    	
    	num = Integer.toString(i);
    	
		if (i % 3 == 0 && i % 5 == 0)
			num = "FizzBuzz";
		else if (i % 3 == 0)
			num = "Fizz";
		else if (i % 5 == 0)
			num = "Buzz";
		
		return num;
    }
}
