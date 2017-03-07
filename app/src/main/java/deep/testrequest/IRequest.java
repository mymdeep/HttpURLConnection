package deep.testrequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangfei on 17/3/5.
 */
public interface IRequest {
    public String getBaseUrl();
    public String getMethod();
    public IEncrypt getEncrypt();
    public HashMap<String, Object> getParam();
    public Map<String, FilePair> getFilePair();
    public Map<String, String> getHeaders();
}
