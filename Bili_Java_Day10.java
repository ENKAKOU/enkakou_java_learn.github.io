import java.util.Scanner;

public class Bili_Java_Day10 {
	
    //����һ�� main����
    public static void main(String[] args){
        /*˼·��
             1. ����Scanner���󣬽����û�����
             2. ���ճɼ����浽 double score
             3. ʹ��if-else�жϣ�����ɼ�����8.0����������������ʾ����̭
             4. �������������ٽ���char gender��ʹ��if-else�����Ϣ  */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������ø��ֵĳɼ�");
        double score = myScanner.nextDouble();
        if(score > 8.0){
            System.out.println("�������Ա�");
            char gender = myScanner.next().charAt(0);
            if(gender == '��'){
                System.out.println("����������");
            }else if(gender == 'Ů'){
                System.out.println("����Ů����");
            }else{
                System.out.println("�Ա������������������");
            }
        }else {
            System.out.println("��Ǹ���㱻��̭��");
        }

        // switch ��֧
        char c = 'a';
        switch (c){
            case 'a':
                System.out.println("ok 1");
                break;
            case 20:
                // case 'b':
                // case '2':
                // case 'a' + 1:   �������ʽ
                System.out.println("ok 2");
                break;
            default:
                System.out.println("ok 3");
        }
        /* ��дһ�����򣬸ó�����Խ���һ���ַ����磺a,b,c,d,e,f,g
           a��ʾ����һ��b��ʾ���ڶ�...
           �����û���������ʾ��Ӧ����Ϣ��Ҫ��ʹ��switch������
           ˼·��
             1. ����һ���ַ�������Scanner����
             2. ʹ��switch�����ƥ�䣬�������Ӧ��Ϣ   */
        Scanner myScanner02 = new Scanner(System.in);
        System.out.println("������һ���ַ���a-g��");
        char c1 = myScanner02.next().charAt(0); // �ѽ��յ����ַ�����ת���ַ�
        // java�У�ֻҪ����ֵ���أ�����һ�����ʽ
        switch (c1){
            case 'a':
                System.out.println("����������һ");
                break;
            case 'b':
                System.out.println("���������ڶ�");
                break;
            case 'c':
                System.out.println("������������");
                break;
            case 'd':
                System.out.println("������������");
                break;
            case 'e':
                System.out.println("������������");
                break;
            case 'f':
                System.out.println("������������");
                break;
            case 'g':
                System.out.println("������������");
                break;
            default:
                System.out.println("��������ַ�����ȷ������������");
                break;
        }
        System.out.println("�˳�switch������ִ�г���");

        //switch ��Сд���͵�char��תΪ��д���������룩��ֻת��a,b,c,d,e,��������other��
        Scanner myScanner03 = new Scanner(System.in);
        System.out.println("����һ����Ҫת���ɴ�д��ĸ��Сд��ĸ��a-e��֮��");
        char c2 = myScanner02.next().charAt(0);
        switch (c2){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("����Ϊother������������");
                break;
        }
        System.out.println("�˳�switch������ִ�г���");

        //����ɼ�[60,100]��(int)(�ɼ�/60)=1;  ����ɼ�[0,60),(int)(�ɼ�/60)=0;
        double score02 = 88.5;
         //ʹ��if-else����֤����ɼ���Ч 0-100
        if( score02 >=0 && score02 <= 100){
            switch ((int)(score02 / 60)){
                case 0:
                    System.out.println("�ɼ����ϸ�");
                    break;
                case 1:
                    System.out.println("�ɼ��ϸ�");
                    break;
                default:
                    System.out.println("�������");
                    break;
            }
        }else {
            System.out.println("�����д�������ĳɼ�Ҫ��0-100֮��");
        }

        //ָ���·ݣ���ӡ���·��������ڣ�3-5�´�����6-8���ļ���9-11���＾��12-2�¶�����ʹ�ô�͸����
        /* ˼·��
               1. ����ָ�������·ݣ�Scanner���󣬽����û�����
               2. ʹ��int month �����·�
               3. ʹ��switch��ƥ�䣬ʹ�ô�͸����ɣ��Ƚϼ�� */
        Scanner myScanner04 = new Scanner(System.in);
        System.out.println("�������·�");
        int month = myScanner04.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("�ļ�");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�＾");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("����");
                break;
            default:
                System.out.println("������·���������������");
                break;
        }


    }
}
