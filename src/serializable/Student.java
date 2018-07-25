package serializable;

import java.io.Serializable;

public class Student implements Serializable{
	private String stuno;
	private String stuname;
	private transient int stusge; //transient修饰表示该元素不会进行jvm默认的序列化
	
	
	public Student(){
		
	}
	
	
	
	public Student(String stuno, String stuname, int stusge) {
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.stusge = stusge;
	}



	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStusge() {
		return stusge;
	}
	public void setStusge(int stusge) {
		this.stusge = stusge;
	}
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", stuname=" + stuname + ", stusge=" + stusge + "]";
	}
	
}
