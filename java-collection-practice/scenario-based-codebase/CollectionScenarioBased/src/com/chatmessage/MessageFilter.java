package com.chatmessage;

public interface MessageFilter<T>{

	boolean allow(T msg);
}
