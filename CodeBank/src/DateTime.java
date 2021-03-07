import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date);
		
		//date
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(df.format(date));
		
		//time
		LocalTime time = LocalTime.now();
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(time.format(tf));
	}

}
