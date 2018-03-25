import java.util.AbstractList;
import java.util.Collection;
import java.util.function.Predicate;

public class ArrayListWithoutRemove<T> extends AbstractList {

    private final int DEFAULT_CAPACITY = 16;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int size = 0;

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("This array doesn't support removing elements");
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException("This array doesn't support removing elements");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("This array doesn't support removing elements");
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("This array doesn't support removing elements");
    }

    @Override
    public boolean removeIf(Predicate filter) {
        throw new UnsupportedOperationException("This array doesn't support removing elements");
    }
}
