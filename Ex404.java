import java.util.Scanner;

public class Ex404 {

    public static void main(String[] args) {
        System.out.print("당신의 나이가 뭐예요?");
        System.out.print("\n당신의 키가 몇cm입니까?");

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        int height = s.nextInt();

        if (age > 15) {
            if (height > 140) {
                System.out.println("T-익스프레스를 탈 수 있어요.");
            } else {
                System.out.println("미안해요. 키로 인해 탑승 불가.");
            }
        } else {
            System.out.println("미안해요. 나이로 인해 탑승 불가.");
        }

    }

}