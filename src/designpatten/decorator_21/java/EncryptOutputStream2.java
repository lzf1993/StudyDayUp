package designpatten.decorator_21.java;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;


//����� �� װ����ͳһ�̳�װ��������ĸ���
public class EncryptOutputStream2 extends FilterOutputStream{
	
	private OutputStream os = null;
	
	public EncryptOutputStream2(OutputStream os){
		super(os);
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
