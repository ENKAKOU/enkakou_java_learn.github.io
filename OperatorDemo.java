//import javax.xml.ws.soap.MTOM;

public class OperatorDemo {
	
    /* �ַ� + ����  */
    public static void main(String[] args){
        //������������
        int i = 10;
        char c = 'A'; //'A'��ֵ��65
        c = 'a'; //'a'��ֵ��97
        c = '0'; //'c'��ֵ��48
        System.out.println(i + c);

       // char ch = i + c;
        //char���ͻᱻ�Զ�����Ϊint����
        int j = i + c;
        System.out.println(j);

       // int k = 10 + 10.14; //���������ͣ�10.14��double���͵ġ���doubleת����int���ܻ���ʧ
        double d = 10 + 10.14;

        /*�ַ��� + ����

         */
        System.out.println("it" + "java");
        System.out.println("it"+666); //�����ַ���ʱ����� + ���ַ������ӷ���������������
        System.out.println(666 + "it");
        System.out.println("it" + 666 + "java");
        System.out.println(1+ 99 + "java"); //�������㣬������ִ��



    }
}
