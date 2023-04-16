import java.util.Scanner;

class Days{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        //String month;
        int year, m;
        boolean check = false;
        //m = getMonthDays(month);
        do {
            System.out.println("Enter month: ");
            String month = n.nextLine();
            System.out.println("Enter year: ");
            year = n.nextInt();
            n.nextLine();
            m = getMonthDays(month);
            if (m >= 1 && m <= 12 && year > 0) {
                check = true;
            }
            else {
                System.out.println("Invalid! Please re-enter");
            }
        } while(!check);

        if((m==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("Number of days is 29");
        else if(m==2)
            System.out.println("Number of days is 28");
        else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
            System.out.println("Number of days is 31");
        else
            System.out.println("Number of days is 30");
    }
    public static int getMonthDays(String month) {
        return switch (month) {
            case "January", "Jan.", "Jan", "1" -> 1;
            case "February", "Feb.", "Feb", "2" -> 2;
            case "March", "Mar.", "Mar", "3" -> 3;
            case "April", "Apr.", "Apr", "4" -> 4;
            case "May.", "May", "5" -> 5;
            case "June", "June.", "Jun", "6" -> 6;
            case "July", "July.", "Jul", "7" -> 7;
            case "August", "Aug.", "Aug", "8" -> 8;
            case "September", "Sept.", "Sep", "9" -> 9;
            case "October", "Oct.", "Oct", "10" -> 10;
            case "November", "Nov.", "Nov", "11" -> 11;
            case "December", "Dec.", "Dec", "12" -> 12;
            default -> 0;
        };
    }
}