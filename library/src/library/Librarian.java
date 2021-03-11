package library;
import java.util.Map;
import java.util.HashMap;

public class Librarian {
	String m_name;
	Map<String,person> recordPerson;//记录人们借书情况，方便查看
	public Librarian(String name) {
		this.m_name=name;
		this.recordPerson=new HashMap();
	}
	
	public void upDate(person p) {
		this.recordPerson.put(p.m_name, p);
	}
	
	public void lookUpPerson(String name) {
		System.out.println("用户名字:"+name);
		this.recordPerson.get(name).lookUp();		
	}
}
