package annotatonreflection;

/**
 *  ע�Ͳ��ܱ����������ȡ 
 */
@Table("person")
public class Person {
	//ע������Ŀ�ꣿ
	//������������,�����������ȡ,�������ȡ
	@Column(name="name",res="wwj")
	private String name;
	
	@Column(name="age",res="25")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//select * from person where age =25 and name='wwj'; 
	

}
