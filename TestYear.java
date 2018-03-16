public class TestYear {
    public static void main(String[] args) {
        int year;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter year:");
        year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d năm nhuận", year);
                } else {
                    System.out.printf("%d không phải năm nhuận", year);
                }
            } else {
                System.out.printf("%d năm nhuận", year);
            }
        } else {
            System.out.printf("%d không phải năm nhuận", year);
        }

    }
}
