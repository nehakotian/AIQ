import java.util.ArrayList;

public class Post {
	private String feed;
	ArrayList<Reply> replies; 

	//private Reply[] replies;
	//private int idx;
	
	public Post() {
	}
	
	
	public Post(String feed)
	{
		this.feed=feed;
		replies = new ArrayList<>(); 
		//replies = new Reply[10];
	}


	public void addReply(Reply reply) {
		replies.add(reply);
		//replies[idx++] = reply;
	}
	
	public void printReplies() {
		System.out.println("Post: " + "[Replies: " + replies.size() + "]");
		//for (Post repl:replies) {
		//		System.out.println(reply);
		//}
//		for (int i = 0; i < idx; i++) {
//			System.out.println(i+1 +") " + replies[i]);
//		}
	}
	
}
