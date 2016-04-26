package behavior.strategyPattern;

/**
 * Ѽ����ĳ���
 */
public abstract class Duck {
    //Ϊ��Ϊ�ӿ�����������������������Ѽ���඼�̳�����
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    //չʾ��۵ķ��������е�Ѽ�Ӷ��е���Ϊ�������ڳ�����
    public abstract void display();

    /**
     * �Ѿ������Ϊ����ί�и���Ϊ��
     */
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all ducks can float,even decoys");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
