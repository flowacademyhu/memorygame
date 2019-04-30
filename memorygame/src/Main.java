import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map map= new Map(4,4,2);
        map.printMap();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        while (!s.equals("quit")){
            String[] str=s.split(" ");
            int x = Integer.parseInt(str[0])-1;
            int y = Integer.parseInt(str[1])-1;
            map.doClick(x,y);
            map.printMap();
            s = scanner.nextLine();
        }
        scanner.close();
    }
}
