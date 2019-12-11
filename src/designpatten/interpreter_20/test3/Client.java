package designpatten.interpreter_20.test3;


import designpatten.interpreter_20.test3.ReadXmlExpression;

public class Client {


	public static void main(String args[]){
		//׼��������
		Context c = new Context("InterpreterTest.xml");

		//ͨ����������ȡ�����﷨��
		ReadXmlExpression re = Parser.praise("root/a/b/d$.id$");
		//�����������ȡ����ֵ
		String ss[] = re.interpret(c);

		for(String s:ss){
			System.out.println("d������ idֵ�ǣ�"+s);
		}

		//���³�ʼ��
		c.reInit();

		//ͨ����������ȡ�����﷨��
		ReadXmlExpression re2 = Parser.praise("root/a/b/d$.id$");
		//�����������ȡ����ֵ
		String ss2[] = re2.interpret(c);
		for(String s:ss2){
			System.out.println("d��ֵ��="+s);
		}
	}
}
