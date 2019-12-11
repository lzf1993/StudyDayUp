package designpatten.observer_11;

import designpatten.observer_11.myself.NewsPaper;
import designpatten.observer_11.myself.Reader;

public class Test {
   public static void main(String args[]){
	   
	   //����
	   NewsPaper paper = new NewsPaper();
	   
	   
	   //����
	   Reader reader = new Reader();
	   reader.setName("����");
	   
	   Reader reader2 = new Reader();
	   reader2.setName("����");
	   
	   //ע��۲���
	   paper.attach(reader);
	   paper.attach(reader2);
	   
	   
	   paper.setContent("���������ǹ۲���ģʽ");
	   
   }
}
