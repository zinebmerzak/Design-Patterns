package ma.enset.imageProcessing.filter;

import java.util.Arrays;

public class ImageFilter2 implements ImageFilter {


	public int[] filter(int[] data) {
		System.out.println("ImageFilter2");
		return Arrays.stream(data)
				.map(val -> val + 2).toArray();
	}

}