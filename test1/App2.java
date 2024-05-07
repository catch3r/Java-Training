import math.BasicMath;

class Test3 {
    public static void main(String[] args) {
        // 程式進入點
        Test3.talk("Hello"); // 呼叫類別的方法
        Test3.talk("你好");
        // talk();
        int ans = BasicMath.add(3, 4);
        System.out.println(ans * 20);
        ans = BasicMath.mutliply(4, 2);
        System.out.println("乘法的結果是：" + ans);
    }

    // 定義更多自己的類別方法
    static void talk(String content){
        System.out.println(content);
    }
}

class BasicMath {
    static int add(int n1, int n2){
        int result = n1 + n2;
        // System.out.println(result);
        return result;
    }

    static int mutliply(int n1, int n2){
        return n1 * n2;
        // System.out.println(result);
    }
     
}
