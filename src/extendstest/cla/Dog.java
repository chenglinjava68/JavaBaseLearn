package extendstest.cla;

import extendstest.inter.StudyEnglish;

public class Dog extends Animal implements StudyEnglish {
	// ���������ʵ�ֽӿڲ���д�䷽��
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.type);// �̳и��������
		System.out.println(dog.add(1, 2));// �̳и���ķ���
		dog.eat();
		dog.printDay();
		dog.study();
		dog.studyEnglish();
		Size size = dog.new Size();// �ڲ����ʹ��
		size.show();
	}

	public Dog() {
		super("����");// ���ø��๹�췽��
	}

	public void eat() {
		System.out.println("��Ҫ�Թ���");// ���Ǹ���ķ���
	}

	@Override
	void printDay() {
		System.out.println("Today is ThursDay");// ʵ�ָ�����󷽷�
	}

	@Override
	public void study() {
		System.out.println("study  ѧϰ");// ʵ�ֽӿڵĸ��ӿ�
	}

	@Override
	public void studyEnglish() {
		System.out.println("studyEnglish  ѧϰӢ��");// ʵ�ֽӿ�
	}

	@Override
	protected void move() {
		super.move();// ��д�����ܱ����ķ���
	}
}
