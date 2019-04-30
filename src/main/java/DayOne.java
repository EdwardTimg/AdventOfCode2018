import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayOne {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        DayOne dayOne = new DayOne();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("inputdayone.txt"));
            String line;
            while((line =reader.readLine())!=null){
                list.add(Integer.parseInt(line));
            }
            //Part one
            System.out.println(dayOne.finalFrequency(list));

            //part two
            System.out.println(dayOne.frecquencyThatOccursTwice(list));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public int finalFrequency(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i <list.size() ; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public int frecquencyThatOccursTwice(List<Integer> list) {
        int sum = 0;
        List<Integer> frequency = new ArrayList<>();
        Boolean occuredtwice = false;
        while (!occuredtwice) {
            int i = 0;
            while(i < list.size() && !occuredtwice) {
                sum += list.get(i);
                if (frequency.contains(sum)) {
                    occuredtwice = true;
                    return sum;
                }
                frequency.add(sum);
                i++;
            }
        }
        return sum;
    }
}
