public class Bili_Java_Day11 {
	
    //������һ��main����
    public static void main(String[] args){
        //forѭ��
        for (int i = 1; i <= 3; i++){
            System.out.println("��ã�java" + i);
        }

        //for(;ѭ���ж�����;)
        int i = 1;      //ѭ��������ʼ��
        for (; i <= 5 ;){       //ѭ������
            System.out.println("���" + i);
            i++;
        }
        System.out.println("i= " + i);

        //�ڴ������
        int count = 3;
        for(int j = 0,g = 0; j < count; j++,g += 2){
            System.out.println("j=" +j+"g=" + g);
      }
        //forѭ��  ��1
            /* ��ӡ1-100֮��������9 �ı�����������ͳ�Ƹ������ܺͣ����ɣ�����Ϊ��������
               ����Ϊ�򣺽����ӵ����󣬲��ɼ򵥵����������
               �������ȿ��ǹ̶���ֵ����ת�ɿ������仯��ֵ
               ����Ϊ�� ˼·��
                  1. ������1-100��ֵ
                  2. ��������н��й��ˣ�ֻ���9�ı����� i % 9 == 0
                  3. ͳ�Ƹ���������һ������ int count = 0; ����������ʱ count++;
                  4. ���ܺͣ�����һ������ int = sum = 0; ����������ʱ sum += b */
        int count2 = 0;    //ͳ��9�ı������� ����
        int sum = 0;      //�ܺ�
        for(int b = 1; b <= 100; b++){
            if( b % 9 == 0){
                System.out.println("b = " + b);
                count2++;
                sum += b;   //�ۼ�
            }
        }
        System.out.println("count2 = " + count2);
        System.out.println("sum = " + sum);

            /* ������� ˼·��
                  1. Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼ��ֵ���ͽ�����ֵ����������
                  2. ������  ����Ҳ���ɱ�����int t = 9  */
        int count3 = 0;    //ͳ��9�ı������� ����
        int sum2 = 0;      //�ܺ�
        int start = 1;
        int end = 100;
        int t = 9;        //����
        for(int b2 = start; b2 <= end; b2++){
            if( b2 % t == 0){
            System.out.println("b2 = " + b2);
            count3++;
            sum2 += b2;   //�ۼ�
            }
        }
        System.out.println("count3 = " + count3);
        System.out.println("sum2 = " + sum2);

        //forѭ��  ��2
            /* ����Ϊ�� ˼·��
                1. ����� 0-5;
                2. �����+�� 5-e  */
        for(int e = 0; e <= 5;e++){
            System.out.println(e + "+" + (5-e) + "=5");
        }
            /* ������� ˼·��
                1. 5 �滻�� ���� n  */
        int n = 10;
        for(int e2 = 0; e2 <= n;e2++){
            System.out.println(e2 + "+" + (n-e2) + "=" + n);
        }
        
    }
}
