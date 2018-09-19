package my.run;
import my.movie.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movies m=new Movies(10,6578.0f,5);
		Holly h=new Holly(3,25000.0f,9);
		Tolly t=new Tolly("super",1,685897f,10);
		Bolly b=new Bolly(4,658764f,22);
		m.cast_crew=new String[]{"rajamouli","prabhas","anushka"};
		m.cast_crew[1]="ram";
		System.out.println(m.cast_crew[1]);
		System.out.println(b.duration);
	}

}
