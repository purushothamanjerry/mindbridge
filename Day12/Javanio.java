package Day12;


import java.nio.CharBuffer;

import org.w3c.dom.Text;
public class Javanio {
	
	
	public static void main(String[] args) {
		
		CharBuffer buffer=CharBuffer.allocate(30);
		String t="My name is Purushothaman";
		for(int i=0;i<t.length();i++) {
			char c=t.charAt(i);
			buffer.put(c);
		}

		CharBuffer b=CharBuffer.allocate(30);
		
		buffer.flip();
		while (buffer.hasRemaining())
        {
            b.put(buffer.get());
        }
		 b.flip();
		System.out.println("Text: "+t);
        System.out.println("Text Inside Second buffer  : "+b.toString());
		
	}

}
