//Nathan Hebert 3/7/2018
package WashingMachine;

public class NotFullyPaid implements State {

	WashingMachine washingMachine;
	
	public NotFullyPaid(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}
	
	public void insertQuarter() {
		System.out.println("You have inserted a quarter");
		washingMachine.setState(washingMachine.getPaid());
	}

	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void startLoad() {
		System.out.println("You can't start if you haven't inserted a quarter");	
	}

	@Override
	public void cancel() {
		System.out.println("You can't cancel if it's not started yet");	
	}

	@Override
	public void exception() {
				
	}

}
