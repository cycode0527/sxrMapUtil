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
	private double x;
	private double y;
	
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
	 * 获取坐标的格式化，格式为(x,y)
	 * @return 格式化的坐标
	 */
	public String getFormat() {
		return "(" + this.x + "," + this.y + ")";
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
