import java.util.Scanner;

/**
 * Created by ss2sa on 11/8/2016.
 */
public class Paintings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Painting[] paintingsList = new Painting[10];
//        String[] famousArtists = {"Degas", "Monet", "Picasso", "Rembrandt"};
        for (int i = 0; i < 10; i++) {
            System.out.println("What is the title of the painting?");
            String userTitle = sc.nextLine();
            System.out.println("What is the name of the artist of the painting?");
            String userArtist = sc.nextLine();

            if (userArtist.equals("Monet") || userArtist.equals("Degas") || userArtist.equals("Picasso") || userArtist.equals("Rembrandt")) {
                paintingsList[i] = new FamousPainting(userTitle, userArtist);
            }
            else {
                paintingsList[i] = new Painting(userTitle, userArtist);
            }
//            boolean famous = false;

            /*for (int j = 0; j < famousArtists.length; j++) {
                if (userArtist.equals(famousArtists[j])) {
                    // paintingsList[i] = new FamousPainting(userTitle, userArtist);
                    famous = true;
                }
            }
            if (famous) {
                paintingsList[i] = new FamousPainting(userTitle, userArtist);
            }
            else {
                paintingsList[i] = new FamousPainting(userTitle, userArtist);
            }*/

            paintingsList[i].display();

        }
    }
}
