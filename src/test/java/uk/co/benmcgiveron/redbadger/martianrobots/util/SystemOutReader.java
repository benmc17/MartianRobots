package uk.co.benmcgiveron.redbadger.martianrobots.util;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutReader {

	private ByteArrayOutputStream out;
	
	private PrintStream printStream;
	
	public SystemOutReader() {
		out = new ByteArrayOutputStream();
		
		printStream = new PrintStream(new BufferedOutputStream(out));
		System.setOut(printStream);
	}
	
	public String getOutput() {
		printStream.flush();
		String output = new String(out.toByteArray());
		out.reset();
		return output;
	}
	
	public void close() {
		if(printStream != null) {
			printStream.close();
		}
	}
}
