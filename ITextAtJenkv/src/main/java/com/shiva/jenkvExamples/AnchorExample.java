/**
 * 
 */
package com.shiva.jenkvExamples;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author shiva
 *
 */
public class AnchorExample {

	
	 public static void main(String[] args) {

		    Document document = new Document();

		    try {
		      PdfWriter.getInstance(document,
		            new FileOutputStream("Anchor.pdf"));

		      document.open();

		      Paragraph paragraph = new Paragraph();
		      paragraph.add(new Phrase("You can find the IText tutorial at "));

		      
		          Anchor anchor = new Anchor(
		          "http://tutorials.jenkov.com/java-itext/index.html"); // actual text displayed  in document
		          anchor.setReference(
		          "http://tutorials.jenkov.com/java-itext/index.html");// displayed the text when we move the mouse over the text
		      
		      paragraph.add(anchor);

		      document.add(paragraph);

		      document.close();

		    } catch (DocumentException e) {
		      e.printStackTrace();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    }

		  }
	
}
