import services.*;

public class temp1 implements tempService{

	@Override
	public int getLocation() {
		return 1;
	}

	@Override
	public int getTemperature() {
		return (int) (Math.random()*35);
	}

	@Override
	public int getUnite() {
		return 0;//celsius
	}
	
}
