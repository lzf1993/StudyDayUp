package designpatten.state_17.test3;


//��ǰ�û�ͶƱ״̬
public enum State {
	NORMAL("NORMAL"),          //����״̬ 
	REPEAT("REPEAT"),          //�ظ��ύ״̬  2-3
	SPITE("SPITE"),            //����ͶƱ         4 - 8
	BLANKWARN("BLANKWARN"),    //����״̬  -- ��ֹ3���¼ 9 -10
	BLANK("BLANK");            //����״̬     10<


	//����
	private String name;

	private State(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
