package TimeTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 记录程序执行时间
 * @author acer-pc
 *
 */
public class TimeRecord {
	private Date begin;
	private Date end;
	/**
	 * 当前时间开始计时
	 */
	public TimeRecord() {
		// TODO Auto-generated constructor stub
		this.begin=new Date();
	}
	/**
	 * 给定时间为开始计时时间
	 */
	public TimeRecord(Date bagin) {
		// TODO Auto-generated constructor stub
		this.begin=bagin;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	/**
	 * 获取消耗的时间
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public String getTimeCost(){
		end=new Date();
		Date dif=new Date(end.getTime()-begin.getTime());
		SimpleDateFormat fmt=null;
		if (dif.getMinutes()!=0) {
			fmt=new SimpleDateFormat("mm分ss秒SSS毫秒");
		}
		else if (dif.getSeconds()!=0) {
			fmt=new SimpleDateFormat("ss秒SSS毫秒");
		}
		else{
			fmt=new SimpleDateFormat("SSS毫秒");
		}
		return fmt.format(dif);
	}
}
