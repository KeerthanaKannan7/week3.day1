package week3.day1;

public class Students {
	
	
	
	public int getStudentInfo(int id)
	{
		return id;
	}
	
	public String getStudentInfo(int id, String name)
	{
		id = 456;
		System.out.println(id);
		return name;
	}
	
	public long getStudentInfo(String email, long phoneNumber)
	{
		email = "kk123@gmail.com";
		return phoneNumber;
	}
	
	public static void main (String [] args)
	{
		Students cons = new Students();
		System.out.println(cons.getStudentInfo(123));
		System.out.println(cons.getStudentInfo(0, "Keerthana"));
		System.out.println(cons.getStudentInfo("kkkk", 9095326910l));
		
	}
}
