import java.util.Random;

public class PoetryMain {

    public class WritePoetry{
        HashTable<String, WordFreqInfo> hashTable;

        private String pickNextWord(String myWord){
            WordFreqInfo wordFreqInfo = hashTable.find(myWord);
            if(wordFreqInfo == null) return null;
            int random = (int) (Math.random() * wordFreqInfo.occurCt) + 1; // gets the random index start at 1
            while(true){
                
            }
        }

    }







    public static void main(String[] args) {

//        WritePoetry poem = new WritePoetry();
//        System.out.println(poem.WritePoem("green.txt", "sam", 20, true));
//        System.out.println(poem.WritePoem("Lester.txt", "lester", 30, true));
//        System.out.println(poem.WritePoem("HowMany.txt", "how", 30, false));
//        System.out.println(poem.WritePoem("Zebra.txt", "are", 50, true));
    }

}