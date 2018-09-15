import java.time.LocalTime;

public class DemoLocalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();
		
		LocalTime fiveThirty = LocalTime.parse("17:30:12");
		System.out.println(fiveThirty);
		
		LocalTime fourTen = LocalTime.of(16, 10);
		System.out.println(fourTen);
		
		System.out.println(fiveThirty.plusHours(12));
		System.out.println(fourTen.getHour());
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
	}

}
