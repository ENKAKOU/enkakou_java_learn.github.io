public class ArrayReverse {
    public static void main(String[] args){

        //�������Ԫ�����ݷ�ת��
        //arr {11,22,33,44,55,66} {66, 55,44,33,22,11

        /* ����һ
        ��������
        1. �� arr[0] �� arr[5] ���н��� {66,22,33,44,55,11}
        2. �� arr[1] �� arr[4] ���н��� {66,55,33,44,22,11}
        3. �� arr[2] �� arr[3] ���н��� {66,55,44,33,22,11}
        4. һ��Ҫ���� 3 �� = arr.length / 2
        5. ÿ�ν���ʱ����Ӧ���±� �� arr[i] �� arr[arr.length - 1 -i  */

        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;               //��������ĳ���
        for( int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];//����
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("===��ת������===");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");//66,55,44,33,22,11
        }

        System.out.println();


        /* ������
        �������� ��ʹ������ֵ��ʽ��
        1. �ȴ���һ���µ����� arr2 ,��С arr.length
        2. ������� arr ,�� ÿ��Ԫ�ؿ����� arr2 ��Ԫ����(˳�򿽱�)
        3. ��������һ��ѭ������ j -> 0 -> 5
        4. �� for ѭ��������arr2 ����һ����������� {66, 55, 44,33, 22, 11}
        5. �� arr ָ�� arr2 ���ݿռ�, ��ʱ arr ԭ�������ݿռ��û�б�������   */

        int[] arr2= {11, 22, 33, 44, 55, 66};
        int[] arr3 = new int[arr.length];
         //������� arr
        for(int i = arr2.length - 1, j = 0; i >= 0; i--, j++) {
            arr3[j] = arr2[i];
        }
        // �ᱻ��������������
        arr2 = arr3;

        //��� arr2
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

    }
}
