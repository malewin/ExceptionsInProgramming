package HomeWorks.FinalTask;

import java.util.Scanner;

public class GetFromConsole implements InputFromConsole{
    @Override
    public String prompt() {
        Scanner sc = new Scanner(System.in);
        String nextData = sc.nextLine();
        return nextData;
    }
}
