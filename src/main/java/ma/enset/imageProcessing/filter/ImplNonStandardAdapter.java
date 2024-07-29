package ma.enset.imageProcessing.filter;

import ma.enset.imageProcessing.filter.ImageFilter;

import java.util.Arrays;

public class ImplNonStandardAdapter implements ImageFilter {

	private final ImplNonStandard implNonStandard;

	public ImplNonStandardAdapter(){
		implNonStandard=new ImplNonStandard();
	}


	public int[] filter(int[] data) {
		System.out.println("ImplNonStandardAdapter");
		return implNonStandard.applyFilter("",data);
	}

}