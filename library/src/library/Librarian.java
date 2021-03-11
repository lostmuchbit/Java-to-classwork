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
		/*更新一个人的借书情况*/
		this.recordPerson.put(p.m_name, p);
	}
	
	public void lookUpPerson(String name) {
		/*管理员查看某人的借书情况*/
		System.out.println("用户名字:"+name);
		this.recordPerson.get(name).lookUp();		
	}
}
