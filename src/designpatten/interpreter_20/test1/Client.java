package designpatten.interpreter_20.test1;

import designpatten.interpreter_20.test1.impl.ElementExpression;
import designpatten.interpreter_20.test1.impl.ElementTerminalExpression;
import designpatten.interpreter_20.test1.impl.PropertyTerminalExpression;

public class Client {

	
	public static void main(String agrs[]){
		test1();
		System.out.println("----------------");
		test2();
	}
	
	
	private static void test1(){
		//׼��������
		Context c = new Context("InterpreterTest.xml");
		
		//��Ҫ��ȡcԪ�ص�ֵ��Ҳ�������±��ʽ��"root/a/b/c"
		//����Ҫ�����������ĳ����﷨��
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementTerminalExpression cEle = new ElementTerminalExpression("c");
	
		//�������
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(cEle);
		
		//����
		String ss[] = root.interpret(c);
		System.out.println("cԪ�ص�ֵ == " +ss[0]);		
	}
	
	
	
	private static void test2(){
		//׼��������
		Context c = new Context("InterpreterTest.xml");
		
		//��Ҫ��ȡcԪ�ص�ֵ��Ҳ�������±��ʽ��"root/a/b/c.name"
		//����Ҫ�����������ĳ����﷨��
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementExpression cEle = new ElementExpression("c");
		PropertyTerminalExpression prop1 = new PropertyTerminalExpression("name");
	
		//�������
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(cEle);
		cEle.addEle(prop1);
		
		//����
		String ss[] = root.interpret(c);
		System.out.println("c.name���Ե�ֵ == " +ss[0]);		
	}
	
}
