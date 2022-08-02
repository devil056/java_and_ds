import java.sql.Timestamp;
import java.time.Instant;

class TimeStamp{
	public static void main(String[] args){
		Timestamp i1=Timestamp.from(Instant.now());
		System.out.println(i1);
	}
}
