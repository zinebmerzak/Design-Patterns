package ma.enset.imageProcessing.filter;

import ma.enset.imageProcessing.filter.ImageFilter;

public interface ImgeFilterFactory {


	ImageFilter getInstance(String algo);

}