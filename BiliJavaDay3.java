public class BiliJavaDay3 {
	
    public static void main(String[] args){
        //JAVA ������ + �ŵ�ʹ��

        // ���������߶�����ֵ�ͣ������ӷ�����
        System.out.println(100 + 3);              // 103
        //������������һ��Ϊ�ַ���������ƴ������
        System.out.println("100" + 98);           //10098  " "���ַ���
        System.out.println(100 + 3 +"hello");     //103hello
        System.out.println("hello" + 100 + 3);    //hello1003

        //�������� - ��������
        byte n1 = 10;    //��ֵ��10 ��1�ֽ�(ռ�ã�
        short n2 = 10;   //��ֵ��10 ��2�ֽ�(ռ�ã�
        int n3 = 10;     //��ֵ��10 ��4�ֽ�(ռ�ã�
        long n4 = 10;    //��ֵ��10 ��8�ֽ�(ռ�ã�

        //java���γ���������ֵ��Ĭ��Ϊ��int�͡�����long�ͳ���������'l' �� 'L'
            int n5 = 1;    // int 4�ֽ�
        // int n1 = 1L   (���� �� 1L ��long�� 8�ֽڣ��޷���int 4�ֽڣ�
            long n6 = 1L;  // ��ȷ

        //�������� - ��������
        float num1 = 1.1F;   //��ȷ
        double num2 = 1.1;   //��ȷ
        double num3 = 1.1F;  //��ȷ
        /*  ������ float num1 = 1.1; �����д���
                  Ĭ�ϸ������� double;   double 8�ֽڣ�float 4�ֽڣ�
                                       doubleתfloat ����ʧ���� */

        //ʮ��������ʽ���� 5.12    512.0f   .512(������С���㣩
        double num5 = .125; //�ȼ� 0.125
        System.out.println(num5);
        //��ѧ��������ʽ���� 5.12e2 [ 5.12*10��2�η� ]    5.12E-2[ ]
        System.out.println(5.12e2);  // 512.0
        System.out.println(5.12E-2); //0.0512

        //����˵�� double�� �� float�͸���ȷ
        double num9 = 2.1234567851;
        System.out.println(num9);   //2.1234567851
        float num10 = 2.1234567851F;
        System.out.println(num10);  //2.1234567

        //������ʹ������  2.7 �� 8.1 / 3 �Ƚ�
        double num11 = 2.7;
        double num12 = 8.1 /3;   //2.7
        System.out.println(num11);   // 2.7
        System.out.println(num12);   // 2.6999999999999997  �ӽ�2.7 С��������2.7
        //�õ�һ����Ҫ��ʹ�õ㣺������������С���Ľ�������жϣ�ҪС��
        //Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
        if ( num11 == num12);{
            System.out.println("���");
        }
        //��ȷд��   ctrl+/ = ע�Ϳ�ݼ��������뼴ȡ��
        if ( Math.abs(num11 - num12) < 0.000001){
            System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���...");
        }
        // ����ͨ��java api
        System.out.println( Math.abs(num11 - num12));
        // ϸ�ڣ�������ֺν��ѯ�õ�С����ֱ�Ӹ�ֵ���ǿ����ж����

        //�ַ����� char
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '��';
        char c4 = 92; // ˵�����ַ����Ϳ���ֱ�Ӵ��һ������
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);  //�����c4�������92��ʾ���ַ�

        char c5 = 'a';  //���'a' ��Ӧ������
        System.out.println((int)c5);
        char c6 = '��';
        System.out.println((int)c6);  //38889
        char c7 = 38889;
        System.out.println((int) c7);  //��
        //char �����ǿ��Խ�������ģ��൱��һ����������Ϊ������Ӧ��Unicode��

        System.out.println('a' + 10);  //107

        //���ò���
        char c8 = 'b' + 1;   //98+1 ==> 99
        System.out.println((int) c8);   //99
        System.out.println((c8));  //99 -> ��Ӧ���ַ� ->�����ASCII���涨�õģ�=> c



    }
}
