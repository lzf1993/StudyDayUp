package designpatten.command_12.test2.impl;

import designpatten.command_12.test2.OperationApi;

//����ļ������
public class Operation implements OperationApi{
	
	//����Ľ��
	private int result;
	
	@Override
	public int getResult(){
		return this.result;
	}
	
	@Override
	public void setResult(int result){
		this.result = result;
	}
	
	
	
	//�ӷ�
	@Override
	public void add(int num){
		result += num;
	}
	
	
	//����
	@Override
	public void substract(int num){
		result -= num;
	}
	
	
}
