/**
 * ���ļ�Ϊ�Ƕ���
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author ʩ���
 * �Ƕ���
 */
public class Angle {
	protected double degree; // �Ƕ��Ʒ���
	protected double radians; // �����Ʒ���

	protected static final double pi = Math.PI; // ����piԲ���ʳ���

	/**
	 * �հ׹��캯��
	 */
	public Angle() {
	}

//	/**
//	 * ���뻡���ƹ��캯��
//	 */
//	public Angle(double radians) {
//		this.radians = radians;
//	}

	/**
	 * �õ�������������ӣ������Ľ��
	 * @param other ����
	 * @return �������Ƕ�
	 */
	public double degreePlus(double other) {
		double answer = this.degree + other;	// �õ���Ӵ�
		return answer;
	}
	
	/**
	 * �õ����������ǵĻ�����Ӽ��Ľ��
	 * @param other ����
	 * @return �������Ļ���
	 */
	public double radiansPlus(double other) {
		double answer = this.radians + other;	// �õ���Ӵ�

		return answer;
	}
	
	
	/**
	 * �õ�����������ֱ��������õ��½�
	 * @param other ����
	 * @return �õ����½�
	 */
	public Angle anglePlus(Angle other) {
		Angle ag = new Angle(); // �����½�
		ag.setRadians(this.radiansPlus(other.radians)); // �������
		return ag;	
	}
	
	/**
	 * �õ����Ǽ����������õ��½�
	 * @param other ����
	 * @return �õ����½�
	 */
	public Angle angleMinus(Angle other) {
		Angle ag = new Angle();  // �����½�
		ag.setRadians(this.radiansPlus(-other.radians)); // �������
		return ag;
	}
	
	/**
	 * ͨ����һ��������
	 * @param other ��Ҫ���ӵĽ�
	 */
	public void increase(Angle other) {
		this.setRadians(this.radiansPlus(other.radians));	// ������������
	}
	
	
	/**
	 * ͨ����һ�����Լ�
	 * @param other ��Ҫ���ٵĽ�
	 */
	public void reduce(Angle other) {
		this.setRadians(this.radiansPlus(-other.radians)); // ���������Լ�
	}
	
	/**
	 * ͨ���Ƕ�����
	 * @param other �����ĽǶ�
	 */
	public void degreeIncrease(double other) {
		this.setDegree(this.degreePlus(other));	// ������Ƕ�����
	}
	
	/**
	 * ͨ���Ƕ��Լ�
	 * @param other �Լ��ĽǶ�
	 */
	public void degreeReduce(double other) {
		this.setDegree(this.degreePlus(-other));	// ������Ƕ��Լ�
	}
	
	/**
	 * ͨ����������
	 * @param other �����Ļ���
	 */
	public void radiansIncrease(double other) {
		this.setRadians(this.radiansPlus(other));	// ������������
	}
	
	/**
	 * ͨ�������Լ�
	 * @param other �Լ��Ļ���
	 */
	public void radiansReduce(double other) {
		this.setRadians(this.radiansPlus(-other));	// ���������Լ�
	}
	
	/**
	 * ͨ��Խ���⽫���Ƕ�תΪ����
	 * @return תΪ�ķ���
	 */
	public Direction toDirection() {
		Direction dir = new Direction();
		double radians = this.radians;	// ���满��
		while(radians > pi || radians <= -pi) {	// Խ����
			if(radians > pi) {
				radians -= 2 * pi;	// ����
			} else if (radians <= -pi) {
				radians += 2 * pi;	// ����
			}
		}
		dir.setRadians(radians); // ͨ���������ø÷���
		return dir;
	}
	
	/**
	 * ������Ƕ���ϸ��Ϣ
	 */
	@Override
	public String toString() {
		return "�Ƕȣ�" + this.degree + "\n���ȣ�" + this.radians;
	}
	
	/**
	 * ��ȡ�Ƕ���
	 * 
	 * @return ��λ�Ƕ�
	 */
	public double getDegree() {
		return this.degree;
	}

	/**
	 * ��ȡ������
	 * 
	 * @return ��λ����
	 */
	public double getRadians() {
		return this.radians;
	}

	/**
	 * ���ýǶ�
	 * @param degree
	 */
	public void setDegree(double degree) {
		this.degree = degree;
		
		this.radians = Math.toRadians(this.degree);	// ���»���
	}

	/**
	 * ���û���
	 * 
	 * @param radians
	 */
	public void setRadians(double radians) {
		this.radians = radians;
		this.degree = Math.toDegrees(this.radians); // ���½Ƕ�
	}

	/**
	 * ��һ���Ǹ�ֵ
	 * @param dr �����ƵĽ�
	 */
	public void setAngle(Angle ag) {
		this.setRadians(ag.getRadians());
	}
}
