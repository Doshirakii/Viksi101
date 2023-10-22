public class Main3 {
    public static void main(String[] args) {
        getChange(38);

    }
    public static void getChange(int num){ // 38
        int coin = 0;
        if(num >= 10) coin = 10;
        else if(num >= 5) coin = 5;
        else if (num >=2) coin = 2;
        else if (num >=1) coin = 1;
        if (coin != 0) {
            System.out.println(coin);
            getChange(num - coin);
        }
    }
}
