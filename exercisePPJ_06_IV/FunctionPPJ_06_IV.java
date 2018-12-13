public class FunctionPPJ_06_IV {
	private int fDay = 0;
	private int fMonth = 0;	
	
	public void setFunction(int month, int day) {
		fMonth = month;
		fDay = day;
	}
	
	public void calculateDays() {
		String text = "From 1st January to this day passage of time is: ";
		int restDays = 0;
		for(int i = 2; i <= fMonth; i++) {
			restDays += 31;
		}
		if(fMonth == 12) { restDays -= 1; }
		if(fMonth >= 10) { restDays -= 1; }
		if(fMonth >= 7) { restDays -= 1; }
		if(fMonth >= 5) { restDays -= 1; }
		if(fMonth >= 3) { restDays -= 3; }
		System.out.println(text + (restDays + fDay) + " days");
	}
}
