public class BubbleSort02 {
	
    public static void main(String[] args){
        //���ǽ��������24,69,80,57,13 ʹ��ð�����򷨽����ų�һ����С�������������

          //������������Ϊ��������
        int [] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        for( int i = 0; i < arr.length - 1; i++) {              //���ѭ���� 4 ��
            for( int j = 0; j < arr.length - 1 - i; j++) {     //4 �αȽ�-3 ��-2
            if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
        }
            System.out.println("\n == ��" + (i + 1) + "�� ==");
            for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] + "\t");
                }

        }

    }
}
