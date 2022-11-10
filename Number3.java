package Lab10;
import java.util.Random;

public class Number3 {
public double E;
public double PI;
private static Random randomnumbergenerator = new Random();

private Number3() {
	
}
public static int getRandomNumber() {
	int RandomNum=randomnumbergenerator.nextInt();
	return RandomNum;
}
public static int getMax(int a, int b) {
	return Math.max(a, b);
}
public static long getMax(long a, long b) {
	return Math.max(a, b);
}
public static double getSin(double a) {
	return Math.sin(a);
}
public static double getCos(double a) {
	return Math.cos(a);
}
public static double getLog(double a) {
	return Math.log(a);
}
public static double getFloor(double a) {
	return Math.floor(a);
}
public static double getCeil(double a) {
	return Math.ceil(a);
}
public static double getPow(double a, double b) {
	return Math.pow(a, b);
}
public static void main(String[] args) {
	System.out.println(Number3.getMax(10, 20));
	System.out.println(Number3.getMax(20, 30));
	System.out.println(Number3.getSin(10));
	System.out.println(Number3.getCos(10));
	System.out.println(Number3.getLog(10));
	System.out.println(Number3.getFloor(10));
	System.out.println(Number3.getCeil(10));
	System.out.println(Number3.getPow(10, 2));
}
}
