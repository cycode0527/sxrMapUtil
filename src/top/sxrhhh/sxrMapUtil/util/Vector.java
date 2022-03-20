/**
 * 本文件为向量类，定义向量
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author 施昕汝
 * 向量类，包括长度与方向
 */
public class Vector {

	protected Direction direct = new Direction();	// 向量的方向
	protected double length;	// 向量的模
	
	// 向量的坐标表示参数
	protected Position position = new Position();
	
	/**
	 * 空白构造函数
	 */
	public Vector() {
	}
	
	/**
	 * 赋值极坐标构造方法
	 * @param direct 方向
	 * @param length 模
	 */
	public Vector(Direction direct, double length) {
		this.setDirect(direct, length); // 设置各个参数
	}

	/**
	 * 赋值直角坐标构造方法
	 * @param position 直角坐标
	 */
	public Vector(Position position) {
		this.setPosition(position);
	}
	
	/**
	 * 向量加法所得新向量
	 * @param other 另一个向量
	 * @return 所得新向量
	 */
	public Vector VectorPlus(Vector other) {
		Vector vec = new Vector(); // 创建新向量
		Position ps = new Position(this.position.getX() + other.position.getX(),
				this.position.getY() + other.position.getY());	// 直接相加创建新坐标
		vec.setPosition(ps);	// 用所得坐标赋值
		
		return vec;
	}
	
	/**
	 * 向量减法所得新向量
	 * @param other 另一个向量
	 * @return 所得新向量
	 */
	public Vector VectorMinus(Vector other) {
		Vector vec = new Vector(); // 创建新向量
		Position ps = new Position(this.getPosition().getX() - other.getPosition().getX(),
				this.getPosition().getY() - other.getPosition().getY());	// 直接相减创建新坐标
		vec.setPosition(ps);	// 用所得坐标赋值
		
		return vec;
	}
	
	/**
	 * 通过方向与模设置向量
	 * @param direct 方向
	 * @param length 模
	 */
	public void setDirect(Direction direct, double length) {
		this.direct.setDirection(direct);	// 设置方向
		this.length = length;	// 设置模
		
		this.position.setX(length * Math.cos(direct.getRadians()));	// 余弦值求x坐标
		this.position.setY(length * Math.sin(direct.getRadians())); // 正弦值求y坐标
	}
	
	/**
	 * 通过直角坐标设置向量
	 * @param position 坐标
	 */
	public void setPosition(Position position) {
		this.position.setPosition(position); // 设置坐标
		
		this.length = new Position(0, 0).getDistance(this.position);	// 原点到坐标的距离
		this.direct = new Position(0, 0).getDirection(this.position);	// 原点到坐标的方向
	}
	
	/**
	 * 另一个向量的赋值
	 * @param vt 被复制的向量
	 */
	public void setVector(Vector vt) {
		this.setPosition(vt.position);	// 通过坐标设置本向量
	}
	
	/**
	 * 返回本向量的详细信息
	 */
	@Override
	public String toString() {
		return "坐标：" + this.position.toString() + "\n" + this.direct.toString() + 
				"\n模长：" + this.getLength();
	}

	
	//start get和set方法
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
