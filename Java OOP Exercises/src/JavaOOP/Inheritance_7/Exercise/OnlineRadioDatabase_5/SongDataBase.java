package JavaOOP.Inheritance_7.Exercise.OnlineRadioDatabase_5;

import java.util.ArrayList;
import java.util.List;

public class SongDataBase {
    private List<Song> songsList;

    public SongDataBase() {
        this.songsList = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songsList.add(song);
    }

    public String getTotalLengthOfSongs() {
        int time = 0;

        for (Song song : this.songsList) {
            String[] tokens = song.getLength().split(":");
            int currentmMinutes = Integer.parseInt(tokens[0]) * 60;
            int currentmSeconds = Integer.parseInt(tokens[1]);
            time += currentmMinutes + currentmSeconds;


        }

        int hours = (time / 3600) % 24;
        int minutes = time % 3600 / 60;
        int seconds = time % 60;

        return String.format(
                "Playlist length: %dh %dm %ds",
                hours,
                minutes,
                seconds
        );

    }

    public int getSongsCount() {
        return this.songsList.size();
    }
}
