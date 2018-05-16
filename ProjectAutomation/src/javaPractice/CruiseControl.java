package javaPractice;

public class CruiseControl {
	
	 private static int currentSpeed = 80;
	 private static int desiredSpeed = 0;   // cruise control speed desired speed . 

			public void setCurrentSpeed(int val){
				currentSpeed=val;
			}
			public void setDesiredSpeed(int val){
				desiredSpeed=val;
			}
	//---------------------------------------
			public int getCurrentSpeed(){
				return currentSpeed; 
			}
			public int getDesiredSpeed(){
				return desiredSpeed;
			}
	//---------------------------------------
		public int reduceSpeed(int param){
			currentSpeed=currentSpeed-param;
			System.out.println("inside reduce "+ currentSpeed);
			return currentSpeed;
		}
		private int increaseSpeed(int param) {
			currentSpeed=currentSpeed+param;
			System.out.println("inside reduce "+ currentSpeed);
			return currentSpeed;

		}
	
		
		public static void main(String[] args) {
			
				CruiseControl cc=new CruiseControl();
				cc.setDesiredSpeed(100);
				System.out.println("desired Speed :"+ desiredSpeed);
				System.out.println("Current Speed :"+ currentSpeed);
				
				while(cc.getCurrentSpeed()>cc.getDesiredSpeed()){
					System.out.println("Reducing speed by 5km/hr "+cc.reduceSpeed(5));
				}
				while(cc.getCurrentSpeed()<cc.getDesiredSpeed()){
					System.out.println("Reducing speed by 5km/hr "+cc.increaseSpeed(5));
				}
				System.out.println("Actual speed is : "+ currentSpeed);
				System.out.println("Desired speed is : "+ desiredSpeed);
				
				
			}
		

}
