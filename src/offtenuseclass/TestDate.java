package offtenuseclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Date date = new Date(2000);
		System.out.println(date);

		SimpleDateFormat s1 = new SimpleDateFormat("MM��dd��   hhʱmm��ss��");
		String strDate = s1.format(date);
		System.out.println(strDate);

		// new��SimpleDateFormat����
		SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String strDate2=s2.format(new Date());
		System.out.println(strDate2);
		
		try {
			Date date2=s2.parse("2030-04-05 18:18:18");
			System.out.println(date2.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd");
		String time = "2007-10-7";
		Date date3 = s3.parse(time);
        System.out.println("date1: " + date3);
        
        Calendar calendar=new GregorianCalendar(); 
        calendar.setTime(date3);
        
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));  //2019	��һ��
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH)); //3	һ���е���һ��
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR)); //15 һ���еĵڼ���
        
        System.out.println("DATE: " + calendar.get(Calendar.DATE)); //һ�º��е���һ��  9
        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH)); //һ�º��е���һ�� 9
        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR)); //: 99 һ���е���һ��
        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));  //���ڼ� 3
        System.out.println("DAY_OF_WEEK_IN_MONTH: " 
                           + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //2 һ���еĵڶ���
        
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM)); //�����������
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR)); //7
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY)); //19
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE)); //���� 44
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND)); //51 ��
        System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND)); //����995
        
        calendar.set(Calendar.YEAR, 1987);
        calendar.set(Calendar.MONTH, 9);
        calendar.set(Calendar.DATE, 2);
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));  //1987	��һ��
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH)); //9	һ���е���һ��
        System.out.println("DATE: " + calendar.get(Calendar.DATE)); //һ�º��е���һ�� 2
        
        
        

	}

}
