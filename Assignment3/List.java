public interface List<T>
{
	public void add(T t) throws ListException;
	public T delete() throws ListException;
}