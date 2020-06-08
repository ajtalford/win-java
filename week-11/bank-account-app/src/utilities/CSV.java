package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

	// This function will read form a CSV file and return as a list
	@SuppressWarnings("resource")
	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		String dataRowString;
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(file));
			while ((dataRowString = bReader.readLine()) != null) {
				String[] dataRecords = dataRowString.split(",");
				data.add(dataRecords);
			}
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("COULD NOT FIND FILE ");
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("COULD NOT FIND FILE ");
			e.printStackTrace();
		}
		return data;
	}
}
