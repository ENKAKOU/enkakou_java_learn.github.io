import java.util.Scanner;

public class Bili_Java_Day_13 {
    public static void main(String[] args){

        //����ʹ��1
            /* ���� 1��
                     ѭ������5���ɼ������浽double���飬�����
               ˼·��1. ����һ�� double���飬��С5
                    2. ѭ������
                    3. scores.length ��ʾ����ĳ���/��С
                    4. ����Scanner���󣬽����û�����   */
        double [ ] scores = new double [5];
        Scanner myScanner = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
            System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
            scores[i] = myScanner.nextDouble();
        }
        //�������������
        for(int i = 0; i < scores.length; i++){
            System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ" + scores[i]);
        }

        /* ����һ�� char ���͵� 26 ��Ԫ�ص����飬�ֱ� ����'A'-'Z'��
           ʹ�� for ѭ����������Ԫ�ز���ӡ������
           ��ʾ��char ������������ 'A'+2 -> 'C' */

        char[] chars = new char[26];
        for(int i = 0; i < chars.length;i++){
            chars[i] = (char)('A' + i);
        }
        for(int i = 0; i < chars.length;i++){
            System.out.print(chars[i] + " ");
        }

        System.out.println( );

        // �����һ������ int[]�����ֵ {4,-1,9, 10,23}�����õ���Ӧ���±�
        int[] arr = {4,-1,9,10,23};
        int max = arr[0];                        //�ٶ���һ��Ԫ�ؾ������ֵ
        int maxIndex = 0;
        for(int i = 1; i < arr.length; i++) {  //���±� 1 ��ʼ���� arr
            if(max < arr[i]) {                //��� max < ��ǰԪ��
                max = arr[i];                //�� max ���ó� ��ǰԪ��
                maxIndex = i;
            }
        }
        //�����Ǳ���������� arr �� , max �������������ֵ��maxIndex ���ֵ�±�
        System.out.println("max=" + max + " maxIndex=" + maxIndex);

    }
}
