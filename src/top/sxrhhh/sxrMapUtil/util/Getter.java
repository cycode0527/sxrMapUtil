/**
 * �洢��̬���������ڹ��������ļ�
 * @���� sxr������
 * @�汾�� 1.0.0 
 * @ʱ�� 2022��3��23�� ����10:29:25
 * @��Ȩ sxr
 * @��ע TODO
 *
 */
package top.sxrhhh.sxrMapUtil.util;

import top.sxrhhh.exception.CannotGetToException;

/**
 * @author sxr
 * ���㲢��ȡ��������
 */
public class Getter {

	//start ���ٶ��йصļ���(��̬����)
		/**
		 * ͨ��λ����������������ٶ�
		 * @param vector λ��
		 * @param time ����ʱ������
		 * @return ����õ��ٶ�
		 */
		public static Velocity getVelocityFromVectorAndTime(Vector vector, double time) {
			Velocity vel = new Velocity();
			vel.setVector(vector); // ��������
			vel.setSpeed(vector.getLength() / time); // v = s / t
			
			return vel;
		}
		
		/**
		 * ͨ���ٶ��������������λ��
		 * @param vl
		 * @param time
		 * @return ����õ�λ��
		 */
		public static Vector getVectorFromVelocityAndTime(Velocity vl, double time) {
			Vector vec = new Vector();	// �½�������Ϊλ��
			vec.setVector(vl); // �����ٶȷ���
			vec.setLength(vl.getSpeed() * time); // s = vt
			
			return vec;
		}
		
		/**
		 * ͨ���ٶ���λ����ʱ��
		 * @param vec λ��
		 * @param vl �ٶ�
		 * @return ʱ��
		 * @throws CannotGetToException ����ٶ���λ�Ʒ���ֱ���෴���׳����쳣
		 */
		public static double getTimeFromVectorAndVelocity(Vector vec, Velocity vl) throws CannotGetToException {
			Angle ag = Getter.getAbsAngleFromTwoDirections(vl.getDirect(), vec.getDirect()); // ��ȡ�ٶ���λ�Ƶļн�
			double speed = vl.getSpeed() * Math.cos(ag.getRadians());	// ��ö���λ�Ʒ����ϵ�����
			double time = vec.getLength() / speed;	// t = s / v*cos(�н�)
			if(time <= 0) {
				throw new CannotGetToException("�ٶ���λ�ƴ�ֱ���෴���޷�����");
			}
			return time;
		}
		
		/**
		 * ��ȡ��������֮��ļнǣ������0С��180��
		 * @param d1 ����1
		 * @param d2 ����2
		 * @return �������ļн�
		 */
		public static Angle getAbsAngleFromTwoDirections(Direction d1, Direction d2) {
			double radians = d1.radiansPlus(-d2.getRadians()); // ���ǻ���ֱ�����
			radians = Math.abs(radians); // ���������ֵ��
			
			return new Angle(radians);
		}
		//end
	
}
