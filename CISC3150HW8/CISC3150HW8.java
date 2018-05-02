// REDWAN AHMED
//CISC3150HW8 Tree


//references
//https://stackoverflow.com/questions/21973910/how-to-read-all-txt-files-in-a-given-directory-to-look-for-a-string-java
//https://stackoverflow.com/questions/11004731/output-of-tree-in-command-prompt
//https://stackoverflow.com/questions/10655085/print-directory-tree
//https://stackoverflow.com/questions/14676407/list-all-files-in-the-folder-and-also-sub-folders
// https://stackoverflow.com/questions/4871051/getting-the-current-working-directory-in-java
//https://docs.oracle.com/javase/tutorial/essential/io/

import java.util.*;
import java.io.*;

public class CISC3150HW8{

	public static void main(String[] args) throws IOException {
		
		FileWriter The_filewriter = new FileWriter(new File("./dir_tree.txt"));
		print_Directory("/Users/redwanahmed/whack-a-prof", The_filewriter, 1);
		
	}
	
	//This is a recursive function for getting every directories and printing them out in the tree format.
	public static void print_Directory(String s, FileWriter file_writer, int a) throws IOException{
		
		File Find_current = new File(s);
		File[] dirs = Find_current.listFiles();
		
		//This will print out the folders and the files in the current directory
		for(int i=0; i<dirs.length; i++){
			if(dirs[i].isDirectory()){
				
				for(int j=0; j<a-1; j++){
					file_writer.write("   ");
				}
				file_writer.write("└──"+dirs[i].getName()+ "\n");
				print_Directory(dirs[i].getPath(), file_writer, a+1);
				
				file_writer.flush();
			}
		}	
	}
	
}