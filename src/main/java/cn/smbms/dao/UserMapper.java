package cn.smbms.dao;

import cn.smbms.pojo.User;

public interface UserMapper {
	public User getLoginUser(String userCode);
}
