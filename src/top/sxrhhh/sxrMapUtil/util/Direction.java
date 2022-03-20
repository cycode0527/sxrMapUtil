/**
 * ���ļ�Ϊ������
 */
package top.sxrhhh.sxrMapUtil.util;

import org.junit.Test;

/**
 * @author ʩ��� 
 * �����࣬�������ֲ�����ΧΪ��180��
 */
public class Direction extends Angle {

	/**
	 * �հ׹��췽��
	 */
	public Direction() {
	}
	
	/**
	 * �õ�����������������ӣ������Ľ��
	 * @param other ����
	 * @return �������Ƕ�
	 */
	@Override
	public double degreePlus(double other) {
		double answer = this.degree + other;	// �õ���Ӵ�
		while(answer > 180 || answer <= -180) {	// Խ����
			if(answer > 180) {
				answer -= 360;	// ����
			} else if (answer <= -180) {
				answer += 360;	// ����
			}
			
		}
		
		return answer;
	}
	
	/**
	 * �õ���������������Ļ�����Ӽ��Ľ��
	 * @param other ����
	 * @return �������Ļ���
	 */
	@Override
	public double radiansPlus(double other) {
		double answer = this.radians + other;	// �õ���Ӵ�
		while(answer > pi || answer <= -pi) {	// Խ����
			if(answer > pi) {
				answer -= 2 * pi;	// ����
			} else if (answer <= -pi) {
				answer += 2 * pi;	// ����
			}
			
		}
		
		return answer;
	}
	
	
	/**
	 * ���ýǶ�
	 * @param degree
	 */
	public void setDegree(double degree) {
		this.degree = degree;
		while(this.degree > 180 || this.degree <= -180) {	// Խ����
			if(this.degree > 180) {
				this.degree -= 360;	// ����
			} else if (this.degree <= -180) {
				this.degree += 360;	// ����
			}
			
		}
		this.radians = Math.toRadians(this.degree);	// ���»���
	}
	
	/**
	 * ���û���
	 * 
	 * @param radians
	 */
	public void setRadians(double radians) {
		this.radians = radians;
		this.setDegree(Math.toDegrees(this.radians)); // ���½Ƕȣ�������Խ���⣬�����»���
	}
	
	/**
	 * ��һ������ֵ
	 * @param ag �����ƵĽ�
	 */
	public void setDirection(Angle ag) {
		double radians = ag.radians; // �����仡��
		while(radians > pi || radians <= -pi) {	// Խ����
			if(radians > pi) {
				radians -= 2 * pi;	// ����
			} else if (radians <= -pi) {
				radians += 2 * pi;	// ����
			}
			
		}
		
		this.setRadians(radians); // ͨ�����ȸ���
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
