package designpatten.chainOfReson_22.example;


//����۲ͷ�������Ķ���
public class FeeRequest {

	
	
	/**
	 * �ύ�۲��������Ŀ����
	 * @param user
	 * @param fee
	 * @return
	 */
	public String requestToProjectManger(String user,double fee){
		String str = "";	
		if(fee<500){
			//��Ŀ�����Ȩ�ޱȽ�С��ֻ��500����
			str = this.projectHandle(user,fee);
		}else if(fee < 1000){
			//���ž����Ȩ�ޱȽ�С��ֻ��1000����
			str = this.depMangerHandle(user,fee);
		}else if(fee >=1000){
			//�ܾ���Ȩ�޴�ֻҪ�����ˣ������Դ���
			str = this.generalMangerHandle(user,fee);
		}
		return str;		
	}
	

	
	/**
	 * �ܾ�����������
	 * @param user
	 * @param fee
	 * @return
	 */
	private String generalMangerHandle(String user, double fee) {
		String str = "";
		//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
		if("С��".equals(user)){
			str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}else{
			str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}
		return str;
	}

	
	

	/**
	 * ���ž�����������
	 * @param user
	 * @param fee
	 * @return
	 */
	private String depMangerHandle(String user, double fee) {
		String str = "";
		//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
		if("С��".equals(user)){
			str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}else{
			str = "���ž���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}
		return str;
	}


	
	

	/**
	 * ��Ŀ����������������
	 * @param user
	 * @param fee
	 * @return
	 */
	private String projectHandle(String user, double fee) {
		String str = "";
		//Ϊ�˲��Լ򵥵㣬ֻҪ��С��Ͷ�ͬ��
		if("С��".equals(user)){
			str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}else{
			str = "��Ŀ����ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
		}
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	
}
