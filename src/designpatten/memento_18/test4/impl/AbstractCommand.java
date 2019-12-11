package designpatten.memento_18.test4.impl;

import designpatten.memento_18.test4.Command;
import designpatten.memento_18.test4.Memento;
import designpatten.memento_18.test4.OperationApi;


//����ӿڳ�����
public abstract class AbstractCommand implements Command{

	//���н�����
	protected OperationApi operationApi = null;
	
	
	//���ý�����
	public void setOperation(OperationApi operationApi){
		this.operationApi = operationApi;
	}
	
	
	//ִ�о��幦��ʵ��
	public abstract void execute();
	
	
	//����
	@Override
	public void redo(Memento m) {
		this.operationApi.setMemento(m);
	}
	
	
	//����
	@Override
	public void undo(Memento m) {
		this.operationApi.setMemento(m);
	}
	
	
	//��������¼����
	@Override
	public Memento createMemento() {
		return this.operationApi.createMemento();
	}
	
}
