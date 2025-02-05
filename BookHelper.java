package co.operations;

import javax.persistence.EntityManager;

import com.Driver.Main;
import com.entities.Book;
import com.entities.Publisher;

public class BookHelper {

	public static void addBook(String title,int publicyear,int totalcopy,Publisher publisher ) {
		Book b=new Book();
		b.setTitle(title);
		b.setPublicyear(publicyear);
		b.setTotalcopy(totalcopy);
		b.setAvailablecopies(totalcopy);
		b.setPublisher(publisher);
		
		Main.et.begin();
		Main.em.persist(b);
		Main.et.commit();
	}

	public static Publisher findOrCreatePublisher(String name, long phno, String email, String address) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
