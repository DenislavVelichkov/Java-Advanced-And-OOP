package JavaOOP.Inheritance_7.Exercise.OnlineRadioDatabase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        SongDataBase songDataBase = new SongDataBase();

        String[] tokens = sc.nextLine().split(";");

        while (n-- > 0) {
            try {
                Song song = new Song(tokens[0], tokens[1], tokens[2]);
                songDataBase.addSong(song);
            } catch (InvalidSongException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println("Songs added: " + songDataBase.getSongsCount());
        System.out.println("Playlist length: " + songDataBase.getTotalLengthOfSongs());
    }
}
