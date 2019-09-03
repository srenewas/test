class Branch{
	String bid;
	String bname;
	
	Branch(String bid,String bname){
		this.bid = bid;
		this.bname = bname;		
	}
}
class Student{
	String sid;
	String sname;
	String saddr;
	Branch sbranch;

	Student(String sid,String sname,String saddr,Branch sbranch){
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.sbranch =sbranch;
		
	}
	public void getdetails() {
		System.out.println("STUDENT DETAILS!");
		System.out.println("-----------------");
		System.out.println("ID :"+sid);
		System.out.println("NAME :"+sname);
		System.out.println("ADDRESS :"+saddr);
		System.out.println("BRANCH :"+sbranch);
		System.out.println("BRANCH ID  :"+sbranch.bid);
		System.out.println("BRANCH NAME :"+sbranch.bname);
		System.out.println();
	}
}
class test{
	public static void main(String args []) {
		Branch sbranch = new Branch("B-456","hyderabad");
		Student s1 = new Student("S-111","AAA","HYD",sbranch);
		Student s2 = new Student("S-222","BBB","HYD",sbranch);
		Student s3 = new Student("S-333","CCC","HYD",sbranch);
		s1.getdetails();
		s2.getdetails();
		s3.getdetails();
		
	}
}