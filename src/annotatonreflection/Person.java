package annotatonreflection;

/**
 *  ע�Ͳ��ܱ����������ȡ 
 */
@Table("person")
public class Person extends Object {
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		super();
	}
	
	//select * from person where age =25 and name='wwj'; 
	
	
	

}
