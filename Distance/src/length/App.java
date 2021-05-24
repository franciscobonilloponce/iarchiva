package length;

public class App {

	public static void main(String[] args) {
		LevenshteinDistance distance = new LevenshteinDistance();
		distance.printDistance("", ""); 
		distance.printDistance("1234567890", "1"); 
		distance.printDistance("1234567890", "12"); 
		distance.printDistance("1234567890", "123"); 
		distance.printDistance("1234567890", "1234"); 
		distance.printDistance("1234567890", "12345"); 
		distance.printDistance("1234567890", "123456"); 
		distance.printDistance("1234567890", "1234567"); 
		distance.printDistance("1234567890", "12345678"); 
		distance.printDistance("1234567890", "123456789"); 
		distance.printDistance("1234567890", "1234567890"); 
		distance.printDistance("1234567890", "1234567980"); 
		distance.printDistance("47/2010", "472010"); 
		distance.printDistance("47/2010", "472011"); 
		distance.printDistance("47/2010", "AB.CDEF"); 
		distance.printDistance("47/2010", "4B.CDEFG"); 
		distance.printDistance("47/2010", "AB.CDEFG"); 
		distance.printDistance("The quick fox jumped", "The fox jumped"); 
		distance.printDistance("The quick fox jumped", "The fox"); 
		distance.printDistance("The quick fox jumped", "The quick fox jumped off the balcany"); 
		distance.printDistance("kitten", "sitting"); 
		distance.printDistance("rosettacode", "raisethysword"); 
		distance.printDistance(new StringBuilder("rosettacode").reverse().toString(), new StringBuilder("raisethysword").reverse().toString()); 
		

		
	}

}
