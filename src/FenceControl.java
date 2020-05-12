package assignment;

public class FenceControl implements Control {
	public boolean onOff = false;

	@Override
	public void turnOn() {
		onOff = true;
	}

	@Override
	public void turnOff() {
		onOff = false;
	}

	@Override
	public void printInfo() {
		System.out.println(onOff);
		System.out.println("The fence wil be turned on.");

	}

}
