import java.util.Scanner;

public class HomeWork_01_02_03 {
	
    public static void main(String[] args){
        // ����1
            /* ĳ����100��000Ԫ��ÿ����һ��·�ڣ���Ҫ�ɷѣ��������£�
               ���ֽ� > 50000,ÿ�ν�5%
               ���ֽ� < 50000,ÿ��1000
               ������˿��Ծ������ٴ�·�ڣ�while + break�� */
        /* ˼·��
               1. ���� double money ���� 100��000
               2. ����������� money > 50000;  �� money >= 1000 && money <= 50000; �� money < 1000;
               3. ���� count ����ͨ����·��    */
        double money = 100000;
         int count = 0;
        while (true){
            if(money > 50000){
                money *= 0.95;
                count++;
            } else if(money >= 1000){
                money -= 1000;
                count++;
            }else {
                break;
            }
            System.out.println(money + "������" + count + "·��");
        }


        // ����2
            /* �ж�һ�������������ĸ���Χ������0��С��0������0;
               ˼·��
                  1. ����Sanner���󣬽����û����������
                  2. ������� int n ������������
                  3. ʹ��if ���� else if ���� else  */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ������ ����");
        int n = myScanner.nextInt();      // �����ܴ�����
        if(n > 0 ){
            System.out.println(n + "����0");
        } else if( n < 0){
            System.out.println(n + "С��0");
        } else {
            System.out.println(n + "����0");
        }


        // ����3
            /* �ж�һ�����������Ƿ�������;
               ˼·��
                  1. ����Scanner���󣬽����û����������
                  2. ������� long year �������
                  3. ���Ҫ�ܱ�4���������ǲ��ܱ�100�������ܱ�400 ������  */
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("������һ����ݣ�����4λ���֣�");
        long year = myScanner2.nextLong();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "������");
        } else {
            System.out.println(year + "��������");
        }


    }
}
