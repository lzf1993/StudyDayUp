package designpatten.memento_18.test4;

import java.util.ArrayList;
import java.util.List;


//������ -- invoker������
public class Calculator {

	//����Ĳ�����ʷ��¼ �� �ڳ���ʱ��
	private List<Command> undoCmds = new ArrayList<>();

	//�����������ʷ��¼�� �ڻָ�ʱ����
	private List<Command> redoCmds = new ArrayList<>();

	//��������Ķ�Ӧ����¼�������ʷ��¼ ���ڳ�����ʱ���� �� ��������Ԫ�أ�����ִ��ǰ״̬������ִ�к�״̬
	private List<Memento[]> undoMementos = new ArrayList<>();


	//��������Ķ�Ӧ����¼�������ʷ��¼ ���ڻָ���ʱ���� ����������Ԫ�أ�����ִ��ǰ״̬������ִ�к�״̬
	private List<Memento[]> redoMementos = new ArrayList<>();

	//�ӷ�����
	private Command addCmd = null;

	//��������
	private Command subCmd = null;


	public void setAddCmd(Command addCmd){
		this.addCmd = addCmd;
	}

	public void setSubCmd(Command subCmd){
		this.subCmd = subCmd;
	}


	//�ӷֲ���
	public void addPressed(){
		//��ʼǰ������һ������¼����
		Memento m1 = this.addCmd.createMemento();
		//ִ������
		this.addCmd.execute();
		//��ӵ���������ϵ���
		this.undoCmds.add(addCmd);

		//��ɺ󣬴���һ������¼����
		Memento m2 = this.addCmd.createMemento();
		//��ӵ�������ʷ��¼��
		this.undoMementos.add(new Memento[]{m1,m2});
	}


	//��������
	public void subPressed(){
		//��ʼǰ������һ������¼����
		Memento m1 = this.subCmd.createMemento();
		//ִ������
		this.subCmd.execute();
		//��ӵ���������ϵ���
		this.undoCmds.add(subCmd);

		//��ɺ󣬴���һ������¼����
		Memento m2 = this.subCmd.createMemento();
		//��ӵ�������ʷ��¼��
		this.undoMementos.add(new Memento[]{m1,m2});
	}



	//��������
	public void undoPressed(){
		if(undoCmds.size()>0){
			//ȡ�����һ���������
			Command cmd = undoCmds.get(undoCmds.size() -1);
			//ȡ����Ӧ�ı���¼����
			Memento []ms = undoMementos.get(undoMementos.size()-1);
			//���г�������
			cmd.undo(ms[0]);
			//������лָ��Ĺ��ܣ�����ӵ��ָ�����ʷ��¼��
			redoCmds.add(cmd);
			redoMementos.add(ms);

			//ɾ�����һ������
			undoCmds.remove(cmd);
			//ɾ����Ӧ�ı���¼����
			undoMementos.remove(ms);
		}else{
			System.out.println("��Ǹ��û�пɳ���������.");
		}
	}


	//�ָ������Ĳ���
	public void redoPressed(){
		if(redoCmds.size()>0){
			//ȡ�����һ���������
			Command cmd = redoCmds.get(redoCmds.size() -1);
			//ȡ����Ӧ�ı���¼����
			Memento []ms = redoMementos.get(redoMementos.size()-1);
			//���г�������
			cmd.redo(ms[0]);
			//������лָ��Ĺ��ܣ�����ӵ��ָ�����ʷ��¼��
			undoCmds.add(cmd);
			undoMementos.add(ms);

			//ɾ�����һ������
			redoCmds.remove(cmd);
			//ɾ����Ӧ�ı���¼����
			redoMementos.remove(ms);
		}else{
			System.out.println("��Ǹ��û�пɻָ�������.");
		}
	}

}
