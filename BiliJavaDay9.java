import java.util.Scanner;

public class BiliJavaDay9 {
	
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("����������");
        int age = myScanner.nextInt();
        if(age > 18){
            System.out.println("���������� 18��Ҫ���Լ�����Ϊ���𣬷����������");
        }
        System.out.println("�������....");

        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("����������");
        int age2 = myScanner2.nextInt();
        if(age2 > 18){
            System.out.println("���������� 18��Ҫ���Լ�����Ϊ���𣬷����������");
        } else{ //˫��֧
            System.out.println("������䲻����ξͷŹ���");
        }
        System.out.println("�������....");

        double d1 =30.5;
        double d2 = 2.6;
        if(d1 > 10.0 && d2 < 20.0){
            System.out.println("��������=" + (d1 + d2));
        }

        double d3 =3.5;
        double d4 = 2.6;
        if(d3 > 10.0 && d4 < 20.0){
            System.out.println("��������=" + (d3 + d4));
        } else {
            System.out.println("�޷�ִ��");
        }

        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        if(sum % 3 == 0 && sum % 5 == 0){
            System.out.println("�� ���Ա�3��5����");
        } else {
            System.out.println("�� ���ܱ�3��5����");
        }

        int year = 2023;
        if((year % 4 == 0 && year % 100!= 0) || year % 400 == 0 ){
            System.out.println(year + "������");
        }


        Scanner myScanner3 = new Scanner(System.in);
        //�ȶ���������÷֣�����һ����Χ����Ч�ж� 1-100 ��������ʾ�������
        System.out.println("���������÷�(1-100)"); //�����û���Ϣ
        int grade = myScanner3.nextInt();
        if(grade >= 1 && grade <= 100){
            // ��Ϊ��4�����������ʹ�ö��֧
        if(grade == 100){
            System.out.println("���ü���");
        } else if(grade > 80 && grade <= 99){   //���÷�Ϊ(80��90]ʱ����� ��������
            System.out.println("��������");
        } else if(grade > 60 && grade <= 80){
            System.out.println("����һ��");
        } else {  //������������ ���ò�����
            System.out.println("���ò�����");
        }
        } else {
            System.out.println("���÷���Ҫ��1-100�����������룺");
        }

        boolean b = true;
        if(b = false){   // һ�� = �Ǹ�ֵ
            System.out.println("a");
        } else if(b){
            System.out.println("b");
        } else if(!b){  //ȡ����F �� T
            System.out.println("c");
        } else {
            System.out.println("d");
        }

        boolean b2 = true;
        if(b2 == false){   // ���� == �ǵ���
            System.out.println("a2");
        } else if(b2){
            System.out.println("b2");
        } else if(!b2){  //ȡ����F �� T
            System.out.println("c2");
        } else {
            System.out.println("d2");
        }


    }
}
