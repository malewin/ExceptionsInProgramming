package HomeWorks.LastTask;

import java.util.Scanner;

public class GetFromConsole implements InpFrConsole {

    @Override
    public String prompt() {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        return msg;
    }
    
}
