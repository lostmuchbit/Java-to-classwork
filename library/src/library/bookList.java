package library;
import java.util.HashMap;
import java.util.Map;

public class bookList {
	HashMap<String,Integer> Booklist;
	
	public bookList() {
		Booklist=new HashMap();
	}
	
	public void addBook(book bk) {
		if(this.Booklist.containsKey(bk.m_name)) {
			this.Booklist.put(bk.m_name, this.Booklist.get(bk.m_name)+bk.m_num);
		}
		else {
			this.Booklist.put(bk.m_name,bk.m_num);
		}
	}
	
}
