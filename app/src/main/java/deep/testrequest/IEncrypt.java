package deep.testrequest;

import java.util.Map;

/**
 * Created by wangfei on 17/3/4.
 */
public interface IEncrypt {
    public String encrypt(String urlPath, Map<String, Object> params);
    public String dencrypt();
}
