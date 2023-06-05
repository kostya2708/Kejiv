import java.util.Random;
import java.util.Scanner;

public class StoneScissorsPaper {
    public static void main(String[] args) {
        System.out.println("Ну привет, вернулся значит, расскажешь какая неожиданность тебя ждала, хорошая или плохая?");
        System.out.println("1-Хорошая");
        System.out.println("2-Плохая");
        Scanner scan = new Scanner(System.in);
        byte answer1 = scan.nextByte();

        System.out.println("ну ладно,хватит разговоров, ты же все таки не за этим пришел, давай в этот раз сыграем в новую игру");
        System.out.println("не переживай она тоже не сложная, Камень Ножницы Бумага играем до 3 побед");
        System.out.println("правила простые, камень бьет ножницы, ножницы бьют бумагу, бумага бьет камень");
        System.out.println("Готов?");
        System.out.println("1-Да");
        System.out.println("2-Нет");
        Byte answer2 = scan.nextByte();

        if (answer2 == 1) {
            System.out.println("Хорошо, кстати я забыл рассказать о награде и о плате)");
            if (answer1==1){
                System.out.println("Хмм, раз ты такой везучий, если выйграешь то в течение месяца ты можешь попросить знак свыше");
                System.out.println("который поможет тебе принять правильное решение");
            } else if (answer1==2) {
                System.out.println("Хмм, раз ты такой не везучий, в течении этого месяца тебя юудет ждать удачное событие");
            }
            System.out.println("Но если проигрвешь, тебя будут ждать неудачи целую неделю, я буду тебя вставлять палки в колеса");
            System.out.println("во всяких мелких вещах");
            System.out.println("Я загадал, что бы ты не сомнивался в честности я выведу свой ответ сразу, но зашиврую его");
            System.out.println("и дам код от шифра после твоего ответа");
            Random random = new Random();
            int g=0;
            int k=0;
            byte win=0;
            while ((win!=1)){

            int atk = (random.nextInt(3)+1);
            int shift = (random.nextInt(15)*2+1);
            String[] attk = new String[]{"", "Каменьтишь", "Ножницытиш", "Бумагатишь"};
            String cipher = "";
            for(int i=0; i<attk[atk].length();i++){
                char ch = attk[atk].charAt(i);
                ch= (char)(ch+shift);
                cipher += ch;
            }

            System.out.println("Камень ножницы бумага су е фа");
            System.out.println("мой выбор "+cipher);
            System.out.println("1-Камень");
            System.out.println("2-Ножницы");
            System.out.println("3-Бумага");
            int answer3 = scan.nextByte();
            System.out.println("Мой выбор был "+attk[atk] + " А кодом к рашифровке было " +shift);

            if (answer3 == 1 & atk == 2 ||answer3 == 2 & atk == 3 ||answer3 == 3 & atk == 1 ){

                g++;
                if(g==3) {
                    win++;
                    System.out.println("Ну ладно, поздравляю с победой, иди и радуйся свой жизнью");
                }
                else System.out.println("Этот раунд за тобой");
            }
            else if (answer3==atk){
                System.out.println("Ничье, вот так случай");
            }
            else {
                System.out.println("Раунд мой");
                k++;
                if (k==3) {
                    win++;
                    System.out.println("Тебя ждут страдания и боль, если захочешь отыграться приходи, буду тебя ждать");
                }
            }
        }
        }
        else {
            System.out.println("Скучные люди, остаються скучными");
        }
    }
}
