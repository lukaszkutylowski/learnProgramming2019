public class FunctionPPJ_06_IV {
	private int fDay = 0;
	private int fMonth = 0;	
	
	public void setFunction(int month, int day) {
		fMonth = month;
		fDay = day;
	}
	
	public void calculateDays() {
		switch(fMonth) {
		case 1:
		System.out.println("From 1st January to this day passage of time is: "+fDay+" days"); break;
		case 2:
		System.out.println("From 1st January to this day passage of time is: "+(31+fDay)+" days"); break;
		case 3:
		System.out.println("From 1st January to this day passage of time is: "+(59+fDay)+" days"); break;
		case 4:
		System.out.println("From 1st January to this day passage of time is: "+(90+fDay)+" days"); break;
		case 5:
		System.out.println("From 1st January to this day passage of time is: "+(120+fDay)+" days"); break;
		case 6:
		System.out.println("From 1st January to this day passage of time is: "+(151+fDay)+" days"); break;
		case 7:
		System.out.println("From 1st January to this day passage of time is: "+(181+fDay)+" days"); break;
		case 8:
		System.out.println("From 1st January to this day passage of time is: "+(212+fDay)+" days"); break;
		case 9:
		System.out.println("From 1st January to this day passage of time is: "+(242+fDay)+" days"); break;
		case 10:
		System.out.println("From 1st January to this day passage of time is: "+(273+fDay)+" days"); break;
		case 11:
		System.out.println("From 1st January to this day passage of time is: "+(303+fDay)+" days"); break;
		case 12:
		System.out.println("From 1st January to this day passage of time is: "+(334+fDay)+" days"); break;
	}
	}
}
