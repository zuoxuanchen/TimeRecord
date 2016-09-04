package TimeTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��¼����ִ��ʱ��
 * @author acer-pc
 *
 */
public class TimeRecord {
	private Date begin;
	private Date end;
	/**
	 * ��ǰʱ�俪ʼ��ʱ
	 */
	public TimeRecord() {
		// TODO Auto-generated constructor stub
		this.begin=new Date();
	}
	/**
	 * ����ʱ��Ϊ��ʼ��ʱʱ��
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
	 * ��ȡ���ĵ�ʱ��
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public String getTimeCost(){
		end=new Date();
		Date dif=new Date(end.getTime()-begin.getTime());
		SimpleDateFormat fmt=null;
		if (dif.getMinutes()!=0) {
			fmt=new SimpleDateFormat("mm��ss��SSS����");
		}
		else if (dif.getSeconds()!=0) {
			fmt=new SimpleDateFormat("ss��SSS����");
		}
		else{
			fmt=new SimpleDateFormat("SSS����");
		}
		return fmt.format(dif);
	}
}
