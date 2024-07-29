package ma.enset.imageProcessing.filter;

import java.util.Arrays;

public class ImageFiler1 implements ImageFilter {

	public int[] filter(int[] data) {
		System.out.println("ImageFiler1");
		return Arrays.stream(data)
				.map(val -> val + 1).toArray();
	}

}