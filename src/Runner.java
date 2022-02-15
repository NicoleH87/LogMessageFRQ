import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {
        LogMessage webserver = new LogMessage("Webserver:disk offline");
        System.out.println(webserver.containsWord("disk"));

        LogMessage server1 = new LogMessage("SERVER1:file not found");
        System.out.println(server1.containsWord("disk"));

        LogMessage server2 = new LogMessage("SERVER2:read error on DISK DSK1");
        System.out.println(server2.containsWord("disk"));

        LogMessage serverA = new LogMessage("SERVER1:write error on disk DSK2");
        System.out.println(serverA.containsWord("disk"));

        webserver = new LogMessage("Webserver:error on /dev/disk");
        System.out.println(webserver.containsWord("disk"));

        ArrayList<LogMessage> list = new ArrayList<LogMessage>();
        list.add(webserver);
        list.add(server1);
        list.add(server2);
        list.add(serverA);
        SystemLog log = new SystemLog(list);
        log.removeMessages("disk");
    }
}
