import java.util.ArrayList;
import java.util.List;
public class MexicanWave {
    public static String[] wave(String str) {
        List<String> waveList = new ArrayList<>();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isWhitespace(currentChar)) {
                continue; // Langsung lanjut jika karakter adalah spasi
            }
            StringBuilder wave = new StringBuilder(str);
            wave.setCharAt(i, Character.toUpperCase(currentChar));
            waveList.add(wave.toString());
        }
        
        return waveList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String input = "hello";
        String[] result = wave(input);
        
        System.out.println("Input string: " + input);
        System.out.println("Mexican Wave:");
        for (String wave : result) {
            System.out.println(wave);
        }
    }
}