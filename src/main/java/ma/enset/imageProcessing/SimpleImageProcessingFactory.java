package ma.enset.imageProcessing;

import ma.enset.imageProcessing.compressor.ImageCompressor;
import ma.enset.imageProcessing.compressor.SimpleImageCompressorFactory;
import ma.enset.imageProcessing.filter.ImageFilter;
import ma.enset.imageProcessing.filter.SimpleImageFilterFactory;

public class SimpleImageProcessingFactory implements ImageProcessingFactory {

	public static ImageProcessing getInstance(String filter,String compressor) {
		ImageCompressor imageCompressor = new SimpleImageCompressorFactory().getInstance(compressor);
		ImageFilter imageFilter = new SimpleImageFilterFactory().getInstance(filter);
		return new ImageProcessing(imageFilter,imageCompressor);
	}

}