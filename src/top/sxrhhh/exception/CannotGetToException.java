/**
 * 无法到达异常类
 * @作者 sxr哈哈哈
 * @版本号 1.0.0 
 * @时间 2022年3月23日 下午11:01:30
 * @版权 sxr
 * @备注 TODO
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
	 * 空白构造方法
	 */
	public CannotGetToException() {
		super();
	}
	
	public CannotGetToException(String name) {
		super(name);
	}

}
