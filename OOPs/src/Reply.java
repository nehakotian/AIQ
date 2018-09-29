
public class Reply {
	private String comment;

	
	public Reply() {	
	} 

	public Reply(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return comment;
	}
	
	
}
