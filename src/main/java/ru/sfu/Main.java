package ru.sfu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class of the program
 * @author Agapchenko V.V.
 */
public class Main {
    /**
     * Enter point to the program
     * @param args Optional arguments
     */
    public static void main(String[] args) {
        // Getting context from configuration xml file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // Getting audio player Bean from context
        AudioPlayer audioPlayer = context.getBean(
                "audioPlayerBean",
                AudioPlayer.class);
        // Calling method of Bean object
        audioPlayer.playAudio();
        // Closing context
        context.close();

    }
}

