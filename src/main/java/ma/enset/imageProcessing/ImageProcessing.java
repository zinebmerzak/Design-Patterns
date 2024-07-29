package ma.enset.imageProcessing;

import ma.enset.imageProcessing.compressor.ImageCompressor;
import ma.enset.imageProcessing.filter.ImageFilter;

public class ImageProcessing {

	private ImageFilter imageFilter;
	private ImageCompressor imageCompressor;

	public ImageProcessing(ImageFilter imageFilter, ImageCompressor imageCompressor) {
		this.imageCompressor=imageCompressor;
		this.imageFilter=imageFilter;
	}

	public ImageFilter getImageFilter() {
		return this.imageFilter;
	}

	public void setImageFilter(ImageFilter imageFilter) {
		this.imageFilter = imageFilter;
	}

	public ImageCompressor getImageCompressor() {
		return this.imageCompressor;
	}

	public void setImageCompressor(ImageCompressor imageCompressor) {
		this.imageCompressor = imageCompressor;
	}

}