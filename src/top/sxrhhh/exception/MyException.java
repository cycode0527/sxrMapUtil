/**
 * ���쳣�ļ�
 * @���� sxr������
 * @�汾�� 1.0.0 
 * @ʱ�� 2022��3��23�� ����11:09:21
 * @��Ȩ sxr
 * @��ע TODO
 *
 */
package top.sxrhhh.exception;

/**
 * @author 19149
 * ���쳣��
 */
public class MyException extends Exception {
private String name;
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	public MyException() {
		super();
	}
	
	/**
	 * �����쳣���췽��
	 * @param name �쳣������
	 */
	public MyException(String name) {
		this.name = name;
	}
	

	/**
	 * ����쳣����
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
