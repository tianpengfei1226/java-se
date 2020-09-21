package com.tpf;

/**
 * <p> </p>
 *
 * @author : tianpengfei
 * @version :  TestTest.java,v 1.0, 2019/9/20-15:32 tianpengfei Exp $
 */
public class TestTest {
	public static void main(String[] args) {

		/**
		 * public static void main(java.lang.String[]);
		 *     Code:
		 *        0: iconst_0				0(int)值入栈。
		 *        1: istore_1				将栈顶int类型值保存到局部变量1中
		 *        2: iload_1				从局部变量1中装载int类型值入栈
		 *        3: iinc          1, 1		将整数值constbyte加到indexbyte指定的int类型的局部变量中
		 *        6: istore_1				将栈顶int类型值保存到局部变量1中
		 *       12: return
		 * }
		 */
		int i =0;
		i = i++;

		/**
		 *   public static void main(java.lang.String[]);
		 *     Code:
		 *        0: iconst_0				0(int)值入栈。
		 *        1: istore_1               将栈顶int类型值保存到局部变量1中。
		 *        2: iload_1 				从局部变量1中装载int类型值入栈。
		 *        3: iconst_5				5(int)值入栈。
		 *        4: if_icmpge     13       若栈顶两int类型值前大于等于后则跳转。
		 *        7: iinc          1, 1     将整数值constbyte加到indexbyte指定的int类型的局部变量中。
		 *       10: goto          2		无条件跳转到指定位置。
		 *       13: return
		 */
//		for (int j =0; j<5;j++) {
//		}

//		int i = 0;
//		for (int j =0; j<5;j++) {
//			i = i++;
//			System.out.println("for  " + i);
//		}
//			System.out.println(">>>  " + i);
//		String [] 篮子 = {"green1","green2","green3","green4","green5","red1","red2","red3","red4","red5", "red6", "red1","red2","red3","red4","red5", "red6"};

//		Map list  = new HashMap();

		/*for (int i = 0; i< 5 ; i++) {

			for (int j = 0; j<6; j++) {

				for (int x = 0; x<6; x++) {

				}
			}
		}*/
	}
}
