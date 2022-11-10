package Lab10;
public class Number1 {
	private String name;
	private int age;
	
	public Number1(){
		this.name="";
		this.age=0;
	}
	public Number1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getname(){
		return name;
	}
	public int getage() {
		return age;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void Person(String inName) {
		this.name=inName;
		this.age=0;
	}
	public static void main(String[] args) {
		Number1 Stu1=new Number1("Sam",19);
		Number1 Stu2=new Number1("Chase",19);
		Number1 Stu3=new Number1("Marti",19);
		Number1 Stu4=new Number1("Tyler",20);
		Number1 Stu5=new Number1("Julia",20);
		Number1 Stu6=new Number1("Aung",19);
		Number1 Stu7=new Number1("Ferdiana",20);
		Number1 Stu8=new Number1("Kaily",20);
		Number1 Stu9=new Number1("Tavius",19);
		System.out.println(Stu1.name + " " + Stu1.age);
		System.out.println(Stu2.name + " " + Stu2.age);
		System.out.println(Stu3.name + " " + Stu3.age);
		System.out.println(Stu4.name + " " + Stu4.age);
		System.out.println(Stu5.name + " " + Stu5.age);
		System.out.println(Stu6.name + " " + Stu6.age);
		System.out.println(Stu7.name + " " + Stu7.age);
		System.out.println(Stu8.name + " " + Stu8.age);
		System.out.println(Stu9.name + " " + Stu9.age);
	}
}
	
