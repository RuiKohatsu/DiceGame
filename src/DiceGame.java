import java.util.Random;
public class DiceGame {
    public static int diceRoll(int diceCount){
        var sum = 0;

        for(var i = 0; i < diceCount; i++){
            var rand = new Random();
            var roll = rand.nextInt(1, 7);
            sum += roll;
            if(i < diceCount - 1) {
                System.out.print(roll + ",");
            }else{
                System.out.print(roll);
            }
        }
        System.out.println("");
        return sum;
    }
}
