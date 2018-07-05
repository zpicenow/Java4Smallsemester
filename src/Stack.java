
//����ĳ���Ϊһ������ջ����ʵ��������ջ����
public class Stack {

	private SingleLinkedList list = new SingleLinkedList();

	public boolean empty() {
		return list.getSize()==0;
	}

	public int size() {
		return list.getSize();
	}

    //��ջ����������(��������)��Ҫ��������Ƚ������FILO�ṹ
    public int pop() {
        int top = list.get(size() - 1);
        list.remove(size() - 1);
        return top;
    }

	//���ݽ�ջ����
	public void push(int data) {
		list.add(data);

	}

	//ջ���ݸ���
	public Stack clone() {
		Stack s = new Stack();
		for(int i=0;i<list.getSize();i++) {
			s.list.add(list.get(i));
		}
		return s;
	}

//	public static void main(String[] args) {
//		Stack s1 = new Stack();
//		s1.push(1);
//		s1.push(2);
//		s1.push(3);
//
//		Stack s2 = s1.clone();
//
//		System.out.println(s1.pop());
//		System.out.println(s1.pop());
//		System.out.println(s1.pop());
//
//		System.out.println(s1.size());
//
//	}
}