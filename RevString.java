package AutomationTesting;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Avadh Bhalani";
		String st = rev(str);

		System.out.println(st);
	}

	public static String rev(String input){
	        char[] ch = input.toCharArray() ;
	        int start = 0;
	        int end = ch.length -1;
	        
	        while(start<end){
	            
	            char temp = ch[start];
	            ch[start] = ch[end];
	            ch[end] = temp;
	            
	            start ++;
	            end --;
	            
	        }
	       
			return new String(ch);
	        
	    }

}
