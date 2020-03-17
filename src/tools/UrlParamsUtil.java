package tools;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * url解析工具类
 */
public class UrlParamsUtil {

    public static void main(String []args){
//        parseParmas("alipay_sdk=alipay-sdk-php-20180705&app_id=2019031963583627&biz_content=%7B%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%2C%22body%22%3A%22%E3%80%90%E5%90%8D%E5%B8%88%E5%A5%BD%E8%AF%BE%E3%80%91%E4%B8%80%E8%8A%82%E8%AF%BE%E6%90%9E%E5%AE%9A%E8%AF%BB%E5%90%8E%E7%BB%AD%E5%86%99%E7%AD%891%E9%97%A8%E8%AF%BE%22%2C%22subject%22%3A%22%E3%80%90%E5%90%8D%E5%B8%88%E5%A5%BD%E8%AF%BE%E3%80%91%E4%B8%80%E8%8A%82%E8%AF%BE%E6%90%9E%E5%AE%9A%E8%AF%BB%E5%90%8E%E7%BB%AD%E5%86%99%E7%AD%891%E9%97%A8%E8%AF%BE%22%2C%22total_amount%22%3A1%2C%22out_trade_no%22%3A%22alipay1577463816291943226641%22%2C%22time_expire%22%3A%222019-12-28+00%3A37%3A50%22%2C%22extend_params%22%3A%7B%22sys_service_provider_id%22%3A%222088021110110177%22%7D%7D&charset=UTF-8&format=json&method=alipay.trade.app.pay¬ify_url=https%3A%2F%2Fwww.zybang.com%2Fpay%2Fapi%2Falipaynotify&sign_type=RSA2&timestamp=2019-12-28+00%3A23%3A36&version=1.0&sign=s1kfYtSi8w6Sc8pt2igxZ20a%2BqLe2dN3IXuDVU%2Fcu1mMwnSUEyFPeJaUHPMGkR8OjCcABRIVcxHpK1FQSuhvzYFMbXLdZr93LTSWFtVMGHiFMzGUbSLSMsa%2F%2FK8JM1BCZdgpDKCnfCsYhrsefACyA6lOXQB4HQ8hCssB1OXvSXYF0wCqWEQ%2FFdadwXVVmB0O34rAm0TmOEJQC31KkC2nsi4E8ZdZ6hD2Jd2yJ2DnrCJpvoK%2FFLBEbD4nUJKAQotuRUHiH3SVx7i4nLsrshFl%2Bxf%2Fzp54rp13quLHFx4YScskJmcnrTt67x7uOGgIZy1gEHK1nSKoftAtpTHESikeuQ%3D%3D");
//        parseParmas(" _input_charset=\"utf-8\"&body=\"【2020寒】二年级数学同步提升班（全国）等5门课\"&it_b_pay=\"15d\"&notify_url=\"https://www.zybang.com/pay/api/alipay\"&out_trade_no=\"alipay1577677317201463587427\"&partner=\"2088021110110177\"&payment_type=\"1\"&seller_id=\"121058668@qq.com\"&service=\"mobile.securitypay.pay\"&subject=\"【2020寒】二年级数学同步提升班（全国）等5门课\"&total_fee=\"1718\"&sign=\"AYsHT23biPzXfES1TJ5Nx1GW5YRIpa5zfuuwzM3FP1Rg%2BVQCqmDjkqm2ig7UibX6OOrYlFPa6y%2BjFRlP1kr5vbix%2BpyCHd0lGPLoO29n1x8%2BAkT7De1TtpmZnUaptiKU9W1M8nt49HYwFohmGxdf%2F635lcvAojn%2FdeK0726t5aY%3D\"&sign_type=\"RSA\"");

        //  parseParmas("alipays://platformapi/startapp?appId=60000157&appClearTop=false&startMultApp=YES&sign_params=biz_content%3d%257B%2522access_params%2522%253A%257B%2522channel%2522%253A%2522ALIPAYAPP%2522%257D%252C%2522external_agreement_no%2522%253A%2522beijignditie_1%2522%252C%2522identity_params%2522%253A%257B%2522cert_no%2522%253A%2522610402196908019453%2522%252C%2522user_name%2522%253A%2522jbuflp%2522%257D%252C%2522personal_product_code%2522%253A%2522CYCLE_PAY_AUTH_P%2522%252C%2522sign_scene%2522%253A%2522INDUSTRY%257CMETRO%2522%252C%2522zm_auth_params%2522%253A%257B%2522buckle_app_id%2522%253A%25221001164%2522%252C%2522buckle_merchant_id%2522%253A%2522268820000000414397785%2522%257D%257D%26sign%3dCxxysLRx0P%252FdEuSTw%252FxsH%252ButBXMDto5ez2fvtg5NmtxAhbp45BIUJfjM%252BKRsqNMTSPqtTXuOWxieUvFxTHA9aodPpc7Wbjx%252F1RUI0sT%252FYJI34PH2Xv0qtCMBT4wunP3J2ZKYByVNRKRGZ0etb0LuhuxPikSyQy8qKn%252FGsXQJ04c%253D%26timestamp%3d2017-06-29%2b21%253A06%253A02%26sign_type%3dRSA%26charset%3dUTF-8%26app_id%3d2017060101317939%26method%3dalipay.user.agreement.page.sign%26version%3d1.0");

//        System.out.println("h5签约");
//        parseParmas("https://openapi.alipay.com/gateway.do?alipay_sdk=alipay-sdk-php-20180705&app_id=2019021963235967&biz_content=%7B%22product_code%22%3A%22CYCLE_PAY_AUTH%22%2C%22personal_product_code%22%3A%22CYCLE_PAY_AUTH_P%22%2C%22external_agreement_no%22%3A%222157770758687110%22%2C%22sign_scene%22%3A%22INDUSTRY%7CEDU%22%2C%22access_params%22%3A%7B%22channel%22%3A%22ALIPAYAPP%22%7D%2C%22period_rule_params%22%3A%7B%22period_type%22%3A%22DAY%22%2C%22period%22%3A30%2C%22single_amount%22%3A%2215.00%22%2C%22execute_time%22%3A%222019-12-30%22%7D%7D&charset=UTF-8&format=json&method=alipay.user.agreement.page.sign¬ify_url=https%3A%2F%2Fwww.zybang.com%2Fpay%2Fapi%2Falicyclecontract%3Fappchannel%3Dhomework&return_url=homework%3A%2F%2Fcom.baidu.homework%2Fweb%3Furl%3Dhttps%3A%2F%2Fh5.zybang.com%2Fplat%2Fapp-vue%2FvipCenter.html%3FhideNativeTitleBar%3D1&sign=QhF1cfheqyCZyEdp1Gu7aElQvaOhfO1HXd38k2IZfiuLvufGzyCW2JI8ROI7Zm0%2Bjf0mURaYZnRhm0lisHn6pDyocbJaIz%2B5oOxzY0FZp0O7qF%2BqKuKHGXKY09M42%2Fe%2FOJ3eWPZ3tqcY15HdE9%2BvNgQxXHHEBu40KURCuEuJF%2BoGbeMQb0S7h0GMCywpxkv1ztOrONFMWOw05AoqAavddCU5DkdhUuCZjgmyqvQ%2BOQ%2BTKQ5jsMNbWpd4cqlyJhw2kNp0IwCuCg4hZzalHjU9%2FnDo3YburEvmrkKJN9uu2M9wT%2BALjVO88fYk6VHqVzWcOYoBJsn38IGk8VTwogchCw%3D%3D&sign_type=RSA2&tamp=2019-12-30+20%3A06%3A29&version=1.0");
//
//        System.out.println("\n\nnative签约");
//        parseParmas("alipays://platformapi/startapp?appId=60000157&appClearTop=false&startMultApp=YES&sign_params=alipay_sdk=alipay-sdk-php-20180705&app_id=2019021963235967&biz_content=%7B%22product_code%22%3A%22CYCLE_PAY_AUTH%22%2C%22personal_product_code%22%3A%22CYCLE_PAY_AUTH_P%22%2C%22external_agreement_no%22%3A%222157734853720719%22%2C%22sign_scene%22%3A%22INDUSTRY%7CEDU%22%2C%22access_params%22%3A%7B%22channel%22%3A%22ALIPAYAPP%22%7D%2C%22period_rule_params%22%3A%7B%22period_type%22%3A%22DAY%22%2C%22period%22%3A30%2C%22single_amount%22%3A%2215.00%22%2C%22execute_time%22%3A%222019-12-30%22%7D%7D&charset=UTF-8&format=json&method=alipay.user.agreement.page.sign&notify_url=https%3A%2F%2Fwww.zybang.com%2Fpay%2Fapi%2Falicyclecontract%3Fappchannel%3Dhomework&return_url=homework%3A%2F%2Fcom.baidu.homework%2Fweb%3Furl%3Dhttps%3A%2F%2Fh5.zybang.com%2Fplat%2Fapp-vue%2FvipCenter.html%3FhideNativeTitleBar%3D1&sign=Ujg7unTJ8tDHBMhZ6OAJVLP3LzQpJVDvTcv1SFVY9N4r%2BalPe%2BqLVyrWmpXmhXRy66Kpo%2BvKJlIluvEBX3XfMoK%2Bk2PVtFTgxhahPE7iP3PQ6nPmLBTa5ObZbVn3EV7hccRVRJrCpFP1SUNrJcEs6itXfr%2BBM7i7q%2FFtZpmUcrhtls1joaBT4kvrB8btc7%2BaP3VUoGKbEuLlDg04T8Mnz7kCev6zdizCEVlN4OGzKmoTRmHyR2s7rsg133seWpD5d0wsS55kvWLZZL%2B2jJaolBQLXPeywevF%2BavAE5Th60OG3S4qU3p0yCzs99OybyG9KfLD7yu701p4FvLU6QUZRA%3D%3D&sign_type=RSA2&timestamp=2019-12-30+19%3A15%3A05&version=1.0");

        System.out.println("收银台签约");
        parseParmas("alipays://platformapi/startapp?appId=60000157&appClearTop=false&startMultApp=YES&sign_params=alipay_sdk%3Dalipay-sdk-php-20180705%26app_id%3D2019021963235967%26biz_content%3D%257B%2522product_code%2522%253A%2522CYCLE_PAY_AUTH%2522%252C%2522personal_product_code%2522%253A%2522CYCLE_PAY_AUTH_P%2522%252C%2522external_agreement_no%2522%253A%25222157777877786911%2522%252C%2522sign_scene%2522%253A%2522INDUSTRY%257CEDU%2522%252C%2522access_params%2522%253A%257B%2522channel%2522%253A%2522ALIPAYAPP%2522%257D%252C%2522period_rule_params%2522%253A%257B%2522period_type%2522%253A%2522DAY%2522%252C%2522period%2522%253A%252230%2522%252C%2522single_amount%2522%253A%25220.15%2522%252C%2522execute_time%2522%253A%25222020-01-03%2522%257D%257D%26charset%3DUTF-8%26format%3Djson%26method%3Dalipay.user.agreement.page.sign%26notify_url%3Dhttps%253A%252F%252Fcontract-docker.suanshubang.com%252Fpay%252Fapi%252Falicyclecontract%253Fappchannel%253Dhomework%26sign%3DP3bdTDXUUA%252Fl3AZI1UTqgG9YyfB65Aviu%252F6dImlcmTrxboB%252BdQRK0YtO%252BJ17%252FHwgXyYMeYuMF5aB1xV0fRYIWfL1Co3YmyJjzreOecif3apoIke9bgrwqwkdz4c8Fq6LGmk3332NzKQx3C46GmXCdbqaAahOnYfV3gOIxVe1fZ5uCMX9wBFTuz%252FN%252BNH4ujf7KTAx%252FlxYiXSLB5VZt39hFgtGZvF3%252BWAREED02p0UXrTDz84l21Ef5CrKNO5d7P49ONJvMQ7urjQR4pEYSMErZJPR4oO0Xqafc6d4xgPUJ4Ed6g073iU0CwP9dluKgmBZUGSy4haITPlallDwhDYCLg%253D%253D%26sign_type%3DRSA2%26timestamp%3D2020-01-03%2B16%253A47%253A27%26version%3D1.0%22%2C%22code%22%3A10000%7D");
       // parseParmas("alipays://platformapi/startapp?appId=60000157&appClearTop=false&startMultApp=YES&sign_params=alipay_sdk%3Dalipay-sdk-php-20180705%26app_id%3D2019021963235967%26biz_content%3D%257B%2522product_code%2522%253A%2522CYCLE_PAY_AUTH%2522%252C%2522personal_product_code%2522%253A%2522CYCLE_PAY_AUTH_P%2522%252C%2522external_agreement_no%2522%253A%25222157777877786911%2522%252C%2522sign_scene%2522%253A%2522INDUSTRY%257CEDU%2522%252C%2522access_params%2522%253A%257B%2522channel%2522%253A%2522ALIPAYAPP%2522%257D%252C%2522period_rule_params%2522%253A%257B%2522period_type%2522%253A%2522MONTH%2522%252C%2522period%2522%253A2%252C%2522single_amount%2522%253A%25220.15%2522%252C%2522execute_time%2522%253A%25222020-01-06%2522%257D%257D%26charset%3DUTF-8%26format%3Djson%26method%3Dalipay.user.agreement.page.sign%26notify_url%3Dhttps%253A%252F%252Fcontract-docker.suanshubang.com%252Fpay%252Fapi%252Falicyclecontract%253Fappchannel%253Dhomework%26sign%3DjCiISkWmFvv%252B7c8PEgPWQHGpG%252FUXXvaG5MKeyR9%252BdxTvOnUiS6a2Qb8H1rg0VnmaLQkiqXRRMBLk%252F4igQNs8yXV%252FSKK7pHj6lkCgppK62Tz%252F%252BwUEDS5dGTdzxBp%252FC80qER688EvyVSUxrn1Pjx59s%252F48WDeYHQAH1sEdy9fIfS05NPTGKYv95tUNWco%252Ff2NEeH8gnJciCpSnh7pTHcYdH0MYQLwIRkXys5%252B7QLLkv71MxgreEXkBXF36R3okTqtUr4yjf48ffEV397%252BDJJHoN%252BXLiCZwffSdVRtnX86D7snrhC0eJcaGpbgDcrANA9C67qNs3f0qWscP1Ys2gkaKSw%253D%253D%26sign_type%3DRSA2%26timestamp%3D2020-01-03%2B15%253A15%253A38%26version%3D1.0%22%2C%22code%22%3A10000%7D");


        System.out.println("\n\n线上签约");
        parseParmas("alipays://platformapi/startapp?appId=60000157&appClearTop=false&startMultApp=YES&sign_params=alipay_sdk%3Dalipay-sdk-php-20180705%26app_id%3D2019021963235967%26biz_content%3D%257B%2522product_code%2522%253A%2522CYCLE_PAY_AUTH%2522%252C%2522personal_product_code%2522%253A%2522CYCLE_PAY_AUTH_P%2522%252C%2522external_agreement_no%2522%253A%25222157734853720719%2522%252C%2522sign_scene%2522%253A%2522INDUSTRY%257CEDU%2522%252C%2522access_params%2522%253A%257B%2522channel%2522%253A%2522ALIPAYAPP%2522%257D%252C%2522period_rule_params%2522%253A%257B%2522period_type%2522%253A%2522DAY%2522%252C%2522period%2522%253A30%252C%2522single_amount%2522%253A%252215.00%2522%252C%2522execute_time%2522%253A%25222020-01-03%2522%257D%257D%26charset%3DUTF-8%26format%3Djson%26method%3Dalipay.user.agreement.page.sign%26notify_url%3Dhttps%253A%252F%252Fwww.zybang.com%252Fpay%252Fapi%252Falicyclecontract%253Fappchannel%253Dhomework%26return_url%3Dhomework%253A%252F%252Fcom.baidu.homework%252Fweb%253Furl%253Dhttps%253A%252F%252Fh5.zybang.com%252Fplat%252Fapp-vue%252FvipCenter.html%253FhideNativeTitleBar%253D1%26sign%3DJOXEYgg1l%252BDMPPWlvbT2m00Cb9DCIuPXmDLlcaTof8Z6oUmWioGwHPxSrVTXAchcFJcvzMYSt2o36%252FQK9hSGmdW9X%252FDYT4%252B%252BL2GlvMOgrKj0%252F2S6sZFUXpXuZiCryD5dn%252BqcMAkXf6EXSBRT%252F1qJi%252Fpg%252BcAKXPuRZMoAd7YKE%252FfyiUcO4hFQtu26s4x2UkgvX59eozdAKPPQQ4ItTW2WvOQ0sTzDiZJkAxWQaUiT4M1t6LmnFct6bzWrYklANpzZA9YtcG%252F2h6sE8EYIFRohrAStB7KnBIFSiOMClkADIEyN0%252BStO30fQ9VlMMCNsstRLv5hD7eQSr9fUoFf9uXmIQ%253D%253D%26sign_type%3DRSA2%26timestamp%3D2020-01-03%2B15%253A11%253A53%26version%3D1.0");
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
        //在解析前，进行两次解码
        if(isUrlDecode(url)){
            url = urlDecode(url);
        }
        if(isUrlDecode(url)){
            url = urlDecode(url);
        }
        //开始解析字段
        String param = url;
        if(url.contains("?")){
            String[] urls = url.split("\\?");
            System.out.println("域名： "+urls[0]);
            param = urls[1];
        }
        String  []pars = param.split("&");
        for(int i=0;i<pars.length;i++){
            String aParm = pars[i];
            if(aParm.contains("=")){
                String []a = aParm.split("=");
                String pa = aParm.substring(0,a[0].length());
                String va = aParm.substring(a[0].length()+1,aParm.length());
                //如果进行编码了，则进行解码
                if(isUrlDecode(va)){
                    va = urlDecode(va);
                    //再检查一下
                    if(isUrlDecode(va)){
                        va = urlDecode(va);
                    }
                }
                print(pa, jsonParse(va));
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
