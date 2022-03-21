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
	 * ͨ��λ����������������ٶ�
	 * @param vector λ��
	 * @param time ����ʱ������
	 */
	public static Velocity getVelocityFromVectorAndTime(Vector vector, double time) {
		Velocity vel = new Velocity();
		vel.setVector(vector); // ��������
		vel.setSpeed(vector.length / time); // ·�̳���ʱ���������
		
		return vel;
	}
	
	/**
	 * �������ʣ��ı�ģ��
	 * @param speed ����
	 */
	public void setSpeed(double speed) {
		super.setLength(speed);
	}
	
	public double getSpeed() {
		return super.getLength();
	}
	
}
