import java.util.Scanner;

public class BilijavaDay7 {
    public static void main(String[] args){
        // ��Ԫ�����
        int a = 10;
        int b = 99;
            //a>bΪfalse;   ����b--���ȷ���bֵ��Ȼ��b-1 ;
        int result = a > b ? a++ :b--;     // ���ؽ����99
        System.out.println("resule = " + result);

        int a2 = 10;
        int b2 = 99;
        int result2 = a < b ? a++ :b--;
        System.out.println("resule2 = " + result2);  //10
        System.out.println("a2 = " + a2);   //11
        System.out.println("b2 = " + b2);   //99

        //��Ԫ����� ���� ʹ��ϸ��
            //1. ���ʽ1 �� ���ʽ2 ��ҪΪ���Ը������ձ��������ͣ��� �����Զ�ת����
        int a3 = 3;
        int b3 = 8;
        int c = a3 > b3 ? a3 : b3;     //����

        int a4 = 3;
        int b4 = 8;
        int c2 = a4 > b3 ?(int)1.1 :(int)3.4;   //����

        int a5 = 3;
        int b5 = 8;
        double d = a > b? a : b + 3;    //���ԣ������Զ�ת�� int -> double

            //2. ��Ԫ���������ת�� if - else ���
        int res = a > b ? a++ : --b;
        if (a > b)res = a++;
        else res = --b;

        //��Ԫ����� ���� ��ϰ��
            //�ʣ�ʵ�������������ֵ
        int n1 = 55;
        int n2 = 33;
        int n3 = 123;
            /* ˼·��  1. �ȵõ�n1 �� n2 �������������浽 max1 ;
                      2. Ȼ������� max1 �� n3 �������������浽max2 ; */
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println("����� = " + max2);
            /* ʹ��һ�����   ���Ƽ��ֲ��� ������ֱ�ۣ�
               �������ʹ�ø��õķ������磺����

            int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2? n1 : n2) : n3;
            System.out.println("����� = " + max) ;      */

        //��ʶ������
            //JAVA�� �ϸ����ִ�Сд������������;
        int totalNum = 10 ;
        int nn = 20;
        int N = 10;
        System.out.println("nn=" + nn);   //20
        System.out.println("N=" + N);     //10
            // abc �� aBc ��������ͬ�ı���
        int abc = 1;
        int aBc = 2;
            // ��ʶ�����ܰ����ո�  �磺 int a b = 25 ;  ������

        //��ʶ���淶
            //���������������� �շ巨��С�շ巨�� �磺 xxxYyyZzz
            //�������ӿ����� ���շ巨  �磺XxxYyyZzz

        //java �����������

          //inpunt java.util.scanner  (��ʾ��java.util�µ� Scanner�ർ�룩
          //Scanner�� ��ʾ ���ı�ɨ��������java.util��
            //����1: ����/������ࣨScanner�ࣩ�����ڰ�  java.util
            //����2: �������ࣨScanner�ࣩ������������)     new ����һ��
        Scanner myScanner = new Scanner(System.in);
            //����3����������Ĺ��� �������û������룩��ʹ����صķ���
        System.out.println("������������");
                  //������ִ�е� next������ʱ����ȴ��û����롣
        String name = myScanner.next();   // �����û����롰�ַ�����
        System.out.println("���������䣺");
        int age = myScanner.nextInt();    // �����û�����int
        System.out.println("������ɼ���");
        double score = myScanner.nextDouble();   // �����û����� double
        System.out.println("��Ϣ���£�");
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("score=" + score);


        //����
           /* ������������4�ֱ�ʾ��ʽ��
             1.������ ��0��1  ��2��1����0b��0B��ͷ��
             2.ʮ���� ��0-9�� ��10��1��
             3.�˽��� ��0-7�� ��8��1��������0��ͷ��ʾ
             4.ʮ������ �� 0-9 ��A��10��-F��15������16��1���� 0x �� 0X ��ͷ��ʾ�����˴� A-F�����ִ�Сд�� */
        int d1 = 0b1010;   //������
        int d2 = 1010;     //ʮ����
        int d3 = 01010;    //�˽���
        int d4 = 0x10101;  //ʮ������

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);


    }
}
