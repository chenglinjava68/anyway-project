package org.anyway.wechat.entity.customer;

/**
 * 发送客服消息基类
 * @author beinfo
 *
 */
public class CustomerBaseMessage {
	/**
	 *  普通用户openid
	 */
	private String touser;
	
	/**
	 * 消息类型
	 */
	private String msgtype;

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
}
