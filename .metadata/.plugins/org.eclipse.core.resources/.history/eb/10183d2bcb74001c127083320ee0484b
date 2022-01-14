import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraMinuto {
	
	private String horaMinuto;

	public String getHoraMinuto() {
		
		LocalTime myObj = LocalTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
		horaMinuto = myObj.format(myFormatObj);
		
		return horaMinuto;
	}

	public void setHoraMinuto(String horaMinuto) {
		this.horaMinuto = horaMinuto;
	}
}
