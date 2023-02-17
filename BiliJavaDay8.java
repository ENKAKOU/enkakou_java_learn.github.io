public class BiliJavaDay8 {
	
    public static void main(String[] args){
        // java���Ƶ�ת��
            /* ��һ��  ������ ת ʮ����:  ���Ϊ��ʼ��ÿ��λ�ϵ��������������2�� λ��-1�η���Ȼ����͡�
                      �˽��� ת ʮ����:  ���Ϊ��ʼ��ÿ��λ�ϵ��������������8�� λ��-1�η���Ȼ����͡�
                      ʮ������ ת ʮ����:  ���Ϊ��ʼ��ÿ��λ�ϵ��������������16�� λ��-1�η���Ȼ����͡�  */
        System.out.println(0x23A);
            /* ox23A = 10*16^0 + 3*16^1 + 2*16^2
                     = 10 + 48 + 512 = 570   */
        System.out.println(0b110001100);   // ��ҵ 1   ������ ת ʮ����
            /* 0b110001100 = 0*2^0 + 0*2^1 + 1*2^2 + 1*2^3 +  0*2^4 +  0*2^5 +  0*2^6 +
                             1*2^7 + 1*2^8 = 396  */
        System.out.println(02456);   //��ҵ 2  �˽��� ת ʮ����
            /* 02456 = 6*8^0 + 5*8^1 + 4*8^2 + 2*8^3 = 1326  */

        // λ���� - ˼����
        int a = 1 >> 2;   // ��������     1 ����λ�� 2λ
        int b = -1 >> 2;  // ��������    -1 ����λ�� 2λ
        int c = 1 << 2;   // ��������     1 ����λ�� 2λ
        int d = -1 << 2;  // ��������     1 ����λ�� 2λ
        int e = 1 >>> 2;  //  �޷�������
            // a , b , c , d ���
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // λ����
        System.out.println(2&3);   // ��λ��&      �����2
        System.out.println(~-2);   // ��λȡ��~    �����1
        System.out.println(~2);    // ��λȡ��~    �����3
        System.out.println(2|3);   // ��λ��|      �����3
        System.out.println(2^3);   // ��λ���^    �����1

        int aa = 1 >> 2;
        int cc = 1 << 2;
        System.out.println("aa = " + aa);     // aa=0
        System.out.println("cc = " + cc);     // cc=4
        int dd = 4 << 3;
        int bb = 15 >> 2;
        System.out.println("dd = " + dd);     // dd=32
        System.out.println("bb = " + bb);     // bb=3 (ȡ��)

            // ��ҵ 1
        System.out.println(10/3);      // 3
        System.out.println(10/5);      // 2
        System.out.println(10%3);      // 1
        System.out.println(-10.5%3);   // 1.5
            /*  a % b :�� a ��С��ʱ����ʽ = a��int��a / b * b
                       -10.5 % 3 = (-10)/3*3 =  -10.3 + 9 = 1.5 */

        int i = 66;
        System.out.println(++i+i);     // 134


    }
}