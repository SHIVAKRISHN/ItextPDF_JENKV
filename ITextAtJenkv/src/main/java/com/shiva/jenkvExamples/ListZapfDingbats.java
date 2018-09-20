package com.shiva.jenkvExamples;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ListZapfDingbats {
	public static void main(String[] args) {

	    Document document = new Document();

	    try {
	      PdfWriter.getInstance(document,
	            new FileOutputStream("ListZapfDingbats.pdf"));

	      document.open();

	      ZapfDingbatsList zapfDingbatsList1 =
	            new ZapfDingbatsList(40, 15);
	      zapfDingbatsList1.add(new ListItem("Item 1"));
	      zapfDingbatsList1.add(new ListItem("Item 2"));
	      zapfDingbatsList1.add(new ListItem("Item 3"));

	      document.add(zapfDingbatsList1);

	      ZapfDingbatsList zapfDingbatsList2 =
	            new ZapfDingbatsList(43, 30);
	      zapfDingbatsList2.add(new ListItem("Item 1"));
	      zapfDingbatsList2.add(new ListItem("Item 2"));
	      zapfDingbatsList2.add(new ListItem("Item 3"));

	      document.add(zapfDingbatsList2);

	      ZapfDingbatsList zapfDingbatsList3 =
	            new ZapfDingbatsList(47, 45);
	      zapfDingbatsList3.add(new ListItem("Item 1"));
	      zapfDingbatsList3.add(new ListItem("Item 2"));
	      zapfDingbatsList3.add(new ListItem("Item 3"));

	      document.add(zapfDingbatsList3);

	      document.close();

	    } catch (DocumentException e) {
	      e.printStackTrace();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }

	  }
}
