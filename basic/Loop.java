package basic;
public class Loop {
    public static void main(String[] args) {
        // while 迴圈
        // 無窮迴圈
        // while(true) {
        //     System.out.println("Loop");

        // }

        // 可以被控制運作次數的迴圈
        // int x = 2;
        // while(x <= 6){
        //     System.out.println(x);
        //     x += 2;
        // }

        // 計算 1+2+3+4+5 的總和
        // int total = 0;
        // int n = 1;
        // while (n <= 100) {
        //     total = total + n;
        //     n++;
        // }
        // System.out.println(total);

        // total = total + 1;
        // total = total + 2;
        // total = total + 3;
        // total = total + 4;
        // total = total + 5;
        // System.out.println(total);

        // for 迴圈
        // int x = 2;
        // while(x <= 6){
        //     System.out.println(x);
        //     x += 2;
        // }
        // 控制 for 迴圈的運作
        // for(int x = 2; x <= 6; x++) {
        //     System.out.println(x);
        // }
        // 計算 1+2+3+4+5...+100 的總和
        int total = 0;
        for(int n = 1; n <= 100; n++){
            total = total + n;
        }

        System.out.println(total);
    }
}
