
public class ArrayAssign {

	public static void main(String[] args){
        //���鸳ֵ����2

        //�����������͸�ֵ�����ֵ���Ǿ�������ݣ������໥��Ӱ�졣
        int n1 = 2;
        int n2 = n1;
        n2 = 10;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

        //������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ��
        int [] arr1 = {1,2,3};
        int [] arr2 = arr1;
        arr2[0] = 80;
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1 [i]);
        }

    }
}
