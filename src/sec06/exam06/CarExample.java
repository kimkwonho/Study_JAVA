package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.setSpeed(-50); //�߸��� �ӵ�����
		
	   System.out.println("���� �ӵ�:"+ mycar.getSpeed());
	   
	   mycar.setSpeed(60); //�ùٸ� �ӵ�����
	   System.out.println("���� �ӵ�:"+ mycar.getSpeed());
	   
	   if(!mycar.isStop()) {   //����
		   mycar.setStop(true);
		   
	   }
	   
	   System.out.println("���� �ӵ�: "+ mycar.getSpeed());
		

	}

}
