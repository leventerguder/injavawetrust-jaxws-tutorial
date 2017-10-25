package test;

import com.daehosting.webservices.isbn.ISBNService;
import com.daehosting.webservices.isbn.ISBNServiceSoapType;

public class TestISBNService {

	public static void main(String[] args) {
		
		ISBNService service = new ISBNService();
		ISBNServiceSoapType serviceSoap = service.getISBNServiceSoap();
		//
		boolean isValidISBN10 = serviceSoap.isValidISBN10("0596009208");
		boolean isValidISBN13 = serviceSoap.isValidISBN13("978-0596009205");
		//
		//https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208/
		
		System.out.println(isValidISBN10);
		System.out.println(isValidISBN13);
	}
}
