import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse
{
	public static void main(String[] args)
	{
		LocalDateTime time1, time2;
		int seconds1, seconds2, min1, min2, secondsDifference, minuteDifference;
		
		time1 = LocalDateTime.now();
		seconds1 = time1.getSecond();
		min1 = time1.getMinute();
		
		JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");
		
		time2 = LocalDateTime.now();
		seconds2 = time2.getSecond();
		min2 = time2.getMinute();
		
		if (min1 == min2)
		{
			secondsDifference = seconds2 - seconds1;
		}
		else
		{
			minuteDifference = min2 - min1;
			seconds2 = minuteDifference * 60 + seconds2;
			secondsDifference = seconds2 - seconds1;
		}
		
		
		JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 + "\nStart seconds: " + seconds1 + "\nIt took " + secondsDifference + " seconds for you to answer");
	}
}