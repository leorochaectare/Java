package HackerrankAlgorithms;

public class TimeConversion {

	public static String timeConversion(String s) {
		String hours = s.substring(0, 2);

		 if (s.contains("PM") && !s.substring(0, 2).equals("12")) {
			int result = Integer.parseInt(hours) + 12;
			String newHour = String.valueOf(result);
			return s.replace(s.substring(0, 2), newHour).substring(0,8);
		} else if (s.contains("AM") && s.substring(0, 2).equals("12")) {
			String hour = "00";
			return s.replace(s.substring(0, 2), hour).substring(0,8);
		} else {
			return s.substring(0,8);
		}

	}

	public static void main(String[] args) {
		String horario = "12:45:45PM";

		System.out.println(timeConversion(horario));
	}
}
