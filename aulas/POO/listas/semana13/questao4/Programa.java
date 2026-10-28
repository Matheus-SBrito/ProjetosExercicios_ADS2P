package aulas.POO.listas.semana13.questao4;

public class Programa {

	public static void main(String[] args) {
		 for (int a = 0; a < 10; ++a) {
	            try {
	                if (a % 3 == 0)
	                    throw new Exception("Except1");

	                try {
	                    if (a % 3 == 1)
	                        throw new Exception("Except2");

	                    System.out.println(a);
	                } catch (Exception inside) {
	                    a *= 2;
	                } finally {
	                    ++a;
	                }

	            } catch (Exception outside) {
	                a += 3;
	            } finally {
	                ++a;
	            }
	        }
	}
}
