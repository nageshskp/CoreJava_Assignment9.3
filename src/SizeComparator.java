import java.util.Comparator;

/**
 * 
 * Class to implement Comparator and to override the compare method to compare
 * the sizes of objects of HDTV
 *
 */
//Declaring the Class Size Comparator implements comparator interface
public class SizeComparator implements Comparator<Object> {

	//Method to compare the objects
	public int compare(Object arg0, Object arg1) {
		//Initializing the objects
		HDTV hd1 = (HDTV) arg0;
		HDTV hd2 = (HDTV) arg1;
		//check if both are equal or not
		if (hd1.size == hd2.size)
			return 0; // Return 0 
		//check object 1 greater than 2
		else if (hd1.size > hd2.size)
			//return 1
			return 1;
		else
			//Return -1
			return -1;
	}

}