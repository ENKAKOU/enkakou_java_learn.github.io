public class TwoDimensionalArray02 {
	
    public static void main(String[] args){

        //1) �﷨: ����[][] ������=new ����[��С][��С]
        //2) ����: int a[][]=new int[2][3]

        //int arr[][] = new int[2][3];
        int arr[][];                //������ά����
        arr = new int[2][3];        //�ٿ��ռ�
        arr[1][1] = 8;
        //���� arr ����
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {     //��ÿ��һά�������
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();//����
        }


    }
}
