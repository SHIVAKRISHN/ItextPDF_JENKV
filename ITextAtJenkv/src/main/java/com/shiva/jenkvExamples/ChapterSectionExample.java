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
public class ChapterSectionExample {

	  public static void main(String[] args) {

	    Document document = new Document();

	    try {
	      PdfWriter.getInstance(document,
	            new FileOutputStream("ChapterSection.pdf"));

	      document.open();

	      Paragraph paragraph = new Paragraph();
	      paragraph.add(new Phrase("This is a chapter."));

	      
	          Chapter chapter = new Chapter(paragraph, 3);

	          Section section1 = chapter.addSection("This is section 1", 2);
	          Section section2 = chapter.addSection("This is section 2", 2);

	          document.add(chapter);
	      

	      document.close();

	    } catch (DocumentException e) {
	      e.printStackTrace();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }

	  }
	}