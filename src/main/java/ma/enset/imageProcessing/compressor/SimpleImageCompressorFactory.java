package ma.enset.imageProcessing.compressor;

public class SimpleImageCompressorFactory implements ImageCompressorFactory {

	public ImageCompressor getInstance(String className) {
		try{
			Class<?> imageCompressorClass = Class.forName("ma.enset.imageProcessing.compressor."+className);
			return(ImageCompressor) imageCompressorClass.getConstructor().newInstance();
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

}