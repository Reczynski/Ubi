import java.util.ArrayList;
import java.util.List;
import services.humiditeServices;
import services.tempService;


public class thread extends Thread{
	public List services; 
	public boolean isRun;
	public thread(List services){
		this.services=services;
	}
	
	public void run(){
		while(isRun){
			for(Object s:services){
				if(s instanceof tempService){
					
				}
				if(s instanceof humiditeServices){
					
				}
			}
		}
	}       
}

