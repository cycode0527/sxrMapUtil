/**
 * �ٶ����ļ�
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author ʩ���
 * �ٶ��࣬�̳���������
 */
public class Velocity extends Vector {
	
	/**
	 * �հ׹��췽��
	 */
	public Velocity() {
		super();
	}

	/**
	 * @param direct ��ʼ���ķ���
	 * @param speed ��ʼ�����ٶ�
	 */
	public Velocity(Direction direct, double speed) {
		super(direct, speed);
	}

	/**
	 * @param position ���õ�����
	 */
	public Velocity(Position position) {
		super(position);
	}
	
	
	
	/**
	 * �������ʣ��ı�ģ��
	 * @param speed ����
	 */
	public void setSpeed(double speed) {
		super.setLength(speed);
	}
	
	/**
	 * ��ȡ���ʣ���λÿ��
	 * @return ���ٶȵ����ʣ�ģ����
	 */
	public double getSpeed() {
		return super.getLength();
	}
	
}
