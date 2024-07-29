package ma.enset.imageProcessing.compressor;

public interface ImageCompressorFactory {

	ImageCompressor getInstance(String algo);

}