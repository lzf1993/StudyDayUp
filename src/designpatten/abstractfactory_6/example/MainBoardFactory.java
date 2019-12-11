package designpatten.abstractfactory_6.example;


import designpatten.abstractfactory_6.example.impl.GAMainBoard;
import designpatten.abstractfactory_6.example.impl.MSIMainBoard;

public class MainBoardFactory {

	
	public static MainboardApi createMainBoardApi(int type){
		
		MainboardApi mainboardApi = null;	
		switch(type){
		case 1:
			mainboardApi = new GAMainBoard(1156);
			break;
		case 2:
			mainboardApi = new MSIMainBoard(939);
			break;
		}
		return mainboardApi;
	}
}
