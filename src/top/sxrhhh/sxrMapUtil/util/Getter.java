/**
 * 存储静态方法，用于管理计算的文件
 * @作者 sxr哈哈哈
 * @版本号 1.0.0 
 * @时间 2022年3月23日 下午10:29:25
 * @版权 sxr
 * @备注 TODO
 *
 */
package top.sxrhhh.sxrMapUtil.util;

import top.sxrhhh.exception.CannotGetToException;

/**
 * @author sxr
 * 计算并获取物理量类
 */
public class Getter {

	//start 跟速度有关的计算(静态方法)
		/**
		 * 通过位移与所需秒数求得速度
		 * @param vector 位移
		 * @param time 所需时间秒数
		 * @return 所求得的速度
		 */
		public static Velocity getVelocityFromVectorAndTime(Vector vector, double time) {
			Velocity vel = new Velocity();
			vel.setVector(vector); // 保留方向
			vel.setSpeed(vector.getLength() / time); // v = s / t
			
			return vel;
		}
		
		/**
		 * 通过速度与所需秒数求得位移
		 * @param vl
		 * @param time
		 * @return 所求得的位移
		 */
		public static Vector getVectorFromVelocityAndTime(Velocity vl, double time) {
			Vector vec = new Vector();	// 新建向量作为位移
			vec.setVector(vl); // 保留速度方向
			vec.setLength(vl.getSpeed() * time); // s = vt
			
			return vec;
		}
		
		/**
		 * 通过速度与位移求时间
		 * @param vec 位移
		 * @param vl 速度
		 * @return 时间
		 * @throws CannotGetToException 如果速度与位移方向垂直或相反，抛出此异常
		 */
		public static double getTimeFromVectorAndVelocity(Vector vec, Velocity vl) throws CannotGetToException {
			Angle ag = Getter.getAbsAngleFromTwoDirections(vl.getDirect(), vec.getDirect()); // 获取速度与位移的夹角
			double speed = vl.getSpeed() * Math.cos(ag.getRadians());	// 获得对于位移方向上的速率
			double time = vec.getLength() / speed;	// t = s / v*cos(夹角)
			if(time <= 0) {
				throw new CannotGetToException("速度与位移垂直或相反，无法到达");
			}
			return time;
		}
		
		/**
		 * 获取两个方向之间的夹角，恒大于0小于180°
		 * @param d1 方向1
		 * @param d2 方向2
		 * @return 两方向间的夹角
		 */
		public static Angle getAbsAngleFromTwoDirections(Direction d1, Direction d2) {
			double radians = d1.radiansPlus(-d2.getRadians()); // 两角弧度直接相减
			radians = Math.abs(radians); // 将自身绝对值化
			
			return new Angle(radians);
		}
		//end
	
}
