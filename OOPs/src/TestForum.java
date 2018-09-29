
public class TestForum {
	public static void main(String[] args) {
		
		
		Forum java = new Forum("java");
		
		Post p1=new Post("What is Java?");
		
		p1.addReply(new Reply("Object Oriented Programming"));
		p1.addReply(new Reply("Platform independent"));
		java.addPost(p1); 
		
		
		Post p2=new Post("New Features in Java8");
		p2.addReply(new Reply("Lambda expressions"));
		p2.addReply(new Reply("default methods"));
		p2.addReply(new Reply("Improved collection"));
		p2.addReply(new Reply("Base 64 Encoding"));
		p2.addReply(new Reply("New Date Time API"));

		java.addPost(p2);
		
		
		java.showPosts();
		//display form topic
		
		//list all post in that topic
		//show all comments of each post
		
		
	}
}
