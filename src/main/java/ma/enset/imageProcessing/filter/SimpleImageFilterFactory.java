package ma.enset.imageProcessing.filter;

public class SimpleImageFilterFactory implements ImgeFilterFactory {


	public ImageFilter getInstance(String className) {
		try{
			Class<?> imageCompressorClass = Class.forName("ma.enset.imageProcessing.filter."+className);
			return(ImageFilter) imageCompressorClass.getConstructor().newInstance();
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

}