package ma.enset;

import ma.enset.imageProcessing.ImageProcessing;
import ma.enset.imageProcessing.SimpleImageProcessingFactory;
import ma.enset.imageProcessing.compressor.ImageCompressor;
import ma.enset.imageProcessing.filter.ImageFilter;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisir la classe d'implémentation pour l'opération de filtrage : ");
        String filterClassName = scanner.next();

        System.out.print("Saisir la classe d'implémentation pour l'opération de compression : ");
        String compressorClassName = scanner.next();
        System.out.println("selected filter: "+filterClassName);
        System.out.println("selected compressor: "+compressorClassName);

        ImageProcessing imageProcessing = SimpleImageProcessingFactory.getInstance(filterClassName,compressorClassName);
        ImageFilter imageFilter = imageProcessing.getImageFilter();
        ImageCompressor imageCompressor = imageProcessing.getImageCompressor();

        int[] imageData = {0, 1, 0, 1, 2, 0, 1, 5, 1, 0, 5, 8, 9, 5, 4, 8, 5, 4, 0, 1};

        int[] filteredData = imageFilter.filter(imageData);
        int[] compressedData = imageCompressor.compress(filteredData);

        System.out.println("Résultat du filtrage : " + arrayToString(filteredData));
        System.out.println("Résultat de la compression : " + arrayToString(compressedData));

    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
