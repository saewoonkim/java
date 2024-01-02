package ch10;

import java.text.DecimalFormat;

public class Ex10_6 {

	public static void main(String[] args) {
		double number = 1234567.89;
		String[]pattern = {
				"0",
				"#",
				"0.0",
				"#.#",
				"000000000.0000",
				"#########.####",
				"#.#-",
				"-#.#",
				"#,###.##",
				"#e0",
				"0E0",
				"##E0",
				"00E0",
				"####E0",
				"#.#E0",
				"0.0E0",
				"0.000000E0",
				"00.00000E0",
				"000.0000E0",
				"#.######E0",
				"##.#####E0",
				"###.####E0",
				"#,###.##+;#,###.##-",
				"#.#%",
				"#.#\u2030",
				"\u00a4 #, ###",
				"'#'#,###",
				"''#,###",
				
		};
		for (int i=0; i <pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s\n", pattern[i], df.format(number));
			
		}
	}

}
