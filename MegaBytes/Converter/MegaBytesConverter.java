package MegaBytes.Converter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long megaBytes = kiloBytes / 1024;
        long kiloBytesOutput = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesOutput + " KB");
    }
}
