public class BiliJavaDay2 {
	
    public static void main(String[] args){
        //����淶
        int n1 = 1 + 2;  //���������ƶ���ѡ�У�Ȼ������tab
        int n2 = 5 + 10; //���������ƶ���ѡ�У�Ȼ������shift+tab
        int n3 = 1 + 3 + 34; //������� = ����ϰ���Ը���һ���ո�
        System.out.println(n1 + n2);
        //�п�Ҫ����80�ַ�
        //���з����β���

        // ��ҵ1 ��дhello world
        System.out.println("hello world");

        /* ��ҵ2 �����˵Ļ�����Ϣ���������Ա𣬼��ᣬסַ��
             ��ӡ������̨�������������Ϣ�ֱ�ռһ��  */
        System.out.println("����\t�Ա�\t����\tסַ\n����\tŮ��\tδ֪\t����");

        /* ��ҵ3 JDK,JRE,JVM�Ĺ�ϵ
             ��JDK + JRE = java��������   JRE + JVM = ������� */

        /* ��ҵ4 ��������path���ü�������
             �𣺻������������ã�Ϊ����dos������Ŀ¼������ȥʹ��java �� javac���
                ������ JAVA HOME = ָ��jdk��װ����Ŀ¼��
                �༭path�������������� %JAVA_HOME%\bin  */

        /* ��ҵ5 ��дJAVA����
            1.��дjavaԴ����
            2.java���룬��Ӧ��.class �ֽ����ļ�
            3.java���У�������.class ���ص�jvm ���� */

        // java����
        // ���� ����Ҫ�� ��  ���� + ���� + ֵ
        int a = 1;   // int = ���� ;  a = ���� ; 1 = ֵ
        //  b = 89; //��89ֵ����b����
        System.out.println(a); //���a ������ֵ

        //��������
        //int = a;
        a = 100;
        System.out.println(a);
        //����������ʹ��
        int b = 100;
        System.out.println(b);

        //�������  ��¼�˵���Ϣ
        int age = 20;
        double score = 88.6;
        char gender = '��';
        String name = "jack";
        //�����Ϣ
        System.out.println("�˵���Ϣ���£�");
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);


        //������������������ʹ�ã�������˳��
       // int a = 50;   //int ����
       // System.out.println(a);  // ���Ϊ 50
        //����������/ֵ������ͬһ���ͷ�Χ�ڲ��ϱ仯
        //  a = 88;
        //  System.out.println(a);  // ���Ϊ 88

        //  a = "jack";
        // String���� ����ת�� int����


        //������ͬһ���������ڲ�������    ���� �� int a = 77;������
        //   class doc{
        //    public static void main(String[] args){
        //        int a = 666;   // �Ե�



    }
}
