public class BubbleSort {
	
    public static void main(String[] args) {
    	
        //���ǽ��������24,69,80,57,13 ʹ��ð�����򷨽����ų�һ����С������������С�

        //����һ�������ֲ�ʽ��������
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        /*   ���� [24,69,80,57,13]
             �� 1 ������: Ŀ���������������
               �� 1 �αȽ�[24,69,80,57,13]
               �� 2 �αȽ�[24,69,80,57,13]
               �� 3 �αȽ�[24,69,57,80,13]
               �� 4 �αȽ�[24,69,57,13,80]    */
        for (int j = 0; j < 4; j++) {   //4 �αȽ�
            //���ǰ�����>����������ͽ���
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("==�� 1 ��==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        /*   �� 2 ������: Ŀ��ѵڶ��������ڵ����ڶ�λ��
               �� 1 �αȽ�[24,69,57,13,80]
               �� 2 �αȽ�[24,57,69,13,80]
               �� 3 �αȽ�[24,57,13,69,80]   */
        for (int j = 0; j < 3; j++) {   //3 �αȽ�
            //���ǰ�����>����������ͽ���
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n==�� 2 ��==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }


        for (int j = 0; j < 2; j++) {   //2 �αȽ�
            //���ǰ�����>����������ͽ���
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n==�� 3 ��==");


        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        for (int j = 0; j < 1; j++) {   //1 �αȽ�
            //���ǰ�����>����������ͽ���
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        System.out.println("\n==�� 4 ��==");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println();



    }
}
