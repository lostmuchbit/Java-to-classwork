package library;
import java.util.HashMap;
import java.util.Map;

public class person {
	String m_name;
	Map<String,Integer> record;//用户借书的情况(书，对应数量)
	
	public person(String name) {
		this.m_name=name;
		this.record=new HashMap();
	}
	
	public void getbook(bookList bl) {
		/*借书，从书单中获取信息*/
		for(Map.Entry<String, Integer> entry:bl.Booklist.entrySet()) {
			String name=entry.getKey();
			if(this.record.containsKey(name)) {
				this.record.put(name, this.record.get(name)+entry.getValue());
			}
			else {
				this.record.put(name, entry.getValue());
			}	
		}
		
	}
	
	public void backbook(bookList bl) {
		/*还书,从书单中获取信息*/
		for(Map.Entry<String, Integer> entry:bl.Booklist.entrySet()) {
			String name=entry.getKey();
			this.record.put(name, this.record.get(name)-entry.getValue());
			if(this.record.get(name)==0) {
				this.record.remove(name);
			}
		}
	}
	public void lookUp() {
		/*查看自身借书情况*/
		for(Map.Entry<String, Integer> entry:this.record.entrySet()) {
			System.out.println("书名:"+entry.getKey()+"  数量:"+entry.getValue());
		}
	}
	
}
