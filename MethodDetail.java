public class MethodDetail {
   public static void main(String[] args) {
	   
   
   AA a = new AA();
   int[] res = a.getSumAndSub(1, 4);
   System.out.println("��=" + res[0]);
   System.out.println("��=" + res[1]);


   byte b1 = 1;
   byte b2 = 2;
   a.getSumAndSub(b1, b2);
   
   a.f3("tom", 10); //ok
   //a.f3(100, "jack"); // ʵ�ʲ�������ʽ����˳�򲻶�
   
   }
}

   class AA {
   
   public void f4() {
   //����
   // public void f5() {
   // }
   }
   
   public void f3(String str, int n) {
   }
   //1. һ�����������һ������ֵ [˼������η��ض����� �������� ]
     public int[] getSumAndSub(int n1, int n2) {
     int[] resArr = new int[2]; //
     resArr[0] = n1 + n2;
   
     resArr[1] = n1 - n2;
     return resArr;
     }
   
   
   public double f1() {
     double d1 = 1.1 * 3;
     int n = 100;
     return n; // int ->double
     //return d1; //ok? double -> int
   }
   
 
   public void f2() {
     System.out.println("hello1");
     System.out.println("hello1");
     System.out.println("hello1");
     int n = 10;

     //return ;
    }
}