import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayThree {
    private static final Pattern CLAIM = Pattern.compile("#(.*) @ ([0-9]+),([0-9]+): ([0-9]+)x([0-9]+)");

    public static void main(String[] args) {
        DayThree dayThree = new DayThree();
        try{
            List<String> list = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("inputdaythree.txt"));
            String line;
            while ((line = reader.readLine())!=null){
                list.add(line);
            }
            //Part one
            System.out.println(dayThree.numberOfOverlaps(list));

        }catch (IOException e){
            e.printStackTrace();
        }



    }

    public int numberOfOverlaps(List<String> list) {
        int occurence = 0;
        int [][] area = new int[1000][1000];
        for (String line: list){
            Matcher matcher = CLAIM.matcher(line);
            matcher.find();
            int x1 = Integer.parseInt(matcher.group(2));
            int y1 = Integer.parseInt(matcher.group(3));
            int x2 = Integer.parseInt(matcher.group(4));
            int y2 = Integer.parseInt(matcher.group(5));
            for (int x = x1; x < x1+x2; x++) {
                for (int y = y1; y <y1 +y2 ; y++) {
                    area[x][y] ++;
                    if(area[x][y] == 2){
                        occurence ++;
                    }
                }
            }
        }

        return occurence;
    }
}