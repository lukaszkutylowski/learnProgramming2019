public class FunctionPPJ_06_III {
	
	private boolean fX = true;
	private int fY = 0;
	private boolean fZ = true;
	
	public void setFunction(boolean x, int y, boolean z) {
		fX = x;
		fY = y;
		fZ = z;
	}
	
	public void getFunction() {
		System.out.println(fX+", "+fY+", "+fZ);
	}
	}
