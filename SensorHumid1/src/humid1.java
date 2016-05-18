import services.humiditeServices;

public class humid1 implements humiditeServices{

	@Override
	public int getHumidite() {
		return (int) (Math.random()*100);
	}

	@Override
	public int getLocation() {
		return 1;
	}
	
	
}
