import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Little Star", "Twinkle, twinkle, little star");
        trackList.put("Mary", "Mary had a little lamb");
        trackList.put("Mountain", "She'll be comin around the mountain");
        trackList.put("Saints", "Oh when the saints, go marching in");

        String track = trackList.get("Mountain");
        System.out.println(track);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}