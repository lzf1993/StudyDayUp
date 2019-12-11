package designpatten.memento_18.test4;


//����Ĳ����� -- ����Ľ�����
public class Operation implements OperationApi{

    //���
	private int result = 0;

	
	//��ȡ���
	@Override
	public int getResult() {
		return result;
	}

	
	//�ӷֲ���
	@Override
	public void add(int num) {
		this.result = result +num;		
	}

	
	//��������
	@Override
	public void substract(int num) {
		this.result = result - num;		
	}

	
	//��������¼����
	@Override
	public Memento createMemento() {
		return new MementoImpl(result);
	}

	
	//���ñ���¼���󣬽��и�ԭ
	@Override
	public void setMemento(Memento memento) {
		MementoImpl impl = (MementoImpl) (memento);
		this.result = impl.getResult();
	}



	//����¼����
	private static class MementoImpl implements Memento{

		//��¼ԭ������״̬ -- ���
		private int result = 0;

		public MementoImpl(int result){
			this.result = result;
		}

		public int getResult(){
			return this.result;
		}

	}












}
