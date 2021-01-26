package statisticker;

public class LEDAlert implements IAlerter{

	public boolean ledGlows;

	@Override
	public void alert(boolean set) {
		// TODO Auto-generated method stub
		this.ledGlows = set;
	}

}
