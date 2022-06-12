public class Thermos {
	String brand;
	String liquid;
	int liquidVol; 
	Thermos(String brand,String liquid){
		this.liquidVol=0;
		this.brand=brand;
		this.liquid=liquid;
	}
	
	void addliquid(int liquid_amt) {
		liquidVol= liquidVol+ liquid_amt;
	}
	
	void display() {
		System.out.println("f");
	}
	
	void pourliquid(int liquid_amt) {
	//code
		liquidVol= liquidVol- liquid_amt;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
	}
	
}