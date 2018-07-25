package thread;

public class Actor extends Thread {

	
	public void run(){
		System.out.println(getName()+ "��һ����Ա��");
		int count = 0;
		boolean keepRunning = true;
		
		while(keepRunning){
			System.out.println(getName()+ "��̨�ݳ�" + (++count));
			if(count == 100){
				keepRunning = false;
			}
			if(count%10==0){
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
		
		
		System.out.println(getName()+ "�ݳ������ˣ�");
	}
	
	
	public static void main(String[] args){
		Thread actor = new Actor();
		actor.setName("Mr.Rhread");
		
		actor.start();
		
		Thread actressThread = new Thread(new Actress(),"Ms.Runnable");
		actressThread.start();
	}
}

class Actress implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ "��һ����Ա��");
		int count = 0;
		boolean keepRunning = true;
		
		while(keepRunning){
			System.out.println(Thread.currentThread().getName()+ "��̨�ݳ�" + (++count));
			if(count == 100){
				keepRunning = false;
			}
			if(count%10==0){
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(Thread.currentThread().getName()+ "�ݳ������ˣ�");
	}
	
}