package annotation;

import annotation.StudentGender.Gender;

/**
 * ѧ����Ϣ��
 * @author ghost
 *
 */
@Persion(name="haha",age=18, hobby={"test1","test2"})
public class Student {

	@StudentGender(gender=Gender.BOY)
	private String stuGender;

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	
	
}
