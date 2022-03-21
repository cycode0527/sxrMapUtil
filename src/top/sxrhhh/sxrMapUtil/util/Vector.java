/**
 * ���ļ�Ϊ�����࣬��������
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author ʩ���
 * �����࣬���������뷽��
 */
public class Vector {

	protected Direction direct = new Direction();	// �����ķ���
	protected double length;	// ������ģ
	
	// �����������ʾ����
	protected Position position = new Position();
	
	/**
	 * �հ׹��캯��
	 */
	public Vector() {
	}
	
	/**
	 * ��ֵ�����깹�췽��
	 * @param direct ����
	 * @param length ģ
	 */
	public Vector(Direction direct, double length) {
		this.setDirect(direct, length); // ���ø�������
	}

	/**
	 * ��ֱֵ�����깹�췽��
	 * @param position ֱ������
	 */
	public Vector(Position position) {
		this.setPosition(position);
	}
	
	/**
	 * �����ӷ�����������
	 * @param other ��һ������
	 * @return ����������
	 */
	public Vector VectorPlus(Vector other) {
		Vector vec = new Vector(); // ����������
		Position ps = new Position(this.position.getX() + other.position.getX(),
				this.position.getY() + other.position.getY());	// ֱ����Ӵ���������
		vec.setPosition(ps);	// ���������긳ֵ
		
		return vec;
	}
	
	/**
	 * ������������������
	 * @param other ��һ������
	 * @return ����������
	 */
	public Vector VectorMinus(Vector other) {
		Vector vec = new Vector(); // ����������
		Position ps = new Position(this.getPosition().getX() - other.getPosition().getX(),
				this.getPosition().getY() - other.getPosition().getY());	// ֱ���������������
		vec.setPosition(ps);	// ���������긳ֵ
		
		return vec;
	}
	
	/**
	 * �����������������ӷ�����ֵ����
	 * @param other ���ӵ�����
	 */
	public void VectorIncrease(Vector other) {
		Vector vec = this.VectorPlus(other);	// ������ʱ����
		this.setVector(vec); // ��������ֵ
	}
	
	/**
	 * �����Լ�����������������ֵ����
	 * @param other ����������
	 */
	public void VectorReduce(Vector other) {
		Vector vec = this.VectorMinus(other);	// ������ʱ����
		this.setVector(vec); // ��������ֵ
	}
	
	/**
	 * ��������ʱ����תһ���Ƕ�
	 * @param degree ��ʱ����ת�ĽǶ�
	 */
	public void turnDegree(double degree) {
		this.direct.degreeIncrease(degree);	// ֱ����ʱ����ת����
	}
	
	/**
	 * ��������ʱ����תһ������
	 * @param radians ��ʱ����ת�Ļ���
	 */
	public void turnRadians(double radians) {
		this.direct.radiansIncrease(radians); // ֱ����ʱ����ת����
	}
	
	/**
	 * ��ʱ����ת
	 * @param angle ��ת�Ľ�
	 */
	public void turnIncrease(Angle angle) {
		this.direct.increase(angle); // ������������
	}
	
	/**
	 * ˳ʱ����ת
	 * @param angle ��ת�Ľ�
	 */
	public void turnReduce(Angle angle) {
		this.direct.reduce(angle); // ���������Լ�
	}
	
	/**
	 * ͨ��������ģ��������
	 * @param direct ����
	 * @param length ģ
	 */
	public void setDirect(Direction direct, double length) {
		this.direct.setDirection(direct);	// ���÷���
		this.length = length;	// ����ģ
		
		this.position.setX(length * Math.cos(direct.getRadians()));	// ����ֵ��x����
		this.position.setY(length * Math.sin(direct.getRadians())); // ����ֵ��y����
	}
	
	/**
	 * ֻ���÷��򣬲�����ģ
	 * @param direct ���õķ���
	 */
	public void setDirect(Direction direct) {
		this.setDirect(direct, this.length);
	}
	
	/**
	 * ֻ����ģ�������÷���
	 * @param length ���õ�ģ
	 */
	public void setLength(double length) {
		this.setDirect(this.direct, length);
	}
	
	
	/**
	 * ͨ��ֱ��������������
	 * @param position ����
	 */
	public void setPosition(Position position) {
		this.position.setPosition(position); // ��������
		
		this.length = new Position(0, 0).getDistance(this.position);	// ԭ�㵽����ľ���
		this.direct = new Position(0, 0).getDirection(this.position);	// ԭ�㵽����ķ���
	}
	
	/**
	 * ��һ�������ĸ�ֵ
	 * @param vt �����Ƶ�����
	 */
	public void setVector(Vector vt) {
		this.setPosition(vt.position);	// ͨ���������ñ�����
	}
	
	/**
	 * ���ر���������ϸ��Ϣ
	 */
	@Override
	public String toString() {
		return "���꣺" + this.position.toString() + "\n" + this.direct.toString() + 
				"\nģ����" + this.getLength();
	}

	
	//start get��set����
	public Direction getDirect() {
		return direct;
	}


	public double getLength() {
		return length;
	}


	public Position getPosition() {
		return position;
	}
	//end 
	
}
