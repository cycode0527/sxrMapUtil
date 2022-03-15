/**
 * 本文件为方向类
 */
package top.sxrhhh.sxrMapUtil.util;

import org.junit.Test;

/**
 * @author 施昕汝 
 * 方向类，包括各种参数
 */
public class Direction {

	private double degree; // 角度制方向，范围(-180 ~ 180 度)
	private double radians; // 弧度制方向，范围(-pi ~ pi)

	private static final double pi = Math.PI; // 定义pi圆周率常量

	/**
	 * 空白构造函数
	 */
	public Direction() {
	}

//	/**
//	 * 输入弧度制构造函数
//	 */
//	public Direction(double radians) {
//		this.radians = radians;
//	}

	/**
	 * 得到本角与它角相加（减）的结果
	 * @param other 加数
	 * @return 计算结果角度
	 */
	public double DegreePlus(double other) {
		double answer = this.degree + other;	// 得到相加答案
		while(answer > 180 || answer <= -180) {	// 越界检测
			if(answer > 180) {
				answer -= 360;	// 过高
			} else if (answer <= -180) {
				answer += 360;	// 过低
			}
			
		}
		
		return answer;
	}
	
	public double RadiansPlus(double other) {
		double answer = this.radians + other;	// 得到相加答案
		while(answer > pi || answer <= -pi) {	// 越界检测
			if(answer > pi) {
				answer -= 2 * pi;	// 过高
			} else if (answer <= -pi) {
				answer += 2 * pi;	// 过低
			}
			
		}
		
		return answer;
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
		while(this.degree > 180 || this.degree <= -180) {	// 越界检测
			if(this.degree > 180) {
				this.degree -= 360;	// 过高
			} else if (this.degree <= -180) {
				this.degree += 360;	// 过低
			}
			
		}
		this.radians = Math.toRadians(this.degree);	// 更新弧度
	}

	/**
	 * 设置弧度
	 * 
	 * @param radians
	 */
	public void setRadians(double radians) {
		this.radians = radians;
		this.setDegree(Math.toDegrees(this.radians)); // 更新角度，并进行越界检测，并更新弧度
	}

	/**
	 * 另一个方向赋值
	 * @param dr 被复制的方向
	 */
	public void setDirection(Direction dr) {
		this.setRadians(dr.getRadians());
	}
	
	@Test
	public void fun() {
		Direction di = new Direction();
		Direction d2 = new Direction();
		di.setRadians(1 * pi);
		d2.setDegree(45);
		System.out.println(di.DegreePlus(d2.degree) + " " + di.RadiansPlus(d2.radians));
		
		Position p = new Position(0, 0);
		Position p1 = new Position(3, 4);
		System.out.println(p.getDistance(p1) + " " + p.getDirection(p1).getDegree());
	}

}
