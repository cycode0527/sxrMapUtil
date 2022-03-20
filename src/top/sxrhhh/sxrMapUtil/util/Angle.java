/**
 * 本文件为角度类
 */
package top.sxrhhh.sxrMapUtil.util;

/**
 * @author 施昕汝
 * 角度类
 */
public class Angle {
	protected double degree; // 角度制方向
	protected double radians; // 弧度制方向

	protected static final double pi = Math.PI; // 定义pi圆周率常量

	/**
	 * 空白构造函数
	 */
	public Angle() {
	}

//	/**
//	 * 输入弧度制构造函数
//	 */
//	public Angle(double radians) {
//		this.radians = radians;
//	}

	/**
	 * 得到本角与它角相加（减）的结果
	 * @param other 加数
	 * @return 计算结果角度
	 */
	public double degreePlus(double other) {
		double answer = this.degree + other;	// 得到相加答案
		return answer;
	}
	
	/**
	 * 得到本角与它角的弧度相加减的结果
	 * @param other 加数
	 * @return 计算结果的弧度
	 */
	public double radiansPlus(double other) {
		double answer = this.radians + other;	// 得到相加答案

		return answer;
	}
	
	
	/**
	 * 得到本角与它角直接相加所得的新角
	 * @param other 它角
	 * @return 得到的新角
	 */
	public Angle anglePlus(Angle other) {
		Angle ag = new Angle(); // 创建新角
		ag.setRadians(this.radiansPlus(other.radians)); // 弧度相加
		return ag;	
	}
	
	/**
	 * 得到本角减掉它角所得的新角
	 * @param other 它角
	 * @return 得到的新角
	 */
	public Angle angleMinus(Angle other) {
		Angle ag = new Angle();  // 创建新角
		ag.setRadians(this.radiansPlus(-other.radians)); // 弧度相减
		return ag;
	}
	
	/**
	 * 通过另一个角自增
	 * @param other 需要增加的角
	 */
	public void increase(Angle other) {
		this.setRadians(this.radiansPlus(other.radians));	// 将自身弧度自增
	}
	
	
	/**
	 * 通过另一个角自减
	 * @param other 需要减少的角
	 */
	public void reduce(Angle other) {
		this.setRadians(this.radiansPlus(-other.radians)); // 将自身弧度自减
	}
	
	/**
	 * 通过角度自增
	 * @param other 自增的角度
	 */
	public void degreeIncrease(double other) {
		this.setDegree(this.degreePlus(other));	// 将自身角度自增
	}
	
	/**
	 * 通过角度自减
	 * @param other 自减的角度
	 */
	public void degreeReduce(double other) {
		this.setDegree(this.degreePlus(-other));	// 将自身角度自减
	}
	
	/**
	 * 通过弧度自增
	 * @param other 自增的弧度
	 */
	public void radiansIncrease(double other) {
		this.setRadians(this.radiansPlus(other));	// 将自身弧度自增
	}
	
	/**
	 * 通过弧度自减
	 * @param other 自减的弧度
	 */
	public void radiansReduce(double other) {
		this.setRadians(this.radiansPlus(-other));	// 将自身弧度自减
	}
	
	/**
	 * 通过越界检测将本角度转为方向
	 * @return 转为的方向
	 */
	public Direction toDirection() {
		Direction dir = new Direction();
		double radians = this.radians;	// 保存弧度
		while(radians > pi || radians <= -pi) {	// 越界检测
			if(radians > pi) {
				radians -= 2 * pi;	// 过高
			} else if (radians <= -pi) {
				radians += 2 * pi;	// 过低
			}
		}
		dir.setRadians(radians); // 通过弧度设置该方向
		return dir;
	}
	
	/**
	 * 输出本角度详细信息
	 */
	@Override
	public String toString() {
		return "角度：" + this.degree + "\n弧度：" + this.radians;
	}
	
	/**
	 * 获取角度制
	 * 
	 * @return 相位角度
	 */
	public double getDegree() {
		return this.degree;
	}

	/**
	 * 获取弧度制
	 * 
	 * @return 相位弧度
	 */
	public double getRadians() {
		return this.radians;
	}

	/**
	 * 设置角度
	 * @param degree
	 */
	public void setDegree(double degree) {
		this.degree = degree;
		
		this.radians = Math.toRadians(this.degree);	// 更新弧度
	}

	/**
	 * 设置弧度
	 * 
	 * @param radians
	 */
	public void setRadians(double radians) {
		this.radians = radians;
		this.degree = Math.toDegrees(this.radians); // 更新角度
	}

	/**
	 * 另一个角赋值
	 * @param dr 被复制的角
	 */
	public void setAngle(Angle ag) {
		this.setRadians(ag.getRadians());
	}
}
