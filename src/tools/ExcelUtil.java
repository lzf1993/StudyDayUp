package tools;


import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * excel工具类
 */
public class ExcelUtil {

    public static void excel() throws Exception {
//        //用流的方式先读取到你想要的excel的文件
//        FileInputStream fis=new FileInputStream(new File(System.getProperty("user.dir")+"/src/excel.xls"));
//        //解析excel
//        POIFSFileSystem pSystem=new POIFSFileSystem(fis);
//        //获取整个excel
//        HSSFWorkbook hb=new HSSFWorkbook(pSystem);
//        System.out.println(hb.getNumCellStyles());
//        //获取第一个表单sheet
//        HSSFSheet sheet=hb.getSheetAt(0);
//        //获取第一行
//        int firstrow= sheet.getFirstRowNum();
//        //获取最后一行
//        int lastrow= sheet.getLastRowNum();
//        //循环行数依次获取列数
//        for (int i = firstrow; i < lastrow+1; i++) {
//            //获取哪一行i
//            Row row=sheet.getRow(i);
//            if (row!=null) {
//                //获取这一行的第一列
//                int firstcell= row.getFirstCellNum();
//                //获取这一行的最后一列
//                int lastcell= row.getLastCellNum();
//                //创建一个集合，用处将每一行的每一列数据都存入集合中
//                List<String> list=new ArrayList<>();
//                for (int j = firstcell; j <lastcell; j++) {
//                    //获取第j列
//                    Cell cell=row.getCell(j);
//                    if (cell!=null) {
//                        System.out.print(cell+"\t");
//                        list.add(cell.toString());
//                    }
//                }
//
//                User user=new User();
//                if (list.size()>0) {
//                    user.setUsername(list.get(1));
//                    user.setPassword(list.get(2));
//                }
//                BaseDAO dao=new BaseDAO();
//                dao.save(user);
//                System.out.println();
//            }
//        }
//        fis.close();
    }



}
