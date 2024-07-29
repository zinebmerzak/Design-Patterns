package ma.enset.imageProcessing.compressor;

public class ImageComressorRar implements ImageCompressor {

	public int[] compress(int[] data) {
		System.out.println("ImageComressorRar");
		int[] compressedData = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			compressedData[i] = data[i]-2;
		}
		return compressedData;
	}

}