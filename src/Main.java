public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int month = sc.nextInt();

        int day = sc.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 || day <= 20)
                    System.out.println("摩羯座");
                else if (day >= 21 || day <= 31)
                    System.out.println("水瓶座");
                break;
            case 2:
                if (day >= 1 || day <= 19)
                    System.out.println("水瓶座");
                else if (day >= 20 || day <= 29)
                    System.out.println("雙魚座");
                break;
            case 3:
                if (day >= 1 || day <= 20)
                    System.out.println("雙魚座");
                else if (day >= 21 || day <= 31)
                    System.out.println("牡羊座");
                break;
            case 4:
                if (day >= 1 || day <= 20)
                    System.out.println("牡羊座");
                else if (day >= 21 || day <= 31)
                    System.out.println("金牛座");
                break;
            case 5:
                if (day >= 1 || day <= 19)
                    System.out.println("金牛座");
                else if (day >= 20 || day <= 29)
                    System.out.println("雙子座");
                break;
            case 6:
                if (day >= 1 || day <= 20)
                    System.out.println("雙子座");
                else if (day >= 21 || day <= 31)
                    System.out.println("巨蟹座");
                break;
            case 7:
                if (day >= 1 || day <= 20)
                    System.out.println("巨蟹座");
                else if (day >= 21 || day <= 31)
                    System.out.println("獅子座");
                break;
            case 8:
                if (day >= 1 || day <= 19)
                    System.out.println("獅子座");
                else if (day >= 20 || day <= 29)
                    System.out.println("處女座");
                break;
            case 9:
                if (day >= 1 || day <= 20)
                    System.out.println("處女座");
                else if (day >= 21 || day <= 31)
                    System.out.println("天秤座");
                break;
            case 10:
                if (day >= 1 || day <= 20)
                    System.out.println("天秤座");
                else if (day >= 21 || day <= 31)
                    System.out.println("天蠍座");
                break;
            case 11:
                if (day >= 1 || day <= 19)
                    System.out.println("天蠍座");
                else if (day >= 20 || day <= 29)
                    System.out.println("射手座");
                break;
            case 12:
                if (day >= 1 || day <= 20)
                    System.out.println("射手座");
                else if (day >= 21 || day <= 31)
                    System.out.println("摩羯座");
                break;
            default:
                System.out.println("錯誤");
        }
    }
}
