package ru.sfu;

/**
 * Song that implements AudioFile interface
 * @author Agapchenko V.V.
 */
public class Song implements AudioFile {
    /** Song sound track */
    private String melody;
    /** Lyrics of the song */
    private String lyrics;

    /**
     * Song constructor, sets melody and lyrics
     * @param melody Song sound track
     * @param lyrics Lyrics of the song
     */
    public Song(String melody, String lyrics) {
        this.melody = melody;
        this.lyrics = lyrics;
    }

    /**
     * Method of AudioFile interface
     * @return Melody and lyrics of the Song
     */
    public String getAudio() {
        return String.format("%s %s %s", melody, lyrics, melody);
    }
}