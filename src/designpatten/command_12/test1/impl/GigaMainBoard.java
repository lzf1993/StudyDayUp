package designpatten.command_12.test1.impl;

import designpatten.command_12.test1.MainBoardApi;

//��������ʵ����
public class GigaMainBoard implements MainBoardApi{
	
    //�����Ŀ���ʵ��
	@Override
	public void open() {
		System.out.println("�����������ڿ���,���Ե�....");
		System.out.println("��ͨ��Դ....");
		System.out.println("����豸....");
		System.out.println("����������ת����....");
		System.out.println("�����Ѿ������򿪣������....");
	}

	
	
	@Override
	public void reset() {
		System.out.println("�����������������������������Ե�....");
		System.out.println("�����Ѿ������򿪣������.....");
	}

}
