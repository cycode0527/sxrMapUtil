/**
 * �޷������쳣��
 * @���� sxr������
 * @�汾�� 1.0.0 
 * @ʱ�� 2022��3��23�� ����11:01:30
 * @��Ȩ sxr
 * @��ע TODO
 *
 */
package top.sxrhhh.exception;

/**
 * @author sxr
 *
 */
public class CannotGetToException extends MyException {

	private static final long serialVersionUID = 1L;


	/**
	 * �հ׹��췽��
	 */
	public CannotGetToException() {
		super();
	}
	
	public CannotGetToException(String name) {
		super(name);
	}

}
