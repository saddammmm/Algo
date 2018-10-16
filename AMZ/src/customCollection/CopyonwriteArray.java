package customCollection;

import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

public class CopyonwriteArray<E> {

	private volatile transient Object[] array;
	final transient ReentrantLock lock = new ReentrantLock();
	//CyclicBarrier

	public static void main(String[] args) {


	}

	public CopyonwriteArray()
	{
		setArray(new Object[0]);
	}
	final void setArray(Object[] paramArrayOfObject)
	{
		array = paramArrayOfObject;
	}
	public boolean add(E paramE)
	{
		ReentrantLock localReentrantLock = lock;
		localReentrantLock.lock();
		try
		{
			Object[] arrayOfObject1 = getArray();
			int i = arrayOfObject1.length;
			Object[] arrayOfObject2 = Arrays.copyOf(arrayOfObject1, i + 1);
			arrayOfObject2[i] = paramE;
			setArray(arrayOfObject2);
			boolean bool = true;
			return bool;
		}
		finally
		{
			localReentrantLock.unlock();
		}
	}
	final Object[] getArray()
	{
		return array;
	}
	public E get(int paramInt)
	{
		return (E)get(getArray(), paramInt);
	}
	private E get(Object[] paramArrayOfObject, int paramInt)
	{
		return (E)paramArrayOfObject[paramInt];
	}

}
