package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.setSpeed(-50); //잘못된 속도변경
		
	   System.out.println("현재 속도:"+ mycar.getSpeed());
	   
	   mycar.setSpeed(60); //올바른 속도변경
	   System.out.println("현재 속도:"+ mycar.getSpeed());
	   
	   if(!mycar.isStop()) {   //멈춤
		   mycar.setStop(true);
		   
	   }
	   
	   System.out.println("현재 속도: "+ mycar.getSpeed());
		

	}

}
