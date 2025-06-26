package java11;


import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//Java Flight Recorder class
public class Java11 {
    public static void main(String a[]) throws IOException {
        String name = "";
        String multiline  ="Neeraj\nkumar sonu";
        String repate = "Neeraj";

        String removeWhiteSpaceFromFront = " Neeraj";
        String removeWhiteSpaceFromEnd  ="Neeraj ";

        String removeWhiteSpaceFromEndAndStart = " GeeksForGeeks ";

        // isBlank() method
        System.out.println(name.isBlank());

        // lines()
        System.out.println(multiline.lines().collect(Collectors.toList()));

        // repeat()
        System.out.println(repate.repeat(4));

        //stripLeading
        System.out.println(removeWhiteSpaceFromFront.stripLeading());

        // stripTrailing
        System.out.println(removeWhiteSpaceFromEnd.stripTrailing());

        // strip()
        System.out.println();


        // removeWhiteSpaceFromEndAndStart()
        System.out.println(removeWhiteSpaceFromEndAndStart);


        // file handling methods
        Files.writeString(Path.of("example.txt"), "GeeksForGeeks!");


        TimeUnit seconds = TimeUnit.SECONDS;
        System.out.println(seconds);


        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        System.out.println(memoryMXBean.getHeapMemoryUsage());
        System.out.println("Non-Heap Memory Usage: " + memoryMXBean.getNonHeapMemoryUsage());

        // Thread usage
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        System.out.println("Live Threads: " + threadBean.getThreadCount());
        System.out.println("Peak Threads: " + threadBean.getPeakThreadCount());
        System.out.println("Total Started Threads: " + threadBean.getTotalStartedThreadCount());
    }
}
