package textoperations;

public class SwapStrings {
		
		public void swapOperation(String s1,String s2) {
			if (s1.length() < s2.length())  // s1 should always be bigger 
			{
				String swap = s1; 
				s1 = s2; 
				s2 = swap; 
			} 
		}

}

