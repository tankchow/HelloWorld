package zlh.test.callback;

/**
 * �����С�� ʵ����һ���ص��ӿ�CallBack���൱��----->����һ
 */

// public class Wang implements ICallBack {
public class Wang {
	/**
	 * С���������� �൱��----->������
	 */
	private Li li;

	/**
	 * С���Ĺ��췽��������С�������
	 * 
	 * @param li
	 */
	public Wang(Li li) {
		this.li = li;
	}

	/**
	 * С��ͨ���������ȥ��С�������
	 * 
	 * @param question
	 *            ����С��Ҫ�ʵ�����,1 + 1 = ?
	 */
	public void askQuestion(final String question) {
		System.out.println("С���ʵ�����--->" + question);
		// //ͬ����ʽ
		// try {
		// li.executeMessage(Wang.this, question);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// ������һ���߳̾����첽��
		new Thread(new Runnable() {
			@Override
			public void run() {
				// С������С���еķ�����������ע��ص��ӿ� ����൱��A�����B�ķ���C
				try {
					// li.executeMessage(Wang.this, question);
					li.executeMessage(Wang.this, "callBackFunc", question);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		// С����������ҵ��绰��ȥ�������������ˣ����ȥ��
		play();
	}

	public void play() {
		System.out.println("��Ҫ���ȥ��");
	}

	/**
	 * С��֪���𰸺���ô˷�������С����������ν��С���Ļص�����
	 */
	//@Override
	public void callBackFunc(String result) {
		System.out.println("С�����С���Ĵ���--->" + result);
	}

	public void stop() {
		li.stopFlag = true;
	}

}
