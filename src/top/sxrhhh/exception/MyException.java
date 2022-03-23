/**
 * 总异常文件
 * @作者 sxr哈哈哈
 * @版本号 1.0.0 
 * @时间 2022年3月23日 下午11:09:21
 * @版权 sxr
 * @备注 TODO
 *
 */
package top.sxrhhh.exception;

/**
 * @author 19149
 * 总异常类
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
	 * 命名异常构造方法
	 * @param name 异常的描述
	 */
	public MyException(String name) {
		this.name = name;
	}
	

	/**
	 * 输出异常描述
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
