public class BiliJavaDay4 {
	
    //����һ��main����
    public static void main(String[] args){
        //����һ����������
        //�жϳɼ��Ƿ�ͨ���İ���
        boolean isPass = true;

        if(isPass == true){
            System.out.println("ͨ��");
        }else {
            System.out.println("��ͨ��");
        }

        /////////////////////////////////////////////////////////////////////////

        // ��ʾ�Զ�ת��
        int num = 'a';   // ��ȷ  char -> int
        double d1 = 80;  // ��ȷ   int -> double
        System.out.println(num);  // 97
        System.out.println(d1);  // 80.0

        //�Զ�����ת�� - ע���ϸ��
           //���������͵����ݻ������ʱ��
           //ϵͳ�����Զ�����������ת����������������������ͣ�Ȼ���ٽ��м���
        int n1 = 10;  //��ȷ   int����
        /* float d2 = n1 + 1.1;   // ���������
                 n1 + 1.1 => ��������� double */
        double d2 = n1 + 1.1;   // ����취 2 ��float d2 = n1 + 1.1F;

        //byte,short �� char �����Զ�����ת��
        byte v1 = 10;    // byte ֵ��-128 ~ 127
           // ���Ѿ���������byteʱ�����жϸ����Ƿ���byte��Χ�ڣ�����ǣ��Ϳ���
           //int m1 = 1;     //m1 ��int ��4�ֽڣ�
        /*   byte v2 = m1;   ��������Ǳ�����ֵ���ж�����
                                 (��intת����byte���ܻ�����ʧ) */

        // byte,short,char ���߿��Լ��㣬�ڼ���ʱ����תΪint����
        byte x1 = 1;
        byte x2 = 2;
        short s4 = 1;
        //short s2 = x1 + x2 => int
         /*    byte x4 = x1 + x2;       ��ֻҪ��byte,short,char
                                            ���߿��Լ��㣬�ڼ���ʱ����תΪint����*/

        /////////////////////////////////////////////////////////////////////////

        // boolean ������ת��
        boolean pass = true;
        // int num100 = pass     ���� boolean���������͵��Զ�ת��

        // �Զ����� - ���ʽ����������Զ�����Ϊ������������������
        byte b44 = 1;
        short s33 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double num500 = b44 + s33 + num200 + num300;

        /////////////////////////////////////////////////////////////////////////

        //ǿ������ת��
        int n111 =(int) 1.9;
        System.out.println("n111=" + n111);

        int n222 = 2000;
        byte b111 = (byte) n222;
        System.out.println("b111=" + b111);

        //ǿ������ת�� ������������ ϸ��
          //ǿ׳����ֻ�������Ĳ�������������ʹ��С���ţ����������ȼ�
                    //  int x = (int) 10*3.5+6*1.5;   ����double -��int
        int x = (int)(10*3.5+6*1.5);   //(int) 44.0 -> 44
        System.out.println(x);  //44

          //char���ͣ����Ա���int�ĳ���ֵ�����ܱ���int�ı���ֵ����Ҫǿ��ת��
        char c1 = 100;
        int m = 100;
            //char c2 = mmm;    ����,  ��intת����char���ܻ�����ʧ
        char c3 = (char)m;
        System.out.println(c3);

        //��������ת�� ������������ ��ϰ��
        /*   short s = 12;      ��ȷ
             s = s-9;           ����  int -> short

             byte b = 10;       ��ȷ
             b = b + 11;        ����  int -> byte
             b = (byte)(b+11);  ��ȷ��  ʹ�ã���ǿ��ת��

             char c = 'a';      ��ȷ
             int i = 16;        ��ȷ
             float d = .314F;   ��ȷ
             double result = c + i + d;   ��ȷ��float -> double

             byte b = 16;       ��ȷ
             short s = 14;      ��ȷ
             short t = s + b;   ����  int -> short      */





    }
}
