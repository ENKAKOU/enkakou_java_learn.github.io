import java.util.Scanner;

public class SeqSearch {
	
	
    public static void main(String[] args){
        /*   ��һ�����У���üӥ������ëʨ����������������������������Ϸ��
             �Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ�
             Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ
        ˼·:
             1. ����һ���ַ�������
             2. ����Scanner���󣬽����û�����, �������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�   */

             //����һ���ַ�������
        String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("����������");
        String findName = myScanner.next();

             //�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
        int index = -1;
        for(int i = 0; i < names.length; i++) {
             //�Ƚ� �ַ����Ƚ� equals, ���Ҫ�ҵ����־��ǵ�ǰԪ��
            if(findName.equals(names[i])) {
                System.out.println("��ϲ���ҵ� " + findName);
                System.out.println("�±�Ϊ= " + i);
             //�� i ���浽 index
                index = i;
                break;//�˳�
            }
        }
        if(index == -1) { //û���ҵ�
            System.out.println("sorry ,û���ҵ� " + findName);
        }


        /*  ���һ������������ж��ֲ��� {1,8, 10, 89, 1000, 1234} ������һ���������������Ƿ���ڴ�����
            ��������±꣬���û�о���ʾ"û�������"��

            ˼·��
                1. ����ȷ����������м���±�mid = (left + right) / 2��*/

    }
}


