public class HomeWord_07_08 {
	
	
    public static void main(String[] args){
        //��� 1-1/2+1/3-1/4....1/100 �ĺ�
        double sum = 0;
        for(int i = 1; i <= 100; i++){
            if( i % 2 != 0){
                sum += 1.0 / i;
            } else {
                sum -= 1.0 / i;
            }
        }
        System.out.println("sum=" + sum);

        System.out.println();

        // ����8
            /* ��1+��1+2��+��1+2+3��+��1+2+3+4��+....+��1+2+3...100���Ľ��    */
        int sum2 = 0;
        for(int a = 1; a <= 100; a++){
            for(int b = 1; b <= a; b++){
                sum2 += b;
            }
        }
        System.out.println("sum2=" + sum2);
        
        
    }
}
