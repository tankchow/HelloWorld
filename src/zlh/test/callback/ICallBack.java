package zlh.test.callback;
//参考网页  http://blog.csdn.net/xiaanming/article/details/8703708/
/*
 以前不理解什么叫回调，天天听人家说加一个回调方法啥的，心里想我草，什么叫回调方法啊？
 然后自己就在网上找啊找啊找，找了很多也不是很明白，现在知道了，所谓回调：
 就是A类中调用B类中的某个方法C，然后B类中反过来调用A类中的方法D，D这个方法就叫回调方法，
 这样子说你是不是有点晕晕的，其实我刚开始也是这样不理解，看了人家说比较经典的回调方式：
Class A实现接口CallBack callback——背景1
class A中包含一个class B的引用b ——背景2
class B有一个参数为callback的方法f(CallBack callback) ——背景3
A的对象a调用B的方法 f(CallBack callback) ——A类调用B类的某个方法 C
然后b就可以在f(CallBack callback)方法中调用A的方法 ——B类调用A类的某个方法D
大家都喜欢用打电话的例子，好吧，为了跟上时代，我也用这个例子好了，我这个例子采用异步加回调
有一天小王遇到一个很难的问题，问题是“1 + 1 = ?”，就打电话问小李，小李一下子也不知道，就跟小王说，等我办完手上的事情，就去想想答案，小王也不会傻傻的拿着电话去等小李的答案吧，于是小王就对小李说，我还要去逛街，你知道了答案就打我电话告诉我，于是挂了电话，自己办自己的事情，过了一个小时，小李打了小王的电话，告诉他答案是2
 */

public interface ICallBack {
	/**
	 * 这个是小李知道答案时要调用的函数告诉小王，也就是回调函数
	 * 
	 * @param result
	 *            是答案
	 */
	public void callBackFunc(String result);
}
