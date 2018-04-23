package parser;
/**
 * Created by mayinjian@baidu.com on 2018/4/23.
 */
public interface CommonParser<T> {

    public T parse(String readIn);

    public T getResult();

    public void setResult(T result);

}
