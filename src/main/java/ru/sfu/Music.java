package ru.sfu;

/**
 * Music that implements AudioFile interface
 * @author Agapchenko V.V.
 */
public class Music implements AudioFile {
    /** Music sound track */
    private String melody;

    /**
     * Music constructor
     * @param melody Music sound track
     */
    public Music(String melody) {
        this.melody = melody;
    }

    /**
     * Method of AudioFile interface
     * @return Melody of the Music
     */
    public String getAudio() {
        return String.format("%s %s %s", melody, melody, melody);
    }
}