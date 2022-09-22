package ru.sfu;

/**
 * VoiceRecording that implements AudioFile interface
 * @author Agapchenko V.V.
 */
public class VoiceRecord implements AudioFile {
    /** Recorded speech */
    private String speech;

    /**
     * VoiceRecord constructor, sets speech
     * @param speech Recorded speech
     */
    public VoiceRecord(String speech) {
        this.speech = speech;
    }

    /**
     * Method of AudioFile interface
     * @return Recorded speech of the VoiceRecord
     */
    public String getAudio() {
        return speech;
    }
}