import java.util.Scanner;

public class MuFor_2023_1_27 {
	
    public static void main(String[] args){
    	
        for(int a = 0; a < 2; a++){
            for(int g = 0; g < 3; g++){
                System.out.println("a=" + a + "g=" + g);
            }
        }
        /* ϰ��1��ͳ��3���༶�ĳɼ������ÿ������5��ͬѧ
                 ������༶ƽ���ֺ����а༶��ƽ���֣�ѧ���ĳɼ��Ӽ������룩
                 ͳ�������༰��������ÿ������5��ͬѧ
            /*˼·����������Ϊ�򣩣�
                 1. �ȼ���һ���࣬5��ѧ���ĳɼ�;ʹ��forѭ��;
                    ����Scanner���󣬽����û�����;
                    �õ��ð༶��ƽ���֣��ȶ���һ�� double sum �Ѹð༶5��ѧ���ĳɼ��ۼ�����
                 2. ͳ��3���༶��ÿ����5��ѧ����ƽ����
                 3. ���а༶��ƽ����
                    ����һ������ double totalScore �ۼ�����ѧ���ĳɼ�
                    ������ѭ��������totalScore / (3 * 5);
                 4. ͳ�������༰������
                    ������� int passNum = 0; ����һ��ѧ���ɼ� >= 60, passNum++
                    ���>=60  passNum++
                 5. �Ż���Ч�ʣ��ɶ��ԣ��ṹ��*/

        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;  //�ۼ�����ѧ���ĳɼ�
        int passNum = 0;   //�ۼ� ��������
        for(int i = 1; i <= 3; i++){    // i ��ʾ�༶
            double sum = 0;     // һ���༶���ܷ�
            for(int j = 1; j <= 5; j++){    // j ��ʾѧ��
              System.out.println("�������" + i + "��ĵ�" + j +"��ѧ���ĳɼ�");
              double score = myScanner.nextDouble();
                //����һ��ѧ���ɼ� >= 60, passNum++
              if(score >= 60){
                  passNum++;
            }
            sum += score;   // �ۼ�
            System.out.println("�ɼ�Ϊ" + score);
        }
            //��Ϊsum �� 5��ѧ�����ܳɼ�
        System.out.println("sum=" + sum + " ƽ����=" + (sum / 5));
            //��sum �ۼƵ� totalScore
            totalScore += sum;
        }
        System.out.println("�������ܷ�=" + totalScore + " ƽ����=" + totalScore / 15);
        System.out.println("����������=" + passNum);


        // ��ӡһ������
        for(int y = 1; y <= 5; y++){   //y ��ʾ����
            System.out.println("*****");
        }
        // ��ӡ���������
        for(int w = 1; w <= 5; w++){
            // ���ƴ�ӡÿ��� * ��
            for( int v = 1; v <= w; v++){
                System.out.println("*");
        }
            System.out.println("");
        }



    }
}
