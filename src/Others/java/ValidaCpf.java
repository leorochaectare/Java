package Others.java;

public class ValidaCpf {

	public static boolean valida_cpf(String cpf) {

		String cpf_formatado = cpf.replaceAll("[^0-9]", "");

		if (cpf_formatado.length() != 11) {
			return false;
		} else {
			int sum_digito_1 = 0;
			int resto_digito_1 = 0;

			for (int i = 0; i < cpf_formatado.length() - 2; i++) {
				sum_digito_1 += Character.getNumericValue(cpf_formatado.charAt(i)) * (i + 1);
				// System.out.println(sum_digito_1);
			}

			resto_digito_1 = sum_digito_1 % 11;
			// System.out.println("Sum dígito 1: " + sum_digito_1);
			// System.out.println("Resto dígito 1: " + resto_digito_1);

			if (resto_digito_1 == 10) {
				resto_digito_1 = 0;
			}

			int sum_digito_2 = 0;
			int resto_digito_2 = 0;

			for (int j = 0; j < cpf_formatado.length() - 1; j++) {
				sum_digito_2 += Character.getNumericValue(cpf_formatado.charAt(j)) * j;
			}

			// System.out.println("Qual o resultado");
			// System.out.println(resto_digito_2 == 10);

			resto_digito_2 = sum_digito_2 % 11;
			// System.out.println("Sum dígito 2: " + sum_digito_2);
			// System.out.println("Resto dígito 2: " + resto_digito_2);

			if (resto_digito_2 == 10) {
				resto_digito_2 = 0;
			}

			int digito_9 = Character.getNumericValue(cpf_formatado.charAt(9));
			int digito_10 = Character.getNumericValue(cpf_formatado.charAt(10));

			// System.out.println(digito_9);
			// System.out.println(resto_digito_1);

			if (cpf_formatado == "00000000000" ||
					cpf_formatado == "11111111111" ||
					cpf_formatado == "22222222222" ||
					cpf_formatado == "33333333333" ||
					cpf_formatado == "44444444444" ||
					cpf_formatado == "55555555555" ||
					cpf_formatado == "66666666666" ||
					cpf_formatado == "77777777777" ||
					cpf_formatado == "88888888888" ||
					cpf_formatado == "99999999999")
				return false;

			if (digito_9 == resto_digito_1 && digito_10 == resto_digito_2) {
				return true;
			}

			return false;

		}
	}

	public static void main(String[] args) {

		// System.out.println(valida_cpf("952.324.690-96"));
		// System.out.println(valida_cpf("762.947.030-42"));
		// System.out.println(valida_cpf("750.149.660-98"));
		// System.out.println(valida_cpf("685.455.210-90"));
		// System.out.println(valida_cpf("034.823.100-84"));
		// System.out.println(valida_cpf("675.506.140-91"));
		// System.out.println(valida_cpf("926.100.960-38"));
		// System.out.println(valida_cpf("912.417.970-13"));
		// System.out.println(valida_cpf("191.322.280-23"));
		// System.out.println(valida_cpf("057.162.410-34"));

		System.out.println(valida_cpf("00000000000"));
	}
}
