package MediaAlunos;

import javax.swing.JOptionPane;

public class CalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aqui digitamos as notas dos alunos:
				float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
				float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
				float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));

				
				float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
				
				String resultado;
				if(media >= 7) {
					resultado = " O aluno foi aprovado!";
				} else if (media >= 4) {
					resultado = " O aluno está de recuperação!";
				} else {
					resultado = "O aluno foi reprovado ";
				}
		        		  
				 JOptionPane.showMessageDialog(null,"A Média do aluno foi: " + media + "." + resultado);
		 		}
			}

		
