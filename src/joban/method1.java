package joban;

public class method1 {
int roll_no; 
String name;
float eng_marks;
float math_marks;
float hindi_marks; 
int avg;
void average()
{
	System.out.println((eng_marks+ math_marks+hindi_marks)/3);
}
public static void main(String args[])
{
	method1 s1=new method1();
	method1 s2=new method1();
	s1.roll_no=1;
	s1.name="joban";
	s1.eng_marks=76;
	s1.math_marks=99;
	s1.hindi_marks=70;
	
	
	s2.roll_no=1;
	s2.name="joban";
	s2.eng_marks=97;
	s2.math_marks=69;
	s2.hindi_marks=47;
	
	s1.average();
	s2.average();
}
}
