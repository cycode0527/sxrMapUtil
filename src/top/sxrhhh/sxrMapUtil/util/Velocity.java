/**
 * 速度类文件
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author 施昕汝
 * 速度类，继承自向量类
 */
public class Velocity extends Vector {
	
	/**
	 * 空白构造方法
	 */
	public Velocity() {
		super();
	}

	/**
	 * @param direct 初始化的方向
	 * @param speed 初始化的速度
	 */
	public Velocity(Direction direct, double speed) {
		super(direct, speed);
	}

	/**
	 * @param position 设置的坐标
	 */
	public Velocity(Position position) {
		super(position);
	}
	
	/**
	 * 通过位移与所需秒数求得速度
	 * @param vector 位移
	 * @param time 所需时间秒数
	 */
	public static Velocity getVelocityFromVectorAndTime(Vector vector, double time) {
		Velocity vel = new Velocity();
		vel.setVector(vector); // 保留方向
		vel.setSpeed(vector.length / time); // 路程除以时间等于速率
		
		return vel;
	}
	
	/**
	 * 设置速率，改变模长
	 * @param speed 速率
	 */
	public void setSpeed(double speed) {
		super.setLength(speed);
	}
	
	public double getSpeed() {
		return super.getLength();
	}
	
}
