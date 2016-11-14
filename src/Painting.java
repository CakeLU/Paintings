/**
 * Created by ss2sa on 11/8/2016.
 */
public class Painting {

    // Attributes
    protected String title;
    protected String artist;
    protected double value;

    // Default Constructor
    public Painting(String userTitle, String userArtist) {
        title = userTitle;
        artist = userArtist;
        value = 400.0;
    }

    // Function displays painting information
    public void display() {
        System.out.println(title);
        System.out.println(artist);
        System.out.println(value);
    }
}
