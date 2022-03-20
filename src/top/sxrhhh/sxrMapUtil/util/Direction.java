/**
 * 本文件为方向类
 */
package top.sxrhhh.sxrMapUtil.util;

import org.junit.Test;

/**
 * @author 施昕汝 
 * 方向类，包括各种参数范围为±180°
 */
public class Direction extends Angle {

	/**
	 * 空白构造方法
	 */
	public Direction() {
	}
	
	/**
	 * 得到本方向与它方向相加（减）的结果
	 * @param other 加数
	 * @return 计算结果角度
	 */
	@Override
	public double degreePlus(double other) {
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
	
	/**
	 * 得到本方向与它方向的弧度相加减的结果
	 * @param other 加数
	 * @return 计算结果的弧度
	 */
	@Override
	public double radiansPlus(double other) {
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
	 * @param ag 被复制的角
	 */
	public void setDirection(Angle ag) {
		double radians = ag.radians; // 保存其弧度
		while(radians > pi || radians <= -pi) {	// 越界检测
			if(radians > pi) {
				radians -= 2 * pi;	// 过高
			} else if (radians <= -pi) {
				radians += 2 * pi;	// 过低
			}
			
		}
		
		this.setRadians(radians); // 通过弧度复制
	}
	
	
	@Test
	public void fun() {
//		Direction di = new Direction();
//		Direction d2 = new Direction();
//		di.setRadians(2 * pi);
//		d2.setDegree(45);
//		System.out.println(di.degreePlus(d2.degree) + " " + di.radiansPlus(d2.radians));
//		
//		Position p = new Position(0, 0);
//		Position p1 = new Position(3, 4);
//		System.out.println(p.getDistance(p1) + " " + p.getDirection(p1).getDegree());
//		System.out.println();
		
//		Vector vec = new Vector(p1);
//		System.out.println(vec.toString());
		
//		Angle d = new Angle();
//		d.setRadians(350);
//		Angle a = new Angle();
//		a.setDegree(80);
//		System.out.println(d.anglePlus(a));
//		
		
	}

}
