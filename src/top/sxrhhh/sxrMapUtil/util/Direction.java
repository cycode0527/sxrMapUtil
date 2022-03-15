/**
 * ���ļ�Ϊ������
 */
package top.sxrhhh.sxrMapUtil.util;

import org.junit.Test;

/**
 * @author ʩ��� 
 * �����࣬�������ֲ���
 */
public class Direction {

	private double degree; // �Ƕ��Ʒ��򣬷�Χ(-180 ~ 180 ��)
	private double radians; // �����Ʒ��򣬷�Χ(-pi ~ pi)

	private static final double pi = Math.PI; // ����piԲ���ʳ���

	/**
	 * �հ׹��캯��
	 */
	public Direction() {
	}

//	/**
//	 * ���뻡���ƹ��캯��
//	 */
//	public Direction(double radians) {
//		this.radians = radians;
//	}

	/**
	 * �õ�������������ӣ������Ľ��
	 * @param other ����
	 * @return �������Ƕ�
	 */
	public double DegreePlus(double other) {
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
	
	public double RadiansPlus(double other) {
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
	 * ��ȡ�Ƕ���
	 * 
	 * @return ��λ�Ƕ�
	 */
	public double getDegree() {
		return this.degree;
	}

	/**
	 * ��ȡ������
	 * 
	 * @return ��λ����
	 */
	public double getRadians() {
		return this.radians;
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
	 * @param dr �����Ƶķ���
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
