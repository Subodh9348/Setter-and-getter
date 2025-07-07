public class Room{
 private double L;
 private double b;

	public void setLength(double L){
		this.L=L;
	}
	public double getLength(){
		return L;
	}
	public void setBreadth(double b){
		this.b=b;	
	}
	public double getBreadth(){
		return b;
	}
	public void findArea(){
		System.out.println(L*b);
	}
	
	


	public static void main(String[] args) 
		{
		Room r=new Room();
		System.out.println(r+"value is:");
		System.out.println();
		r.findArea();
		System.out.println();
		r.setLength(700);
		r.setBreadth(100);
		System.out.println("Hello World!");
		r.findArea();
		}

	}