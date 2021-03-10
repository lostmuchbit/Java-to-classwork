package quation;

public class explain {
	double m_a;
	double m_b;
	double m_c;
	double m_x1;
	double m_x2;
	boolean m_flag;
	public explain(double a,double b,double c) {
		this.m_a=a;
		this.m_b=b;
		this.m_c=c;
		if(Math.pow(b,2)-4*a*c>=0) {
			this.m_flag=true;
		}
		else {
			this.m_flag=false;
		}
	}
	public void figureUp(){
		this.m_x1=(- this.m_b + (Math.pow(this.m_b,2) - 4 * this.m_a * this.m_c)) / (2 * this.m_a);
		this.m_x2=(- this.m_b - (Math.pow(this.m_b,2) - 4 * this.m_a * this.m_c)) / (2 * this.m_a);
	}
}
