package designpatten.interpreter_20.test3;

import designpatten.interpreter_20.test3.Context;

//�����ӿ�
public interface ReadXmlExpression {

	

	/**
	 * �������ʽ �� ����Ԫ�ص����ݻ������Ե�ֵ
	 * @param ctx ������
	 * @return �������ֵ��Ϊ��ͨ�ã������ǵ���ֵ��Ҳ�����Ƕ��ֵ����˷��ص���һ������
	 */
	public abstract String[] interpret(Context ctx);
	
	
}
