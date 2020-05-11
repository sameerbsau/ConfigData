package com.merilytics.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

	public static boolean twoStringComparision(Object obj1, Object obj2) {
		try {
			return obj1.toString().equalsIgnoreCase(obj2.toString());
		} catch (Exception e) {
			return false;
		}

	}
	
	

	public static void test() {

	}

	public static Integer objectToInteger(Object obj1) {
		try {
			return new Integer(obj1.toString());
		} catch (Exception e) {
			return null;
		}
	}

	public static BigDecimal objectToBigDecimal(Object obj1) {
		try {
			return new BigDecimal(obj1.toString());
		} catch (Exception e) {
			return null;
		}
	}

	public static String objectToString(Object obj1) {
		try {
			return obj1.toString();
		} catch (Exception e) {
			return null;
		}
	}

	public static Double objectToDouble(Object obj1) {
		try {
			return new Double(obj1.toString());
		} catch (Exception e) {
			return null;
		}
	}

	public static Long objectToLong(Object obj1) {
		try {
			return new Long(obj1.toString());
		} catch (Exception e) {
			return null;
		}
	}

	public static Timestamp longToTimestamp(Object obj1) {

		Long l = objectToLong(obj1);

		try {

			return new Timestamp(l);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public static Float objectToFloat(Object obj1) {
		try {
			return new Float(obj1.toString());
		} catch (Exception e) {
			return null;
		}
	}

	public static BigInteger objectToBigInteger(Object obj1) {
		try {
			return new BigInteger(obj1.toString());
		} catch (Exception e) {
			return null;
		}
	}

	public static Timestamp objectToTimestamp(Object obj1) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

		try {
			Date dt = formatter.parse(obj1.toString());

			return new Timestamp(dt.getTime());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public static Timestamp objectToTimestamp1(Object obj1) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date dt = formatter.parse(obj1.toString());

			return new Timestamp(dt.getTime());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public static java.sql.Date convertJavaDateToSqlDate(java.util.Date date)

	{
		return new java.sql.Date(date.getTime());
	}

	public static long convertDateToMilliSecondDate(Date date) throws ParseException

	{
		return date.getTime();
	}

}
