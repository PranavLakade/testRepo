package DataReaders;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class excel {
		
	//public static Logger log=Logger 
	

	static final Logger logger = Logger.getLogger(excel.class);




	public void getData(){
				 
		 
	 }
	
	
	
	
	public static void main(String[] args){
		String log4jConfPath = "C:\\Pranav\\Work\\workspace\\ProjectAutomation\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		if (logger.isDebugEnabled()) {
			logger.debug("entering main(String[])");
			logger.debug("args: " + args);
			excel ex=new excel();
			ex.getData();
			
			logger.debug("exiting main()");
		}
		
		
	}
}
