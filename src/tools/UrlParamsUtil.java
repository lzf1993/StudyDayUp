package tools;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * url解析工具类
 */
public class UrlParamsUtil {

    public static void main(String []args){
        parseParmas("alipay_sdk=alipay-sdk-php-20180705&app_id=2019031963583627&biz_content=%7B%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22body%22%3A%22%E3%80%90%E5%90%8D%E5%B8%88%E5%A5%BD%E8%AF%BE%E3%80%91%E4%B8%80%E8%8A%82%E8%AF%BE%E6%90%9E%E5%AE%9A%E8%AF%BB%E5%90%8E%E7%BB%AD%E5%86%99%E7%AD%891%E9%97%A8%E8%AF%BE%22%2C%22subject%22%3A%22%E3%80%90%E5%90%8D%E5%B8%88%E5%A5%BD%E8%AF%BE%E3%80%91%E4%B8%80%E8%8A%82%E8%AF%BE%E6%90%9E%E5%AE%9A%E8%AF%BB%E5%90%8E%E7%BB%AD%E5%86%99%E7%AD%891%E9%97%A8%E8%AF%BE%22%2C%22total_amount%22%3A1%2C%22out_trade_no%22%3A%22alipay1577463816291943226641%22%2C%22time_expire%22%3A%222019-12-28+00%3A37%3A50%22%2C%22extend_params%22%3A%7B%22sys_service_provider_id%22%3A%222088021110110177%22%7D%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay¬ify_url=https%3A%2F%2Fwww.zybang.com%2Fpay%2Fapi%2Falipaynotify&sign_type=RSA2&timestamp=2019-12-28+00%3A23%3A36&version=1.0&sign=s1kfYtSi8w6Sc8pt2igxZ20a%2BqLe2dN3IXuDVU%2Fcu1mMwnSUEyFPeJaUHPMGkR8OjCcABRIVcxHpK1FQSuhvzYFMbXLdZr93LTSWFtVMGHiFMzGUbSLSMsa%2F%2FK8JM1BCZdgpDKCnfCsYhrsefACyA6lOXQB4HQ8hCssB1OXvSXYF0wCqWEQ%2FFdadwXVVmB0O34rAm0TmOEJQC31KkC2nsi4E8ZdZ6hD2Jd2yJ2DnrCJpvoK%2FFLBEbD4nUJKAQotuRUHiH3SVx7i4nLsrshFl%2Bxf%2Fzp54rp13quLHFx4YScskJmcnrTt67x7uOGgIZy1gEHK1nSKoftAtpTHESikeuQ%3D%3D");
        parseParmas(" _input_charset=\"utf-8\"&body=\"【2020寒】二年级数学同步提升班（全国）等5门课\"&it_b_pay=\"15d\"&notify_url=\"https://www.zybang.com/pay/api/alipay\"&out_trade_no=\"alipay1577677317201463587427\"&partner=\"2088021110110177\"&payment_type=\"1\"&seller_id=\"121058668@qq.com\"&service=\"mobile.securitypay.pay\"&subject=\"【2020寒】二年级数学同步提升班（全国）等5门课\"&total_fee=\"1718\"&sign=\"AYsHT23biPzXfES1TJ5Nx1GW5YRIpa5zfuuwzM3FP1Rg%2BVQCqmDjkqm2ig7UibX6OOrYlFPa6y%2BjFRlP1kr5vbix%2BpyCHd0lGPLoO29n1x8%2BAkT7De1TtpmZnUaptiKU9W1M8nt49HYwFohmGxdf%2F635lcvAojn%2FdeK0726t5aY%3D\"&sign_type=\"RSA\"");
    }


    /**
     * 解析url
     * @param url 原始url
     */
    public static void parseParmas(String url){
        if(url == null || "".equals(url)){
            System.out.println("格式不正确....  ");
            return;
        }
        System.out.println("\n开始解析....  ");
        String param = url;
        if(url.contains("\\?")){
            param = url.substring(0,url.indexOf("\\?"));
        }
        String  []pars = param.split("&");
        for(int i=0;i<pars.length;i++){
            String aParm = pars[i];
            if(aParm.contains("=")){
                String []a = aParm.split("=");
                if(isUrlDecode(a[1])){
                    String decodeUrl = urlDecode(a[1]);
                    print(a[0], jsonParse(decodeUrl));
                }else {
                    print( a[0] , a[1]);
                }
            }
        }
    }


    /**
     * 打印
     * @param key key
     * @param value 值
     */
    private static void print(String key, String value){
        if(key.length()<20){
            for(int i=key.length();i<20;i++){
                key = key +" ";
            }
        }
        System.out.println("参数： " +key + " 值： " + value);
    }


    /**
     * json解析
     */
    private static String jsonParse(String params){
        if(params == null || "".equals(params)){
            return "";
        }
        if(params.startsWith("{") && params.endsWith("}")){
            StringBuilder s = new StringBuilder();
            for(int i=0;i<33;i++){
                s.append(" ");
            }
            params =  params.replaceFirst("\\{","{\n"+s.toString());
            params =  params.substring(0,params.length()-1);
            params = params +"\n" + s.toString() +"}";
           return params.replaceAll(",","\n"+s.toString());
        }
        return params;
    }


    /**
     * 判断是否decode
     * 对一个url如果decode后，前后一致，则说明没有被 encode ,否则说明被decode了
     * @param url 原始url
     */
    public static boolean isUrlDecode(String url){
        try {
            String urlDecode = URLDecoder.decode(url,"UTF-8");
            //前后一致，则说明没有被decode
            if(urlDecode.equals(url)){
                return false;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return true;
    }


    /**
     * 进行decode解码
     * @param url 原始url
     */
    public static String urlDecode(String url){
        try {
            return URLDecoder.decode(url,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return url;
    }
}
