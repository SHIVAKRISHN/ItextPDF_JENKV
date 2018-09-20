package com.shiva.jenkvExamples;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ListExample {

    public static void main(String[] args) {

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                new FileOutputStream("List.pdf"));

            document.open();

            List orderedList = new List(List.ORDERED);
            orderedList.add(new ListItem("Item 1"));
            orderedList.add(new ListItem("Item 2"));
            orderedList.add(new ListItem("Item 3"));

            document.add(orderedList);

            List unorderedList = new List(List.UNORDERED);
            unorderedList.add(new ListItem("Item 1"));
            unorderedList.add(new ListItem("Item 2"));
            unorderedList.add(new ListItem("Item 3"));

            document.add(unorderedList);


            document.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
