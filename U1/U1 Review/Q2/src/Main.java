import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<String> nouns = new ArrayList<>();
        ArrayList<String> verbs = new ArrayList<>();

        File nounFile = new File("src/nouns.txt");
        File verbFile = new File("src/verbs.txt");

        FileReader nounReader;
        FileReader verbReader;

        BufferedReader nounBuffer;
        BufferedReader verbBuffer;

        try {
            nounReader = new FileReader(nounFile);
            verbReader = new FileReader(verbFile);

            nounBuffer = new BufferedReader(nounReader);
            verbBuffer = new BufferedReader(verbReader);

            String noun = nounBuffer.readLine();
            String verb = verbBuffer.readLine();

            while (noun != null) {
                nouns.add(noun);
                noun = nounBuffer.readLine();
            }

            while (verb != null) {
                verbs.add(verb);
                verb = verbBuffer.readLine();
            }

            nounBuffer.close();
            verbBuffer.close();
            nounReader.close();
            verbReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file");
            System.err.println("IOException: " + e.getMessage());
        }

        String story = "It was about _ _ ago when I came to the hospital in a _. The hospital is a/an _ place, there are a lot of _ _. There are nurses here who have _ _. If someone wants to come into my room I told them that they have to _ first. I have decorated my room with _ _. Today a doctor came into my room and they were wearing a _ on their _. I heard that all doctors _ _ every day for breakfast. The most _ thing about being in the hospital is the _ _!";

        System.out.println("""
                It was about ________________ ________________ ago when I came to the hospital in a ________________.
                The hospital is a/an ________________ place, there are a lot of ________________ ________________here.
                There are nurses here who have ______________ ________________. If someone wants to come into my room
                I told them that they have to ________________ first. I have decorated my room with ________________
                ________________. Today a doctor came into my room and they were wearing a ________________ on their
                ________________. I heard that all doctors ________________ ________________ every day for breakfast. The
                most ________________ thing about being in the hospital is the ________________ ________________!""");

        for (int i = 0; i < story.length(); i++) {
            if (story.charAt(i) == '_') {
                switch (random.nextInt(2)) {
                    case 0 -> story = story.replaceFirst("_", nouns.get(random.nextInt(nouns.size())));
                    case 1 -> story = story.replaceFirst("_", verbs.get(random.nextInt(verbs.size())));
                }
            }
        }

        System.out.println(story);
    }

}