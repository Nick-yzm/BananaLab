/*
 * @author tonemy
 *  Date: 2019-7-19 
 *  ���ܣ�	1��ʹ��int[] �洢
 *  			2�����ջ���ˣ�����2����
 *  			3�����ջΪ�� pop �� peak ���쳣��
 *  ��ҵ��
 *  1��StackImpl ʵ�� Stack Ϊʵ��һ��ջ��Ҫ��洢�ĽṹΪ int[] ���飬Ŀ��Ϊ�����װ������
 *  	��װ���⣺ StackImpl  ������ջ�Ĳ������������ݣ������������ڲ�ʵ�ַ���ʱ��Ҫ�ı���Ӧ�����ݣ�
 *  			����ֻ�ṩ�ӿڵķ�����
 *  2��StackWithLogImpl ʵ��һ��ջ���̳�StackImpl�����ڴ���ǰ������־��Ŀ��Ϊ����̳�������
 *  	�̳����⣺ ������������Ĺ�ϵ�����ṩ��Ϣ�ĳ�Ϊ���࣬�ṩ��Ϣ�ĳ�Ϊ���ࡣ
 *  			�ô����������Զ��̳и���ķ����������������ʱ�����贴���������
 *  			������ �����븸�������Ժܸߣ��������������ʵ�֣����಻�ܸı丸��Ľӿڣ�
 *  3���ش�������⼸�д���ı����Լ������ԭ��Ϊʲôͬһ���ӿڻ��в�ͬ�ı��֣�����ôʵ�ֵ�
 *  		�������˶�̬�е�һ�ֱ�����ʽ---��д��override������д�����˲�ͬ��Ĺ�ϵ---ʵ�ֻ�̳У�
 *  	��ȻStackImpl��ʵ��) ��StackWithLogImpl���̳У���ͬһ���ӿڣ�����Main�����У�����ڽӿ���˵��
 *  	���õ����������������ͬ�����ã�����ͬ���ķ�����������������Ĳ�ͬ�����ֳ���ͬ����Ϊ��
 * 		Ҳ����˵������StackImpl��ʵ���˽ӿڵĹ��ܣ�����Main�е��õ���StackImpl�࣬�����ֳ������ʵ��
 *  	�ķ�������Ϊ��ͬ����StackWithLogImpl�������˴�ӡ�������Ը��������д������Main�е��õ���
 *  	StackWithLogImpl�࣬�����ֳ������ʵ�� �ķ�������Ϊ���Ӷ�������־�������
 *  
  */
public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Stack stack1 = new StackImpl();
		Stack stack2 = new StackWithLogImpl();
		stack1.push(2);
		stack2.push(2);
	}

}