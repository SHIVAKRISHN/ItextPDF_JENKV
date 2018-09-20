package com.shiva.jenkvExamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.GreekList;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.RomanList;
import com.itextpdf.text.pdf.PdfWriter;

public class ListRomanAndGreek {
	
	  public static void main(String[] args) {

	        Document document = new Document();

	        try {
	            PdfWriter.getInstance(document,
	                new FileOutputStream("ListRomanAndGreek.pdf"));

	            document.open();

	            RomanList romanList = new RomanList();
	            romanList.add(new ListItem("Item 1"));
	            romanList.add(new ListItem("Item 2"));
	            romanList.add(new ListItem("Item 3"));

	            document.add(romanList);

	            GreekList greekList = new GreekList();
	            greekList.add(new ListItem("Item 1"));
	            greekList.add(new ListItem("Item 2"));
	            greekList.add(new ListItem("Item 3"));
	            greekList.add(new ListItem("Item 4"));
	            greekList.add(new ListItem("Item 5"));
	            greekList.add(new ListItem("Item 6"));

	            document.add(greekList);

	            document.close();

	        } catch (DocumentException e) {
	            e.printStackTrace();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	    }

}
