
public class TwoDimensionalArray01 {
	
    public static void main(String[] args){

    /*    ���ö�ά�����������ͼ��
          0 0 0 0 0 0
          0 0 1 0 0 0
          0 2 0 3 0 0
          0 0 0 0 0 0     */

          //ʲô�Ƕ�ά���飺
          //1. �Ӷ�����ʽ�Ͽ� int[][]
          //2. ����������⣬ԭ����һά�����ÿ��Ԫ����һά����, �͹��ɶ�ά����
          int[][] arr = { {0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0,2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0} };
          System.out.println("��ά�����Ԫ�ظ���=" + arr.length);
          System.out.println("��3��һά����ĵ� 4 ��ֵ=" + arr[2][3]);
          for(int i = 0; i < arr.length; i++) {       //������ά�����ÿ��Ԫ��

            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");    //�����һά����
            }
            System.out.println();
        }
          

    }
}


