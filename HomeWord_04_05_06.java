import javax.swing.text.Style;

import java.util.Scanner;

public class HomeWord_04_05_06 {
	
	
    public static void main(String[] args){
        // ����4
            /* �ж�һ�������Ƿ��� ˮ�ɻ�����ָ1��3λ�����������λ�����������͵����䱾��
               �磻153 = 1*1*1 + 2*2*2 + 5*5*5

               ˼·1��
                   1. ����һ������ int n ��������
                   2. �ȵõ�n �� ����λ�ϵ���������if �� else�ж�
                      n1 (n ��λ) = n / 100
                      n2 (n ʮλ) = n % 100 / n
                      n1 (n ��λ) = n % 10      */
        int n = 153;
        int n1 = n / 100;
        int n2 = n % 100 / 10;
        int n3 = n % 10;
        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n){
            System.out.println(n + "��ˮ�ɻ�����");
        } else {
            System.out.println(n + "����ˮ�ɻ���");
        }

            /* ˼·2��
                   1. ���� Scanner ���󣬽����û����������
                   2. ������� int a ; ��������
                   3. �ȵõ�n �� ����λ�ϵ���������if �� else�ж�
                      a1(a ��λ) = a / 100
                      a2(a ʮλ) = a % 100 / n
                      a1(a ��λ) = a % 10    */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ�����֣������ж�");
        int a = myScanner.nextInt();
        int a1 = a / 100;
        int a2 = a % 100 / 10;
        int a3 = a % 10;
        if(a1 * a1 * a1 + a2 * a2 * a2 + a3 * a3 * a3 == a){
            System.out.println(a + "��ˮ�ɻ�����");
        } else {
            System.out.println(a + "����ˮ�ɻ���");
        }


        // ����5
             /* ���1-100֮�䣬���ܱ�5����������ÿ5��һ��
                ˼·��
                   1. ���1-100��������
                   2. ������������ܱ�5����
                   3. ÿ5��һ�У���int count ͳ������������� count % 5 = 0,�����һ�����п���
              */
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 5 != 0){
                System.out.println(i + " ");
                count++;
                if(count % 5 == 0){
                    System.out.println();  //�����������
                }
            }
        }


        // ����6
            /* ���Сд�� a����z���Լ���д Z����A��
               'b'='a'+1  'c'= 'a'+2  */
        for(char c1 = 'a'; c1 <= 'z'; c1++){
            System.out.println(c1 + " ");
        }
        for (char c1 = 'Z'; c1 >= 'A';c1--){
            System.out.println(c1 + " ");
        }

    }
}
