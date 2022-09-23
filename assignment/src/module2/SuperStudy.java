package module2;
public class SuperStudy{
 public void X(){ 
	System.out.println("I am in SuperStudy.X()"); 
 }
	public static void main(String[] args){
		SuperStudyChild ssc = new SuperStudyChild();
		ssc.X();
	}
}
class SuperStudyChild extends SuperStudy
{
public void X()
{
super.X(); // if you will comment this you will get only one output(superStudyChild).
System.out.println("I am in SuperStudyChild.X()");
}
}