package task;

@FunctionalInterface
public interface Task<T> {

    boolean run(T t);
}
