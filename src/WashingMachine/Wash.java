//Nathan Hebert 3/7/2018
package WashingMachine;

public class Wash implements State{

	WashingMachine washingMachine;
	
	public Wash(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startLoad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exception() {
		// TODO Auto-generated method stub
		
	}

}
