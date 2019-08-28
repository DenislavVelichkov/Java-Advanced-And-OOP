package JavaOOP.Inheritance_7.Exercise.OnlineRadioDatabase_5;

public class Song {
    private String artistName;
    private String songName;
    private String length;

    public Song(String artistName, String songName, String length) throws InvalidSongException {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setLength(length);
    }

    private void setArtistName(String artistName) throws InvalidSongException {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new InvalidSongException("Artist name should be between 3 and 20 symbols.");
        }

        this.artistName = artistName;
    }

    private void setSongName(String songName) throws InvalidSongException {
        if (artistName.length() < 3 || artistName.length() > 30) {
            throw new InvalidSongException("Song name should be between 3 and 30 symbols.");
        }

        this.songName = songName;
    }

    private void setLength(String length) throws InvalidSongLengthException {
        String[] tokens = length.split(":");

        int minutes = Integer.parseInt(tokens[0]) * 60;
        int seconds = Integer.parseInt(tokens[1]);
        int time = minutes + seconds;

        if (minutes < 0 || minutes > 840) {
            throw new InvalidSongLengthException("Song minutes should be between 0 and 14.");
        } else if (seconds < 0 || seconds > 59) {
            throw new InvalidSongLengthException("Song seconds should be between 0 and 59.");
        } else if (time > 899){
            throw new InvalidSongLengthException("Invalid song length.");
        }

        this.length = length;
    }

    public String getLength() {
        return this.length;
    }
}
