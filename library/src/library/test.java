package library;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1 = new book("三国",1);
		book b2 = new book("水浒",1);
		book b3 = new book("西游",1);
		book b4 = new book("红楼",1);
		
		bookList borrowbook = new bookList();
		borrowbook.addBook(b1);
		borrowbook.addBook(b2);
		borrowbook.addBook(b3);
		borrowbook.addBook(b4);
		
		person p1 = new person("汪淼");
		p1.getbook(borrowbook);
		
		Librarian L1 = new Librarian("章北海");
		L1.upDate(p1);
		L1.lookUpPerson(p1.m_name);
		
	}

}
