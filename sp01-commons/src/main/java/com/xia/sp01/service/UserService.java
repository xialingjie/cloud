package com.xia.sp01.service;

import com.xia.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id,Integer score);
}
