public class FunctionPPJ_06_IV {
	private int fDay = 0;
	private int fMonth = 0;	
	
	public void setFunction(int month, int day) {
		fMonth = month;
		fDay = day;
	}
	
	public void calculateDays() {
		String text = "From 1st January to this day passage of time is: ";
		switch(fMonth) {
			case 1:
			System.out.println(text+fDay+" days"); break;
			case 2:
			System.out.println(text+(31+fDay)+" days"); break;
			case 3:
			System.out.println(text+(59+fDay)+" days"); break;
			case 4:
			System.out.println(text+(90+fDay)+" days"); break;
			case 5:
			System.out.println(text+(120+fDay)+" days"); break;
			case 6:
			System.out.println(text+(151+fDay)+" days"); break;
			case 7:
			System.out.println(text+(181+fDay)+" days"); break;
			case 8:
			System.out.println(text+(212+fDay)+" days"); break;
			case 9:
			System.out.println(text+(242+fDay)+" days"); break;
			case 10:
			System.out.println(text+(273+fDay)+" days"); break;
			case 11:
			System.out.println(text+(303+fDay)+" days"); break;
			case 12:
			System.out.println(text+(334+fDay)+" days"); break;
		}
	}
}
