/**
 * 本文件为坐标类
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author 施昕汝
 * 坐标类，包括x,y的值
 */
public class Position {

	// x与y坐标
	protected double x;
	protected double y;
	
	/**
	 * 空白构造函数
	 */
	public Position() {
		// TODO 自动生成的构造函数存根
	}
	
	/**
	 * 赋值构造函数
	 * @param x
	 * @param y
	 */
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 获取此点到另一个点的直线距离
	 * @param other 另一个点的坐标
	 * @return 直线距离
	 */
	public double getDistance(Position other) {
		double distance = Math.sqrt(Math.pow((other.getX() - this.getX()) , 2) +
				Math.pow(other.getY() - this.getY(), 2));	// 两点间距离公式
		
		return distance;
	}
	
	/**
	 * 获取此点到另一个点的向量的方向
	 * @param other 目标点
	 * @return 此点到另一个点的方向
	 */
	public Direction getDirection(Position other) {
		// 直接反正切求向量角，返回弧度
		double radians = Math.atan2(other.getY() - this.getY(), other.getX() - this.getX());
		Direction di = new Direction();	// 需要返回的方向
		di.setRadians(radians);	// 设置方向数值
		
		return di;
	}
	
	/**
	 * 获取此点到另一个点的向量
	 * @param other 目标点
	 * @return 之间的向量
	 */
	public Vector getVector(Position other) {
		Vector vector = new Vector(new Position(other.getX() -
				this.getX(), other.getY() - this.getY()));	// 直接相减得向量
		
		return vector;
	}
	
	/**
	 * 通过向量加法获得另一个点
	 * @param vec 加上的向量
	 * @return 另一个点
	 */
	public Position vectorPlus(Vector vec) {
		Position ps = new Position(this.getX() + vec.getPosition().getX(),
				this.getY() + vec.getPosition().getY()); // 通过坐标直接相加
		return ps;
	}
	
	/**
	 * 通过向量减法获得另一个点
	 * @param vec 减掉的向量
	 * @return 另一个点
	 */
	public Position vectorMinus(Vector vec) {
		Position ps = new Position(this.getX() - vec.getPosition().getX(),
				this.getY() - vec.getPosition().getY()); // 通过坐标直接相加
		return ps;
	}
	
	/**
	 * 获取坐标的信息，格式为(x,y)
	 * @return 格式化的坐标
	 */
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	/**
	 * 另一个坐标的赋值
	 * @param pt 被复制的坐标
	 */
	public void setPosition(Position pt) {
		this.setX(pt.getX());
		this.setY(pt.getY());
	}
	
	//start x，y坐标的存取
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
