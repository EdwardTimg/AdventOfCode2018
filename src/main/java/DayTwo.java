import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayTwo {
    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        List<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("inputdaytwo.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            System.out.println(dayTwo.checkSumBoxes(list));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public int checkSumBoxes(List<String> list) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int counttwice = 0;
        int countthree = 0;
        for (int i = 0; i <list.size() ; i++) {
            Boolean occuredthree = false;
            boolean occuredtwice = false;
            for (int j = 0; j <alphabet.length ; j++) {
                int occurence = list.get(i).length() - list.get(i).replaceAll(String.valueOf(alphabet[j]), "").length();
                if(occurence == 3 && !occuredthree ){
                    occuredthree = true;
                    countthree ++;
                }else if(occurence == 2 && !occuredtwice){
                    occuredtwice = true;
                    counttwice ++;
                }
            }
        }
        return countthree * counttwice;
    }
}
