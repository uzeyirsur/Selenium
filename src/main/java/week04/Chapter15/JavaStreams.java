package week04.Chapter15;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Test
public class JavaStreams {
    public void regular(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Michelle");
       int count = 0;
        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i);
            if(actual.startsWith("M")){
                count++;
            }
        }
        System.out.println(count);
    }
@Test
    public void streamFilter(){
    ArrayList<String> names = new ArrayList<>();
    names.add("Ahmet");
    names.add("Mehmet");
    names.add("Michelle");

    Long count = names.stream().filter(s ->s.startsWith("M")).count();
    System.out.println(count);

}
}

