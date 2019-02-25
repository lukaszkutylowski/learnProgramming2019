public class FunctionPPJ_06_I {
	
	private double binaryWrt[] = {0,0,0,0,0,0,0,0};
	private double wrtDouble = 0;
	
	public void setClassVariable(double wrtD) {
		wrtDouble = wrtD;
	}
	
	public void decimalToBinaryConverter() {
		
		if(wrtDouble != 0) {
			
			for(int counter = 7; counter >= 0; counter--) {
			
				int exponent = 0;
				
				while(wrtDouble > Math.pow(2,exponent)) {
					exponent++;
				}
				
				if(wrtDouble == Math.pow(2,exponent)) {
					binaryWrt[exponent] = Math.pow(2,exponent);
				} else {
					binaryWrt[exponent-1] = Math.pow(2,(exponent-1));
					
					int highestExponent = exponent-1;
					double rest = wrtDouble - Math.pow(2,highestExponent);
					
					wrtDouble = rest;
					exponent=0;
				}
		}
	}
	}
	
	public void showFunction() {
		for(int exponent = 0; exponent <= 7; exponent++) {
			System.out.println("2^"+exponent+": "+binaryWrt[exponent]);
		}
	}
	
	public void binaryFunction() {
		System.out.print("Binary: 0b");
		for(int exponent = 7; exponent >= 0; exponent--) {
			if(binaryWrt[exponent] != 0.0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}
	}
}
