package operator;

/**
 * @author Administrator ���ز���
 */
public class ReturnTest {
	public static void main(String[] args) {
		int a = 50;
		String level = getLevel(a);
		System.out.println("�ɼ�:" + level);
	}

	private static String getLevel(int a) {
		try {
			if (a > 90) {
				return "A";
			} else if (a > 80) {
				return "B";
			} else if (a > 70) {
				return "C";
			} else if (a >= 60) {
				return "D";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "�ɼ���Ч";
	}
}
