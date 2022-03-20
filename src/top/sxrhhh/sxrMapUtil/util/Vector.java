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

	public void setDirect(Direction direct) {
		this.direct = direct;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Position getPosition() {
		return position;
	}
	//end 
	
}
