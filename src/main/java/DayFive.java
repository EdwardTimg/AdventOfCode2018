import javax.sound.midi.SysexMessage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class DayFive {

    public static void main(String[] args) {
        try {
            DayFive dayFive = new DayFive();
            BufferedReader reader = new BufferedReader(new FileReader("inputdayfive.txt"));
            String line = reader.readLine();
            System.out.println(dayFive.removePolymer(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int removePolymer(String input) {
        StringBuilder builder = new StringBuilder(input);
        int i = 0;
        while(i < builder.length()-1) {
            if (Character.toLowerCase(builder.charAt(i)) == Character.toLowerCase(builder.charAt(i + 1))) {
                if (Character.isUpperCase(builder.charAt(i)) && Character.isLowerCase(builder.charAt(i + 1)) || Character.isLowerCase(builder.charAt(i)) && Character.isUpperCase(builder.charAt(i + 1))) {
                    builder.delete(i, i + 2);
                    i = i - 1;
                    if (i < 0) {
                        i = 0;
                    }
                } else
                    i++;
            } else
                i++;

        }
        return builder.length();
    }
}
