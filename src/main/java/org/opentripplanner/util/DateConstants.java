package org.opentripplanner.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateConstants {
	String[] DF_LIST = new String[]{"yyyy.MM.dd.HH.mm.ss", "yyyy.MM.dd.HH.mm", "yyyy.MM.dd.HH.mm.ss.SS", "M.d.yy h.mm a", "M.d.yyyy h.mm a", "M.d.yyyy h.mma", "M.d.yyyy h.mm", "M.d.yyyy k.mm", "M.d.yyyy", "yyyy.M.d", "h.mm a"};
	String[] SMALL_DF_LIST = new String[]{"M.d.yy", "yy.M.d", "h.mm a"};
	String ISO_DATETIME_TIME_ZONE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZZ";
	Long ONE_WEEK_MILLI = 604800000L;
	Long ONE_DAY_MILLI = 86400000L;
	Long ONE_HOUR_MILLI = 3600000L;
	Long ONE_MINUTE_MILLI = 60000L;
	Long THIRTY_SECOND_MILLI = 30000L;
	Long ONE_SECOND_MILLI = 1000L;
	Long TEN_MINUTES_MILLI = ONE_MINUTE_MILLI * 10L;
	Long THIRTY_MINUTES_MILLI = ONE_MINUTE_MILLI * 30L;
	Long FORTY_5_MINUTES_MILLI = ONE_MINUTE_MILLI * 45L;
	Long TWELVE_HOUR_MILLI = ONE_HOUR_MILLI * 12L;
	Integer ONE_DAY_SECONDS = 86400;
	Date NOW = new Date();
	Date NEXT_WEEK = new Date(NOW.getTime() + ONE_WEEK_MILLI);
	Date NEXT_MONTH = new Date(NOW.getTime() + ONE_WEEK_MILLI * 4L + ONE_DAY_MILLI * 2L);
	String SIMPLE_TIME_FORMAT = "h:mm a";
	String TIME_FORMAT = "hh:mm:ss a";
	String DATE_FORMAT = "MM-dd-yyyy";
	String DATE_TIME_FORMAT = "M.d.yy_k.m";
	String DATE_TIME_FORMAT_NICE = "MM.dd.yyyy 'at' h:mm:a z";
	String PRETTY_DATE_FORMAT = "MMMM d, yyyy";
	String PRETTY_DT_FORMAT = "MMMM d, yyyy 'at' h:mm a z";
	String DT_FORMAT = "M.d.yyyy h:mm a";
	SimpleDateFormat dateSDF = new SimpleDateFormat("MM-dd-yyyy");
	SimpleDateFormat timeSDF = new SimpleDateFormat("hh:mm:ss a");
	SimpleDateFormat simpTimeSDF = new SimpleDateFormat("h:mm a");
	SimpleDateFormat dateTimeSDF = new SimpleDateFormat("M.d.yy_k.m");
	SimpleDateFormat PRETTY_DATE = new SimpleDateFormat("MMMM d, yyyy");
	SimpleDateFormat PRETTY_DT = new SimpleDateFormat("MMMM d, yyyy 'at' h:mm a z");
	SimpleDateFormat YEAR = new SimpleDateFormat("yyyy");
	SimpleDateFormat dowSDF = new SimpleDateFormat("E");
	SimpleDateFormat standardDateSDF = new SimpleDateFormat("M-d-yyyy");
	String DATE = "date";
	String EFFECTIVE_DATE = "effectiveDate";
	String TODAY = "today";
	String TIME = "time";
	String HOUR = "Hour";
	String MINUTE = "Minute";
	String AM_PM = "AmPm";
	String MONTH = "Month";
	String DAY = "Day";
	String WEEK = "week";
	String SAT = "sat";
	String SUN = "sun";
	String AM = "am";
	String PM = "pm";
}
