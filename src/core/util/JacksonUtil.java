/**
 * @author AUGUST
 * Copyright (C) 2015 - 2020 SHP快易全栈应用开发平台
 */
package core.util;
import java.io.IOException;
import java.io.StringWriter;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
 
public class JacksonUtil {
 
    private static JacksonUtil ju;
    private static JsonFactory jf;
    
    /** The mapper. */
    private static ObjectMapper mapper;
    private JacksonUtil(){}
     
    /**
     * 
     * getInstance:单例实例化. <br/>
     *
     * @author AUGUST
     * @return
     * @since JDK 1.6
     */
    public static JacksonUtil getInstance() {
        if(ju==null){
        	ju = new JacksonUtil();
        }
        return ju;
    }
     
    public static ObjectMapper getMapper() {
        if(mapper==null) {
            mapper = new ObjectMapper();
            //配置jackson不检查json串跟java实体类字段的一一对应
            mapper.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }
        return mapper;
    }
     
    public static JsonFactory getFactory() {
        if(jf==null) jf = new JsonFactory();
        return jf;
    }
     
     
    /**
     * 
    * @Title: obj2json
    * @Description: 把java对象转为json字符串
    * @param @param obj ： java对象
    * @param @return    
    * @return String    
    * @throws
     */
    public String obj2json(Object obj) {
        if(null != obj){
            JsonGenerator jg = null;
            try {
                jf = getFactory();
                mapper = getMapper();
                StringWriter out = new StringWriter();
                jg = jf.createJsonGenerator(out);
                mapper.writeValue(jg, obj);
                return out.toString();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(jg!=null) jg.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return null;
    }
     
    /**
     * 
    * @Title: json2obj
    * @Description: json字符串转换为java对象
    * @param @param json ： json字符串换
    * @param @param clz ： java对象class
    * @param @return    
    * @return Object    
    * @throws
     */
    public <E>E json2obj(String json,Class<E> clz) {
        if(null != json && !"".equals(json.trim())){
            try {
                mapper = getMapper();
                return mapper.readValue(json,clz);
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        return null;
    }
    
    public static void main(String[] args) {
		JacksonUtil jacksonUtil = JacksonUtil.getInstance();
		//test json2obj
		String json = "{\"data\":\"hello\"}";
		Data data = jacksonUtil.json2obj(json, Data.class);
		System.out.println(data.toString());
		
		//test obj2json
		Data data2 = new Data();
		data2.setData("hello world");
		String str = jacksonUtil.obj2json(data2);
		System.out.println(str);
	}
     
}

class Data{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	 
	@Override
	public String toString() {
		return super.toString()+" data: " + data;
	}
		
}

