package Day6;

import java.io.File;

public final class List {

	public static void main(String[] args) {

		//Creating a File object for directory
	    File directoryPath = new File("C:\\Users\\ganbhavi\\Desktop\\aaa");
	    //List of all files and directories
	    String contents[] = directoryPath.list();
	    System.out.println("List of files :");
	    for(int i=0; i<contents.length; i++) {
	       System.out.println(contents[i]);

	}

}
}
