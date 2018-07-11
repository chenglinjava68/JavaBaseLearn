package thread.synchronizedtest;

public class Account {
	private String accountNo;
	private double balance;
	/**
	 * true��ʶ�]Ǯ false��ʶ��Ǯ
	 */
	private boolean flag = false;

	public Account() {
		super();
	}

	public Account(String accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	/**
	 * ȡǮ
	 * 
	 * @param drawAmount
	 */
	public synchronized void draw(double drawAmount) {
		try {
			if (!flag) {
				this.wait();
			} else {
				System.out.println(Thread.currentThread().getName() + "ȡǮ��" + drawAmount);
				balance = balance - drawAmount;
				System.out.println("���:" + balance);
				flag = false;
				this.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��Ǯ
	 * 
	 * @param depositAmount
	 */
	public synchronized void deposit(double depositAmount) {
		try {
			if (flag) {
				this.wait();
			} else {
				System.out.println(Thread.currentThread().getName() + "��Ǯ��" + depositAmount);
				balance = balance + depositAmount;
				System.out.println("�˻����Ϊ:" + balance);
				flag = true;
				this.notifyAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
