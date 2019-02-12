package com.puyitou.common.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	/**
	 * 通过参数文件路径，读取excel的里数据
	 * 每一行封装成map，key值从KEY0，KEY1一直累加
	 * 最终的map被添加到list里，返回值为List
	 * @param fileName
	 * @return
	 */
	public static List exportExcelByPath(String fileName){
		List list = null;
		try {
			InputStream myxls = new FileInputStream(fileName);  
			HSSFWorkbook wb     = new HSSFWorkbook(myxls);  
			
			HSSFSheet sheet = wb.getSheetAt(0);       // 第一个工作表  
			
			Iterator it = sheet.iterator();
			list = new ArrayList();
			while(it.hasNext()){
				HSSFRow row = (HSSFRow)it.next();
				Iterator itcell = row.cellIterator();
				Map map = new HashMap();
				int i = 0;
				String temp="";
				while(itcell.hasNext()){
					Object o = itcell.next();
					map.put("KEY"+i, o);
					temp = temp+o;
					i++;
				}
				if(temp.length()>0){
					list.add(map);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 通过参数流，读取excel的里数据
	 * 每一行封装成map，key值从KEY0，KEY1一直累加
	 * 最终的map被添加到list里，返回值为List
	 * @param fileName
	 * @return
	 */
	public static List exportExcelByStream(InputStream inputStream){
		List list = null;
		try {
			HSSFWorkbook wb     = new HSSFWorkbook(inputStream);  
			
			HSSFSheet sheet = wb.getSheetAt(0);       // 第一个工作表  
			
			Iterator it = sheet.iterator();
			int colCount=sheet.getRow(0).getLastCellNum();
			list = new ArrayList();
			while(it.hasNext()){
				HSSFRow row = (HSSFRow)it.next();
				Map map = new HashMap();
				String temp="";
				for(int i=0;i<colCount;i++){
					Object o = row.getCell(i, row.RETURN_NULL_AND_BLANK);
					map.put("KEY"+i, o);
					if(o!=null&&!"".equals(o)){
						temp = temp+o;
					}
				}
				if(temp.length()>0){
					list.add(map);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 取excel第二个工作表封装list返回
	 * @param fileName
	 * @author zhaojingxian
	 * @return
	 */
	public static List exportExcelSheetTwoByStream(InputStream inputStream){
		List list = null;
		try {
			HSSFWorkbook wb     = new HSSFWorkbook(inputStream);  
			
			HSSFSheet sheet = wb.getSheetAt(1);       // 第二个工作表  
			
			Iterator it = sheet.iterator();
			int colCount=sheet.getRow(0).getLastCellNum();
			list = new ArrayList();
			while(it.hasNext()){
				HSSFRow row = (HSSFRow)it.next();
				Map map = new HashMap();
				String temp="";
				for(int i=0;i<colCount;i++){
					Object o = row.getCell(i, row.RETURN_NULL_AND_BLANK);
					map.put("KEY"+i, o);
					if(o!=null&&!"".equals(o)){
						temp = temp+o;
					}
				}
				if(temp.length()>0){
					list.add(map);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * <p>
	 * 兼容07版的excl
	 * </p>
	 * @author zhangjunshuai
	 * @date 2015年1月19日 下午6:58:25
	 * @param inputStream
	 * @return
	 */
	public static List exportExcelByFile(InputStream inputStream){
		List list = null;
		try {
			 Workbook wb = WorkbookFactory.create(inputStream); 
			 Sheet s = wb.getSheetAt(0); 
			Iterator it = s.iterator();
			list = new ArrayList();
			while(it.hasNext()){
				Row row = (Row)it.next();
				Iterator itcell = row.cellIterator();
				Map map = new HashMap();
				int i = 0;
				String temp="";
				while(itcell.hasNext()){
					Object o = itcell.next();
					map.put("KEY"+i, o);
					temp = temp+o;
					i++;
				}
				if(temp.length()>0){
					list.add(map);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 创建表头
	 * @param sheet
	 * @param index
	 * @param headers
	 * @param columnWidths
	 */
	@SuppressWarnings("unused")
	private static void createExcelHeader(Sheet sheet,int index,String[] headers,int[] columnWidths){
		Row headerRow = sheet.createRow(index);
		CellStyle style = sheet.getWorkbook().createCellStyle();
		for(int i=0;i<headers.length;i++){
			Cell headerCell = headerRow.createCell(i);
            headerCell.setCellStyle(style);
            headerCell.setCellValue(headers[i]);
            columnWidths[i] = (headers[i].getBytes().length + 2) * 256;
            sheet.setColumnWidth(i, columnWidths[i]);
		}
	}
	
	/**
	 * 创建表格内容
	 * @param sheet
	 * @param rowIndexBegin
	 * @param columnWidths
	 * @param entities
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	private static void createExcelContent(Sheet sheet, int rowIndexBegin, int[] columnWidths,String[] contentKeys,
            List<Map<String,Object>> entities) throws Exception {
        String content = null;
        for (Map<String,Object> map : entities) {
            Row row = sheet.createRow(rowIndexBegin++);
            for(int j=0;j<contentKeys.length;j++){
            	Cell cell = row.createCell(j);
            	Object value=map.get(contentKeys[j]);
            	value = value == null ? "" : value;
            	if (value instanceof Date) {// 对日期格式进行特殊处理
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    content = sdf.format((Date) value);
                    cell.setCellValue(content);
                } else {
                    content = value.toString();
                    cell.setCellValue(content);
                }
            	int columnWidth = (content.getBytes().length + 2) * 256;
                if (columnWidth > columnWidths[j]) {// 如果实际内容宽度大于对应的表头宽度，则设置为实际内容宽度
                    columnWidths[j] = columnWidth;
                    sheet.setColumnWidth(j, columnWidths[j]);
                }
            }
        }
    }
	/**
	 * 创建excel
	 * @param sheetName
	 * @param columnNames
	 * @param entities
	 * @return
	 * @throws Exception
	 */
	public static HSSFWorkbook createExcel(String sheetName, String[] columnNames,String[] contentKeys, List<Map<String,Object>> entities) throws Exception{
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(sheetName);
        int[] columnWidths = new int[columnNames.length];
        // 创建表头
        createExcelHeader(sheet, 0, columnNames,columnWidths);
        // 填充表内容
        createExcelContent(sheet, 1, columnWidths, contentKeys,entities);
        return wb;
	}
	
 
}
