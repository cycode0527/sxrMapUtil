/**
 * ���ļ�Ϊ������
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author ʩ���
 * �����࣬����x,y��ֵ
 */
public class Position {

	// x��y����
	protected double x;
	protected double y;
	
	/**
	 * �հ׹��캯��
	 */
	public Position() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	/**
	 * ��ֵ���캯��
	 * @param x
	 * @param y
	 */
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * ��ȡ�˵㵽��һ�����ֱ�߾���
	 * @param other ��һ���������
	 * @return ֱ�߾���
	 */
	public double getDistance(Position other) {
		double distance = Math.sqrt(Math.pow((other.getX() - this.getX()) , 2) +
				Math.pow(other.getY() - this.getY(), 2));	// �������빫ʽ
		
		return distance;
	}
	
	/**
	 * ��ȡ�˵㵽��һ����������ķ���
	 * @param other Ŀ���
	 * @return �˵㵽��һ����ķ���
	 */
	public Direction getDirection(Position other) {
		// ֱ�ӷ������������ǣ����ػ���
		double radians = Math.atan2(other.getY() - this.getY(), other.getX() - this.getX());
		Direction di = new Direction();	// ��Ҫ���صķ���
		di.setRadians(radians);	// ���÷�����ֵ
		
		return di;
	}
	
	/**
	 * ��ȡ�˵㵽��һ���������
	 * @param other Ŀ���
	 * @return ֮�������
	 */
	public Vector getVector(Position other) {
		Vector vector = new Vector(new Position(other.getX() -
				this.getX(), other.getY() - this.getY()));	// ֱ�����������
		
		return vector;
	}
	
	/**
	 * ͨ�������ӷ������һ����
	 * @param vec ���ϵ�����
	 * @return ��һ����
	 */
	public Position vectorPlus(Vector vec) {
		Position ps = new Position(this.getX() + vec.getPosition().getX(),
				this.getY() + vec.getPosition().getY()); // ͨ������ֱ�����
		return ps;
	}
	
	/**
	 * ͨ���������������һ����
	 * @param vec ����������
	 * @return ��һ����
	 */
	public Position vectorMinus(Vector vec) {
		Position ps = new Position(this.getX() - vec.getPosition().getX(),
				this.getY() - vec.getPosition().getY()); // ͨ������ֱ�����
		return ps;
	}
	
	/**
	 * ��ȡ�������Ϣ����ʽΪ(x,y)
	 * @return ��ʽ��������
	 */
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	/**
	 * ��һ������ĸ�ֵ
	 * @param pt �����Ƶ�����
	 */
	public void setPosition(Position pt) {
		this.setX(pt.getX());
		this.setY(pt.getY());
	}
	
	//start x��y����Ĵ�ȡ
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	//end
	
	
}
