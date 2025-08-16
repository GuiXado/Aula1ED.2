import javax.swing.JOptionPane;

public class Lista1_Ativ2 {

	public static void main(String[] args) {
		int[] vet = {1, 2, 3, 7, 9};
		int menor = vet[4]; // recebe a última posição como sendo a menor
		int a = rec(vet, 4,  menor);
		JOptionPane.showMessageDialog(null, "O menor valor do vetor é: " + a);
	}
	
	public static int rec(int[] vet, int tamanho, int menor) {
		 /* Condição de parada foi determinada quando o "tamanho" do vetor for menor que zero, 
		  * significa que já percorreu todo o vetor e fez a substituição pelo menor.*/
		if(tamanho < 0) {
			return menor;
			
		/* Precisei de dois passos, um para verificar se a proxima posição é menor e fazer a 
		 * substituição e retornar para a recursiva. */
		} else if (vet[tamanho] < menor){
			menor = vet[tamanho];
			return rec(vet, tamanho - 1, menor);
		// e outra para caso a troca não seja efetuada. 
		} else {
			return rec(vet, tamanho - 1, menor);
		}
	}
}