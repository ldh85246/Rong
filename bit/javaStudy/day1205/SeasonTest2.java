import java.util.Scanner;

class SeasonTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.print("���� �Է��ϼ��� : ");
        month = sc.nextInt();
        String r="�ܿ�";
         
        if(month < 0 || month  > 12) {
            System.out.println("���� Ȯ���ϼ���.");
            return;
        } if(month >= 3 && month <= 5) {
            r = "��";
        } else if(month >= 6 && month <= 8) {
            r = "����";
        } else if(month >= 9 && month <= 11) {
            r = "����";
        } System.out.println(month + "���� " + r + "�Դϴ�.");
    }
}