package polymorphic.actor;

/**
 * ��̨
 */
public class Stage {

	Actor actor=new HappyActor();
	
	/**
	 * �л���Ա
	 */
	public void changeActor() {
		actor=new SadActor();
		//��̬ѡ������
	}
	
	/**
	 * ����
	 */
	public void performActor() {
		actor.act();
	}

}
