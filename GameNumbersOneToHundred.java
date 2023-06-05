import java.util.Random;
import java.util.Scanner;

public class GameNumbersOneToHundred {

        public static void main(String[] args){
        System.out.println("Здравствуй, предлагаю тебе сыграть в игру, я загадаю число от 11 до 100, а ты попробуешь отгадать,");
        System.out.println("отгадаешь завтра дома тебя будет ждать неожиданность, за каждый промах в мире умрет один случайный человек)");
                System.out.println("Сыграем?: ");
                System.out.println("1-Да");
                System.out.println("2-Нет");
                Scanner scan = new Scanner(System.in);
                Random random = new Random();
                byte num1 = scan.nextByte();
                switch (num1){
                        case 1: {
                                int num2 = (random.nextInt(100)+1);
                                System.out.println("Приступим, я загадал число, отгадывай");
                                int num3 = scan.nextInt();
                                if (num3 !=num2){
                                        int Dead = 1;
                                        System.out.println("Не угадал, ну а что от тебя ждать, ты же всего лишь человек, ладно немного помогу, буду говорить больше число что я загадал или меньше");
                                        do {
                                                Dead++;
                                                if (num3 > num2)
                                                        System.out.println("Меньше");
                                                else if (num3 < num2) {
                                                        System.out.println("Больше");
                                                }
                                                num3 = scan.nextInt();
                                        }while (num3 != num2);
                                        if (num3 == num2) {
                                                if (Dead == 1){
                                                System.out.println("Поздравляю, ты убил всего "+Dead +", человека,как и договаривались тебя ждет неожиданность, а вот какая зависит от твоего везения хе-хе");
                                                }
                                                else
                                                        System.out.println("ты убил " +Dead+" человек живи с этим, ну а неожиданность ждет тебя как и договаривались, но стоило ли оно того... потом расскажешь... хе-хе");
                                        }
                                }
                                else {
                                        System.out.println("Я удивлен, ты точно обычный человек? ну как и договаривались, тебя ждет неожиданность, а вот какая зависит от твоего везения хе хе");
                                } break;
                        }
                        case 2: {
                                System.out.println("Скучный ты человек, ну пока");
                        }
                }
        }
}
