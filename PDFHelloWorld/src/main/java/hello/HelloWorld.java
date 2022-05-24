package hello;
	
	import java.io.IOException;
	
	import org.apache.pdfbox.pdmodel.PDDocument;
	import org.apache.pdfbox.pdmodel.PDPage;

	import org.apache.pdfbox.pdmodel.PDPageContentStream;
	
	import org.apache.pdfbox.pdmodel.font.PDFont;
	import org.apache.pdfbox.pdmodel.font.PDType1Font;
	
	public final class HelloWorld
	{
	    private HelloWorld()
	    {
	    }
	    
	    public static void main(String[] args) throws IOException
	    {
	        if( args.length != 3 )
	        {
	            System.err.println("usage: " + HelloWorld.class.getName() + " <output-file> <Message>");
	            System.exit(1);
	        }
	
	        String filename = args[0];
	        String message = args[1];
	        String text = args[2];
	        
	        try (PDDocument doc = new PDDocument())
	        {
	            PDPage page = new PDPage();
	            doc.addPage(page);
	            
	            PDFont font = PDType1Font.COURIER;
	
	            try (PDPageContentStream contents = new PDPageContentStream(doc, page))
	            {
	                contents.beginText();
	                contents.setFont(font, 36);
	                contents.newLineAtOffset(100, 700);
	                contents.showText(message);
	                contents.endText();
	                contents.beginText();
	                contents.setFont(font, 12);
	                contents.newLineAtOffset(100, 660);
	                contents.showText(text);
	                contents.endText();
	            }
	            
	            doc.save(filename);
	        }
	    }
	}
	