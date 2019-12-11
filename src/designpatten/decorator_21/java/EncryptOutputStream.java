package designpatten.decorator_21.java;

import java.io.IOException;
import java.io.OutputStream;



//������
public class EncryptOutputStream extends OutputStream{

	private OutputStream os = null;
	
	public EncryptOutputStream(OutputStream os){
		this.os = os;
	}
	
	
	@Override
	public void write(int b) throws IOException {
		b = b+2;
		if(b>(95+29)){
			b = b - 26;
		}
		this.os.write(b);
	}

}
