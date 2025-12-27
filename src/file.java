import java.io.FileNotFoundException;
import java.util.ArrayList;

public class file {
    public static void main(String[] args) throws FileNotFoundException {

        String s ="192.168.2.20 - - [28/Jul/2006:10:27:10 -0300] \"GET /cgi-bin/try/ HTTP/1.0\" 200 3395\n" +
                "127.0.0.1 - - [28/Jul/2006:10:22:04 -0300] \"GET / HTTP/1.0\" 200 2216";
        String[] split = s.split("--");
        ArrayList requests = new ArrayList<>();
        for(int i=0;i<split.length;i++){
            requests.add(split[i]);
        }
        System.out.println("Number of requests "+ requests.size());

        String[] splited = s.split("a-z");
        ArrayList methodsList = new ArrayList();
        for(int i=0;i<splited.length;i++){
            methodsList.add(splited[i]);
            System.out.println("Reuest type "+ requests.get(i));
        }

    }
}
