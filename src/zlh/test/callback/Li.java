package zlh.test.callback;

import java.lang.reflect.Method;

/**
 * �������С�������ش�����
 *
 */
public class Li {

	public boolean stopFlag = false;

	/**
	 * �൱��B���в���ΪCallBack callBack��f()---->������
	 * 
	 * @param callBack
	 * @param question
	 *            С���ʵ�����
	 * @throws InterruptedException
	 */
	// public void executeMessage(ICallBack callBack, String question) throws
	// InterruptedException {
	public void executeMessage(Object callBack, String functionName, String question) throws InterruptedException {
		System.out.println("�յ�С��������--->" + question);
		int count = 0;
		// ��ͣ�ظ��ߴ�
		while (!stopFlag) {
			++count;
			// ģ��С����Լ���������Ҫ�ܳ�ʱ��
			Thread.sleep(1000);
			/**
			 * С������Լ�������֮���뵽�˴���2
			 */
			String result = "����2";

			/**
			 * ���Ǿʹ�绰����С��������С���еķ��� ����൱��B�෴��������A�ķ���D
			 */
			// callBack.callBackFunc("");

			// ʹ�÷���ʵ��
			try {
				Method method = callBack.getClass().getMethod(functionName, String.class);
				method.invoke(callBack, result + "--��" + count + "�λش�");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				stopFlag = true;
				System.out.println("�޷��ҵ�" + callBack + "�����еķ���" + functionName);
				e.printStackTrace();

			}
		}

	}

}
