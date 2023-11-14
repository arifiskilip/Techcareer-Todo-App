package techcareer.todoAppProject.core.utilities.results;

import lombok.Getter;

@Getter
public abstract class DataResult<T> extends Result{
    private T data;
    public DataResult(T data,boolean success) {
        super(success);
        this.data = data;
    }

    public DataResult(T data,boolean success, String message) {
        super(success, message);
        this.data = data;
    }
}
