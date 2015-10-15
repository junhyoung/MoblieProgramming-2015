package kr.ac.kookmin.exception.basicthread;

public class testMain {
	
	public static BankAccount account = new BankAccount();
	public static void main (String []args) {
		
	
		Thread depositMan = new Thread() {
            public void run() {
                while (true) {
                	try {
						sleep(500);
						account.add(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			// 10 만큼 입금
            }
            }
        };
        
        Thread withdrawMan = new Thread() {
            public void run() {
                while (true) {
                        try {
							sleep(500);
							account.delete(10);
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			// 10 만큼 출금              
                }
            }
        };
        depositMan.start();
        withdrawMan.start();
	}
}