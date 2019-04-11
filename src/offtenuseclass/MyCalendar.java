package offtenuseclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendar {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("���������ڣ���ʽΪ��2019-3-3��");
		Scanner scanner=new Scanner(System.in);
		String time=scanner.nextLine();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(time);

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);

		int maxDate = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DATE); //����  9

		calendar.set(Calendar.DAY_OF_MONTH, 1); // ����4��1�� ʾһ�����е�ĳ��

		int dow = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println("��\tһ\t��\t��\t��\t��\t��\t");
		for (int i = 0; i < dow - 1; i++) {
			System.out.print("\t");
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i <= maxDate; i++) {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				if (i == week) {
					stringBuilder.append(i + "*" + "\r");
				} else {
					stringBuilder.append(i + "\r");
				}
			} else {
				if (i == week) {
					stringBuilder.append(i + "*" + "\t");
				} else {
					stringBuilder.append(i + "\t");
				}
			}
			// ���ڼ�1
			calendar.add(Calendar.DATE, 1);
		}
		System.out.print(stringBuilder.toString());

	}

}
