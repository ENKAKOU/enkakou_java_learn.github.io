public class BiliJacaDay5 {
	
    public static void main(String[] args){
        // ������������ �� String���͵�ת��
        /* ������������ ת String����
                 �﷨��������������ֵ + ""   */
        int n1 = 100;
        float n2 = 1.1f;
        double n3 = 3.4;
        boolean b1 = true;
        String str1 = n1 + "";
        String str2 = n2 + "";
        String str3 = n3 + "";
        String str4 = b1 + "";
        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " ");

         /* String���� ת ������������
                 �﷨��ͨ���������͵İ�װ����� parseXX����   */
        String s5 = "123";
        //��� ʹ�� �����������Ͷ�Ӧ�İ�װ�� �Ķ�Ӧ�������õ�������������
        int num1 = Integer.parseInt(s5);
        double num3 = Double.parseDouble(s5);
        float num2 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");

       System.out.println(num1);   //123
       System.out.println(num2);   //123.0
       System.out.println(num3);   //123.0
       System.out.println(num4);   //123
       System.out.println(num5);   //123
       System.out.println(b);      //true
        //�ַ��� ת���ַ�char -> ���壺���ַ����ĵ�һ���ַ��õ�
        //��� (s5.charAt(0)) �õ� s5�ַ����ĵ�һ���ַ� 1 ��������1��
        System.out.println(s5.charAt(0));

        // �½���ҵ
           // 1. ����������������+ƴ��
        String book1 = "�����˲�";
        String book2 = "�Ž���̷";
        System.out.println("�����˲�" + "�Ž���̷");

           // 2. ���������Ա�
        char c1 = '��';
        char c2 = 'Ů';
        System.out.println(c1 + c2);  //char�ַ� �õ�һ������������õ����С��ַ���ֵ+��Ů���ַ���ֵ

           // 3. ����������۸�
                 //���￼����float �����ȱ���2λС�������á� double���ȸ�
        double pricel1 = 13.56;
        double pricel2 = 12.5;
        System.out.println(pricel1 + pricel2);   //���ھ��ȹ��ߣ�С��λ���ࡣ �����Ƽ�float�ࡣ

           /* 4. �ñ��������������䣬�ɼ����Ա𣬰��ô洢
                 ʹ�� +
                 �ʵ�ע��
                 ���ת�����ʹ��һ��������  */
        String name = "jack";     //���� �����ַ��� String
        int age = 20;             //���� ����byteҲ���ԣ�int�����գ�
        double score = 80.9;      //�ɼ�
        char gender = '��';       //�Ա�
        String hobby = "������";   //���� �������String�ַ���
        System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n" + name + "\t" +
                age + "\t" + score + "\t" + gender + "\t" + hobby);   // ���ֵ����⣺�Ʊ�λ�޷�����


        // java - ���������
           // ��ʾ  /����ʹ��
        System.out.println(10 / 4);    //����ѧ������2.5��java�� 2
        System.out.println(10.0 / 4);   // java�� 2.5
        double d = 10 / 4;             //2.0
        System.out.println(d);

           // ��ʾ  % ȡ�ࣨȡģ��
               // ��java�У�%�ı��ʣ���һ����ʽ a % b = a - a/b * b
              // A % B : A ��������% �������� A �Ǹ�����% ���Ǹ�
        System.out.println(10 % 3);     // 1
        System.out.println(-10 % 3);    // -1  (-10 % 3 => -10 -(-10) / 3 * 3 = -10 +9 = 1
        System.out.println(10 % -3);    // 1
        System.out.println(-10 % -3);   // -1

           // ��ʾ  ++ ʹ��
               //���� ++ ���������ʹ�� ǰ++����++ ���ȼ��� i=i+1;
        int i = 10;
        i++;                   // �������ȼ��� i=i+1 =>  i=11
        System.out.println("i=" + i);  // 11
                                // ������һ�����ִ�к󣬴�ʱ i= 11;
        ++i;                   // �������ȼ��� i=i+1 =>  i=12
        System.out.println("i=" + i);  // 12
              // ������ 1
        int ii = 1;
        ii = ii++;    //����ʹ����ʱ�������� temp = ii     �� ii = ii + 1      �� ii = temp
        System.out.println(ii);   // 1

              // ������ 2
        int oo = 1;
        oo = ++oo;  //����ʹ����ʱ�������� oo = oo + 1     �� temp = oo       �� oo = temp
        System.out.println(oo);    //2

             // ������ 3
        int i1 = 10;
        int i2 = 20;
        int m = i1++;
        System.out.println("m=" + i1);
        System.out.println("i2=" + i2);

           //������ 4
        // ���󣺼��绹��59��ż٣��ʣ���xx������ ��xx��
        /* ˼·��1.ʹ��int���� - days ��������
                2.һ��7�죬 ��������weeks����days/7 ; ��xx�죨leftDays����days % 7; */
        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "��  ��" + weeks + "����  ��" + leftDays + "��" );

           //������ 5
         /* ���󣻶���һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽ��5 / 9*(�����¶� - 100)��
                 ����������¶ȶ�Ӧ�������¶� ��234.6�� */
         /* ˼·��1.����һ������ double  huaShi �������� �����¶�
                              ����Ϊ���ݿ�����С����Ҳ�����������������Ƽ���double��
                 2.���ݸ����Ĺ�ʽ�����м��㣬�� 5 / 9*(�����¶� - 100)
                 3.���õ��Ľ�������浽һ������ ��������> double huaShi*/
        double huaShi = 234.6;
        double sheShi = 5.0 / 9 *(huaShi - 100); // 5.0 �ᱣ���߾��ȡ�  5/9�õ�0.5555С����javahֱ�ӷ���0
        System.out.println("�����¶�" + huaShi + "��Ӧ�������¶� =" + sheShi);

        // ��ϵ�����
//        int a = 9;
//        int b = 8;
//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//        System.out.println(a<b);
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        boolean flag = a>b;
//        System.out.println("flag=" + flag);


    }
}
