
public class Book {
	
	private String title;
	private Member member;
	public Book(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Member getMember() {
		return member;
	}
	
	public void setMember(Member member) {
		this.member=member;
	}
	public void status() {
		if(member == null)
			System.out.println("Book not issued to anyone");
		else
			System.out.println("Book issued to " + member.getName());
		
	}
	
	//Business Logic
	public void issueBook (Member mbr) {
		if(mbr.getBook()!=null) {
			System.out.println(mbr.getName() + "already issued a book");
		}
		else if(member!=null) {
			System.out.println(title + "is already issued" );
		}
		else {
			mbr.setBook(this);
			this.member = mbr;
			System.out.println(title +  "issued to " + mbr.getName());
		}
		
	}
	
	public void returnBook(Member mbr) {
		if(mbr.getBook()== null) {
			System.out.println("No book issued to " + mbr.getName());
		}else if(member == null) {
			System.out.println(title + "is not issued to anyone");
		}else if(!mbr.getBook().getTitle().equals(title) || 
				!member.getName().equals(mbr.getName())) {
			System.out.println(title + " is not issues to " + mbr.getName());
			
			
		}
		else
		{
			mbr.setBook(null);
			this.member = null;
			System.out.println(title + "returned by " + mbr.getName());
		}
		
	}

}
