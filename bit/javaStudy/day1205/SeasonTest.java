import java.util.Scanner;

class SeasonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.print("월을 입력하세요 : ");
        month = sc.nextInt();

        String r = "";

        if(month >= 3 && month <= 5) {
            r = "봄";
        } else if(month >= 6 && month <= 8) {
            r = "여름";
        } else if(month >= 9 && month <= 11) {
            r = "가을";
        } else if(month == 1 || month == 2 || month == 12) {
            r = "겨울";
        } System.out.println(month + "월은 " + r + "입니다.");
    }
}