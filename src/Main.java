import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                ------------------------------
                サイコロゲームを開始します。
                ------------------------------""");
        System.out.println("サイコロを振る回数を指定してください。");
        var sc = new Scanner(System.in);
        var num = sc.nextLine();
        var diceCount = Integer.parseInt(num);

        System.out.println("------------------------------");

        var gameCount = 1;
        var win = 0;
        var lose = 0;

        while(true) {
            System.out.println(gameCount + "回目のゲーム");

            System.out.print("あなたの出た目：");
            var mySum = DiceGame.diceRoll(diceCount);
            System.out.println("合計値：" + mySum + "\n");

            System.out.print("コンピュータの出た目：");
            var cpuSum = DiceGame.diceRoll(diceCount);
            System.out.println("合計値：" + cpuSum + "\n");

            if (mySum > cpuSum) {
                System.out.println("結果：あなたの勝ちです。\n");
                win += 1;
            } else if (mySum < cpuSum) {
                System.out.println("結果：あなたの負けです。\n");
                lose += 1;
            } else {
                System.out.println("結果：同点です");
            }

            System.out.println("戦歴：" + win + "勝" + lose + "敗\n");
            System.out.println("------------------------------");
            System.out.println("ゲームを続けますか？(y/n)");
            var con = sc.nextLine();

            if(con.equals("y")){
                gameCount += 1;

            }else if(con.equals("n")){
                break;
            }
        }
        System.out.println("サイコロゲームを終了します。");
    }

}