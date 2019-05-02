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
            //Part one
            System.out.println(dayTwo.checkSumBoxes(list));
            //Part two
            System.out.println(dayTwo.findSimulareString(list));
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

    public String findSimulareString(List<String> list) {
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <list.size() ; j++) {
                String result = "";
                StringBuilder builder = new StringBuilder();
                for (int k = 0; k <list.get(i).length(); k++) {
                    if(list.get(i).charAt(k)== list.get(j).charAt(k)){
                        builder.append(list.get(i).charAt(k));
                    }
                }
                if(list.get(i).length()== builder.length() +1){
                    return builder.toString();
                }
            }
        }
        return null;
    }
}
