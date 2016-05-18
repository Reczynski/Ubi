import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.log.LogService;


public class client{
	private List services = new ArrayList() ;
	
	
	public void activate(ComponentContext ctxt){
		LogService log = (LogService) ctxt.locateService("LOG");
		if(log!=null)
			log.log(LogService.LOG_INFO,"editor starting");
		
	}
	
	public void deactivate(ComponentContext ctxt){
		
		
		LogService log = (LogService)ctxt.locateService("LOG");
		if(log!=null) log.log(LogService.LOG_INFO, "Editor stopped");
		log=null;
	}
	
	
	
	
}
