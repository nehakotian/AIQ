import java.util.ArrayList;
import java.util.Vector;

import lti.bank.Transaction;

public class Forum {
	private String topic;
	//private Post[] posts ;
	//protected Vector<Post> posts;
	ArrayList<Post> posts; 
	//private int idx;
	
	
	public Forum() {		 
	}

	public Forum(String topic) {
		this.topic = topic;
		posts = new ArrayList<>(); //posts=new Post[5];
	}



	public void addPost(Post post) {
		posts.add(post);		//txns.add(new Transaction("Opening", balance, balance));

	
	}

	

	public void showPosts() {
		System.out.println(posts.size() + " post in forum topic: " + topic);
		for (Post post:posts) {
			if(post!= null)
			{
				System.out.println();
				System.out.println("Post:" + post);
				

			}
		}

		/*for (int i = 0; i < idx; i++) {
			System.out.println();
			posts[i].printReplies();
		}*/
	}

	
	
}
