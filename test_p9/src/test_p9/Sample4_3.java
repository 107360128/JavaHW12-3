package test_p9;

public class Sample4_3 
{
	public static void main(String[]args)
	{
		RacingCar rccar1;
		rccar1 = new RacingCar();
		rccar1.newShow();
	}
}
class Car
{
protected int num;
protected double gas;
public Car()
{
num = 0;
gas = 0.0;
System.out.println("生産了車子");
}
public void setCar(int n, double g)
{
num = n;
gas = g;
System.out.println("将車號設為"+num+"汽油量設為"+gas);
}
public void show()
{
System.out.println("車號是"+ num);
System.out.println("汽油量是"+gas);
}
}
class RacingCar extends Car
{
private int course;
public RacingCar()
{
course = 0;
System.out.println("生産了賽車");
}
public void setCourse(int c)
{
course =c;
System.out.println("將赛車編號設為"+course);
}
public void newShow()
{
System.out.println("賽車的車號是"+ num);
System.out.println("汽油量是"+ gas);
System.out.println("賽車編號是" +course);
}
}