class Student
{
private int roll;
private String name;

Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}

Student()
{
}


public int getRoll()
{
return roll;
}

public String  getName()
{
return name;
}

}


class  Thirteen
{
public static void main(String args[])
{

//object array

Student abc=new Student();

Student st[]=new Student[3];

st[0]=new Student(10,"Jesus");
st[1]=new Student(20,"Christ");
st[2]=new Student(30,"Mary");


for(Student s1:st)
System.out.println(s1.getRoll()+"\t"+s1.getName());


}
}
