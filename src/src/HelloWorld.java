package src;

/**
 * �����ҵĵ�һ��java���� <br>
 * �@�����HelloWorld <br>
 * �yԇ�õ�<br>
 * 
 * @author ZhouLinhua <br>
 */
public class HelloWorld {
	public static void main(String[] args) {


//		//ö�ٲ���
//		System.out.println(MyColorsEnum.RED.value());
		
//		// lambda���ʽ����
//		 LambdaTest.normalFunc1();
//		 LambdaTest.lambdaFunc1();

//		// �������÷�
//		ClassTest anonymousClassTest = new ClassTest();
//		int sum = anonymousClassTest.add(1, 2);
//		anonymousClassTest = new ClassTest() {
//			int add(int x, int y) {
//				String sum = Integer.toString(x) + Integer.toString(y);
//				return Integer.parseInt(sum);
//			}
//		};
//		int sum1 = anonymousClassTest.add(1, 2);
//		int dif = anonymousClassTest.sub(5, 2, 1);

//		// ������ĳ�lambda���ʽ
//		int sum2 = lambdaFun((int x, int y) -> {
//			return x + y;
//		}, 4, 5);
//		Adder adder = (x, y) -> x + y + x + y;
//		int sum3 = adder.add(4, 5);
//		System.out.println(sum + "|" + sum1 + "|" + dif + "|" + sum2 + "|" + sum3);
		
		//lambda���ʽ���������ô���lambda���ʽ
		//Person[] people = { new Person("zhangsan", 22), new Person("lisi", 39) };
		// Comparator<Person> byName = Comparator.comparing(p -> p.getAge());
		// Arrays.sort(people, byName);				
//		List<Person> listPerson = new ArrayList<Person>();
//		listPerson.add(new Person("wangwu", 34));
//		listPerson.add(new Person("xiaoxiao", 23));
//		listPerson.sort(Comparator.comparing(p -> p.getAge()));
//		listPerson.sort(Comparator.comparing(Person::getName));

		System.out.println("Hello World!");

	}

	
	static int lambdaFun(Adder value, int x, int y) {
		return value.add(x, y);
	}

	/**
	 * �ӷ������������������
	 * 
	 * @param i
	 *            ����
	 * @param j
	 *            ������
	 * @return i+j ��
	 */
	public int add(int i, int j) {
		return i + j;

	}

	/**
	 * �����������
	 * 
	 * @param i
	 *            ����
	 * @param j
	 *            ������
	 * @return ��
	 */
	public int multiply(int i, int j) {
		return i * j;
	}

}
