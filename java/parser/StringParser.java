package parser;
/**
 * Created by mayinjian@baidu.com on 2018/4/23.
 */
public class StringParser implements CommonParser<String> {

    private String result;

    public StringParser() {
    }

    public StringParser(String result) {
        this.result = result;
    }

    @Override
    public String parse(String readIn) {
        setResult(readIn);
        return getResult();
    }

    @Override
    public String getResult() {
        return result;
    }

    @Override
    public void setResult(String result) {
        this.result = result;
    }
}
