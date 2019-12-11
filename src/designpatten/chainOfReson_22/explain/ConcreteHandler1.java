package designpatten.chainOfReson_22.explain;


//ʵ��ְ�����
public class ConcreteHandler1 extends Handler{

	@Override
	public void handleRequest() {

		
		//����ĳЩ�������ж��Ƿ������Լ������ְ��Χ
		boolean someCondition = false;
		if(someCondition){
			//��������Լ���ְ��Χ���������ﴦ������
            System.out.println("ConcreteHandler handleRequest");			
		}else{
			//����������Լ��Ĵ���Χ�����ж��Ƿ��к�̵�ְ���������У���ת��������
			if(this.successor!=null){
				this.successor.handleRequest();
			}
		}
		
		
	}

}
