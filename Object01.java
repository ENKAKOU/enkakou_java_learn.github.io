
public class Object01 {

	public static void main(String[] args) {
		
		 /*
	      ����̫������ֻèè:һֻ���ֽ�С��,���� 3 ��,��ɫ��
	      ����һֻ��С��,���� 100 ��,��ɫ�����дһ�����򣬵��û�����Сè������ʱ��
	      ����ʾ��è�����֣����䣬��ɫ������û������Сè������
	      ����ʾ ����̫û����ֻè  */

	    /*  �������� --- ���������ݹ���

	        String cat1Name = "С��";   //��һֻè
	        int cat1Age = 3;
	        String cat1Color = "��ɫ";

	        String cat2Name = "С��";   //�ڶ�ֻè
	        int cat2Age = 100;
	        String cat2Color = "��ɫ";  */

	     /* ���� --- �������ͣ����ֲ�����: (1) �����������ֲ�����
	                                  (2) ֻ��ͨ��[�±�]��ȡ��Ϣ����ɱ������ֺ����ݵĶ�Ӧ��ϵ����ȷ
	                                  (3) ��������è����Ϊ

	        String[] cat1 = {"С��", "3", "��ɫ"};    //��һֻè
	        String[] cat2 = {"С��", "100", "��ɫ"};  //�ڶ�ֻè    */


	     /* ʹ�� OOP ���������
	        new Cat() ����һֻè(è����)
	        Cat cat1 = new Cat(); �Ѵ�����è���� cat1
	        cat1 ����һ������    cat2 Ҳ��һ������      */

	        Cat cat1 = new Cat();
	        cat1.name = "С��";
	        cat1.age = 3;
	        cat1.color = "��ɫ";


	        Cat cat2 = new Cat();     //�����˵ڶ�ֻè�������� cat2
	        cat2.name = "С��";       //cat2 Ҳ��һ������(è����)
	        cat2.age = 100;
	        cat2.color = "��ɫ";


	        System.out.println("�� 1 ֻè��Ϣ" + cat1.name
	                + " " + cat1.age + " " + cat1.color + " ");
	        System.out.println("�� 2 ֻè��Ϣ" + cat2.name
	                + " " + cat2.age + " " + cat2.color + " ");

	    }

	}

	//����һ��è�� Cat -> �Զ������������
	class Cat {      //����/��Ա����

	    String name; //����
	    int age; //����
	    String color; //��ɫ

	//��Ϊ
	

}
