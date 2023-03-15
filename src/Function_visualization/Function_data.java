package Function_visualization;

import java.util.Locale;
import java.util.Scanner;

public class Function_data {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		scan_function();
		
	}
	public static void scan_function() {
		Locale.setDefault(Locale.US);
		
		System.out.println("x1: ");
		double x1 = sc.nextDouble();
		System.out.println("x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Xs: ");
		double xs = sc.nextDouble();
		
		System.out.println("y1: ");
		double y1 = sc.nextDouble();
		System.out.println("y2: ");
		double y2 = sc.nextDouble();
		System.out.println("Ys: ");
		double ys = sc.nextDouble();
		
		System.out.println("Ts: ");
		double ts = sc.nextDouble();
//		double ts = 5;
		
		print_function(x1, x2, xs, y1, y2, ys, ts);
	}
	
	public static void print_function(double x1, double x2, double xs, double y1, double y2, double ys, double ts) {
		
		double x = x1;
		double y = y1;
		double t = 0;
		
		double tPlus = 1.0 / ts;
		double xPlus = Math.abs((x2 - x1) / (xs - 1.0));
		double yPlus = Math.abs((y2 - y1) / (ys - 1.0));
		
		System.out.println("x, y, z, t");

		for(int i = 0; i < ts; i++) {
			
			for(int j = 0; j < ys; j++) {
				
				for(int k = 0; k < xs; k++) {
					
					double z = Math.sin((Math.sqrt((x * x) + (y * y)) - ( 2.0 * Math.PI * t)));	
					
					System.out.format("%f, %f, %f, %f \n", x, y, z, t);
					
					x = (x + xPlus);
				}
				
				y = (y + yPlus);
				x = x1;	
			}
			
			t = (t + tPlus);
			y = y1;
		}
	}
}