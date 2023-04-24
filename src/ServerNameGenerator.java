import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adj = {"Charming","Cruel","Fantastic","Gentle","Huge","Perfect","Rough","Sharp"};
        String[] noun = {"time","person","year","way","day","thing","man","world"};

        String randomAdj = getRandomString(adj);
        String randomNoun = getRandomString(noun);

        String randomName = randomAdj + " " + randomNoun;
        System.out.println("Here is your server name:" + randomName);
    }

    public static String getRandomString(String[] array) {
        int index = new Random().nextInt(array.length);
        return array[index];
    }
}
