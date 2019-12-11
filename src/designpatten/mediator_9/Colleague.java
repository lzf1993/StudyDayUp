package designpatten.mediator_9;



//同事父类
public abstract class Colleague {
    private Meadiator meadiator; 
    
    public Colleague(Meadiator meadiator){
    	this.meadiator = meadiator;
    }
    
    public Meadiator getMediator(){
    	return meadiator;
    }
}
