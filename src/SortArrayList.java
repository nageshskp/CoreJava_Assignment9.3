import java.util.*;

/**
 * 
 * Example of Creating an ArrayList and adding three objects to it. Then to
 * display the objects in sorted order by size
 *
 */
public class SortArrayList {

	public static void main(String[] args) {

		// Instantiate Array list of HDTV class of size 3
		ArrayList<HDTV> HDTVArrayList = new ArrayList<HDTV>(3);

		// Declare an object of HDTV
		HDTV hdtv;

		// Instantiate three objects of HDTV
		HDTV hdtv1 = new HDTV("Samsung", 17);
		HDTV hdtv2 = new HDTV("SONY", 15);
		HDTV hdtv3 = new HDTV("Panasonic", 16);

		// Add the three objects of HDTV to ArrayList
		HDTVArrayList.add(hdtv1);
		HDTVArrayList.add(hdtv2);
		HDTVArrayList.add(hdtv3);

		// Sort the Array list objects in order of their size
		Collections.sort(HDTVArrayList, new SizeComparator());

		// Loop through the ArrayList to display the contents of the ArrayList
		System.out.println("Display contents in increasing order of size");
		for (int i = 0; i < HDTVArrayList.size(); i++) {
			hdtv = HDTVArrayList.get(i);
			System.out.println(hdtv.Brandname + " " + hdtv.size);
		}

	}

}