interface InheritMultiple
{
	String str1="This";
}
interface Interface2
{
	String str2="is";
}
interface Interface3
{
	String str3="Java";
}
interface Interface4
{
	String str4="World!!!";
}
class SubClass implements InheritMultiple,Interface2,Interface3,Interface4
{
	String str;
	SubClass()
	{
		str=str1.concat(str2).concat(str3).concat(str4);
	}
	void display()
	{
		System.out.println(str);
	}
}
class MainClass2
{
	public static void main(String args[])
	{
		SubClass obj=new SubClass();
		obj.display();
	}
}