import java.util.Scanner;

public class Bili_Java_Day_12 {
    public static void main(String[] args){

        // ����ѭ����ҵ 2  �žų˷���
            // ʹ�����forѭ�������ڿ��ƴ�ӡ����
        for(int a = 1; a <=9; a++){
            // ʹ���ڲ�forѭ�������ڿ��ƴ�ӡ����
            for(int b = 1; b <= a; b++){
                System.out.println(b + "*" + a + "=" + a*b + "");
            }
            System.out.println( );
        }

        // ѭ��������� - break
        for(int i = 0; i < 10; i++){
            if(i == 3){
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("�˳�forѭ��");

        // ��ǩ�Ļ���ʹ��
        lable1:
        for (int c = 0; c < 4; c++){  // ���for
            lable2:
            for(int d = 0; d <= 10; d++){  // �ڲ�for
                if( d == 2){
                    break lable1;  // �ȼ� break lable2
                }
                System.out.println("d=" + d);
            }
        }

        // ѭ��1-100�����sum�� ��sum > 20 ʱ����¼�µ�ǰ����Ȼ��break
        // ��forѭ���ⲿ��������� n
        int sum = 0;   // �ۼ�
        // ע�� n �����÷�Χ��for{}
        int n = 0;
        for(int e = 1; e <= 100; e++){
            sum += e;
            if( sum > 20){
                System.out.println("�� > 20ʱ ��ǰ�� e=" + e);
                n = e;
                break;
            }
        }
        System.out.println("��ǰ��=" + n);

        /* ʵ�ֵ�¼��֤����3�λ��ᣬ����û���Ϊ�����桱�����롰666����ʾ��¼�ɹ���
           ������ʾ���м��λ��ᣬ��ʹ��for + break���  */
            /*˼·������
              1. ����Scanner��������û�����
              2. ����String name; String passwd; �����û���������
              3. ���ѭ��3�Ρ���¼3�Ρ������ ������������ǰ�˳�
              4. ����һ����� int chance ��¼���м��ε�¼����*/
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for(int g = 1; g <= 3; g++){  //3 �ε�¼����
            System.out.println("����������");
            name = myScanner.next();
            System.out.println("����������");
            passwd = myScanner.next();
                //�Ƚ���������ֺ������Ƿ���ȷ
                // ����˵���ַ��� ������ �Ƚ� ʹ�õ� ���� equals
            if("����".equals(name) && "666".equals(passwd)) {
                System.out.println("��ϲ�㣬��¼�ɹ�~");
                break;
            }
                //��¼�Ļ���ͼ���һ��
            chance--;
            System.out.println("�㻹��" + chance + "�ε�¼����");
        }

        // ��ת�������-continue
        label1:
        for(int h = 0; h < 4; h++){
            label2:
            for(int k = 0; k < 10; k++){
                if(k == 2){
                //�����ֱ����ʲôֵ��������
                //continue ;
                //continue label2;
                    continue label1;
                }
                System.out.println("k = " + k);
            }
        }

        // ��ת�������-return
        for(int v = 1; v <= 5; v++){
            if(v == 3){
                System.out.println("��˳ƽ����" + v);
                return;
            }
            System.out.println("hello");
        }
        System.out.println("go on...");





    }
}
