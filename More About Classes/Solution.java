package lab2;

abstract class Plane
{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}

class CargoPlane extends Plane
{
	void takeoff()
	{
		System.out.println("Cargoplane is taking off");
	}
	void fly()
	{
		System.out.println("Cargoplane fly at low heights");
	}
	void land()
	{
		System.out.println("Cargoplane is landing");
	}
}
class PassengerPlane extends Plane
{
	void takeoff()
	{
		System.out.println("Passengerplane is taking off");
	}
	void fly()
	{
		System.out.println("Passengerplane fly at low heights");
	}
	void land()
	{
		System.out.println("passengerplane is landing");
	}
}
class FighterPlane extends Plane
{
	void takeoff()
	{
		System.out.println("Fighterplane is taking off");
	}
	void fly()
	{
		System.out.println("Fighterplane fly at low heights");
	}
	void land()
	{
		System.out.println("Fighterplane is landing");
	}
}

public class Solution {
	void permit(Plane ref)
	{
		ref.takeoff();
		ref.fly();
		ref.land();
	}

	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		PassengerPlane p =new PassengerPlane();
		FighterPlane f= new FighterPlane();
		
		Solution s= new Solution();
		
		s.permit(c);
		System.out.println("==================");
		s.permit(p);
		System.out.println("==================");
		s.permit(f);
		

	}

}
