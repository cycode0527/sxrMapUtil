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
	 * 设置速率，改变模长
	 * @param speed 速率
	 */
	public void setSpeed(double speed) {
		super.setLength(speed);
	}
	
	/**
	 * 获取速率，单位每秒
	 * @return 该速度的速率（模长）
	 */
	public double getSpeed() {
		return super.getLength();
	}
	
}
