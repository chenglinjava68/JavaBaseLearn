package extendstest.cla;

public abstract class Animal {
	public String type = "Animal";

	public Animal() {
	}

	public Animal(String home) {
		System.out.println("���ǵļ�����:" + home);
	}

	abstract void printDay();

	public int add(int a, int b) {
		return a + b;
	}

	public void eat() {
		System.out.println("��Ҫ��ʳ��");
	}

	protected void move() {

	}

	class Size {
		// �ڲ���
		public Size() {
		}

		private String width;
		private String height;

		public void show() {
			System.out.println("�ҵ�size��XXL");
		}
	}
}
