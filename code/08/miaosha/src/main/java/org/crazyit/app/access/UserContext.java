package org.crazyit.app.access;

import org.crazyit.app.domain.User;

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2022, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 *
 * @author Yeeku.H.Lee kongyeeku@163.com 公众号: fkbooks<br>
 * @version 1.0
 */
public class UserContext
{
	private static final ThreadLocal<User> userHolder = new ThreadLocal<>();

	public static void setUser(User user)
	{
		userHolder.set(user);
	}

	public static User getUser()
	{
		return userHolder.get();
	}
}
