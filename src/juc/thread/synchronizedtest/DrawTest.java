package thread.synchronizedtest;

public class DrawTest {
	public static void main(String[] args) {
		Account account = new Account();
		new Thread(new DrawThread(account, 10000), "ȡǮ��").start();
		new Thread(new DepositThread(account, 10000), "��Ǯ�߼�").start();
		new Thread(new DepositThread(account, 10000), "��Ǯ����").start();
		new Thread(new DepositThread(account, 10000), "��Ǯ�߱�").start();
	}
}
