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
	private double x;
	private double y;
	
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
	 * ��ȡ����ĸ�ʽ������ʽΪ(x,y)
	 * @return ��ʽ��������
	 */
	public String getFormat() {
		return "(" + this.x + "," + this.y + ")";
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
