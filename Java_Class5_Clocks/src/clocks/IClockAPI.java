package clocks;

public interface IClockAPI {

	public abstract String getTime();
	
	public abstract void wakeUp();

	public abstract boolean switchOnOff();
	
}