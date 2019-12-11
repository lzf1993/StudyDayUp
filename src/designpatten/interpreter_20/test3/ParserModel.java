package designpatten.interpreter_20.test3;


//������װÿ������������Ԫ�ض�Ӧ������
public class ParserModel {


	//�Ƿ񵥸�ֵ
	private boolean singleValue;

	
	//�Ƿ������ԣ��������Ծ���Ԫ��
	private boolean propertyValue;
	
	
	//�Ƿ����ս��
	private boolean end;


	public boolean isSingleValue() {
		return singleValue;
	}


	public void setSingleValue(boolean singleValue) {
		this.singleValue = singleValue;
	}


	public boolean isPropertyValue() {
		return propertyValue;
	}


	public void setPropertyValue(boolean propertyValue) {
		this.propertyValue = propertyValue;
	}


	public boolean isEnd() {
		return end;
	}


	public void setEnd(boolean end) {
		this.end = end;
	}
	
	
	
}
