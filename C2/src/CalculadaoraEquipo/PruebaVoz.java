package CalculadaoraEquipo;
import com.sun.speech.freetts.*;

public class PruebaVoz {
    public static void main(String[] args) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

        Voice voice = VoiceManager.getInstance().getVoice("kevin16");        
        if (voice != null) {
            voice.allocate();
            voice.setRate(120);  // Ajustar velocidad
            voice.setPitch(100); // Ajustar tono
            voice.speak("One, two, three, four, five, six, seven, eight, nine, ten");
            voice.deallocate();
        } else {
            System.out.println("Error: No se pudo cargar la voz.");
        }
    }
}
