package Methodoverriding;

class Pc extends Laptop{
	
	public void getSystemInfo()
	{
		System.out.println("MAC");
	}
	public static void main(String[] args) {
		
Pc over=new Pc();
over.getSystemInfo();
	}

}
