import java.util.Scanner;

public class ArrayReduce{
	
    public static void main(String[] args){
        //��һ������ {1�� 2�� 3�� 4�� 5}�� ���Խ������������������ʾ�û��Ƿ����������ÿ����������Ǹ�Ԫ�ء�
        //��ֻʣ�����һ��Ԫ�أ���ʾ��������������

        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        boolean reduce = false;
        do{
            int[] arrNew = new int[arr.length - 1];
            for(int i = 0;i < arr.length - 1;i++){
                arrNew[i] = arr[i];
            }
            System.out.println("������ɣ���������Ԫ��Ϊ" + arr[arr.length-1]);
            arr = arrNew;
            System.out.print("arr���� �������ֵ��");
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i] + "  ");
            }
            if(arr.length == 1){
                System.out.println("\n arr��������ֻʣ�����һ��Ԫ�أ���������������");
                break;
            }
            System.out.print("\n �Ƿ��������(Y/N):");
            while(true){
                char kay = input.next().charAt(0);
                if(kay == 'n' || kay == 'N'){
                    System.out.println("�õ�");
                    break;
                }else if(kay == 'y' || kay == 'Y'){
                    reduce = true;
                    break;
                }else{
                    System.out.print("��������,����������(Y/N)��");
                }
            }
        }while(reduce);
    }
}




