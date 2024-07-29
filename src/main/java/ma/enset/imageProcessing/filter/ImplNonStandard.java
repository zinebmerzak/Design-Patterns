package ma.enset.imageProcessing.filter;

import java.util.Arrays;

public class ImplNonStandard {


	public int[] applyFilter(String filterName, int[] data) {
		System.out.println("ImplNonStandard");
		return Arrays.stream(data)
				.map(val -> val + 2).toArray();
	}

}