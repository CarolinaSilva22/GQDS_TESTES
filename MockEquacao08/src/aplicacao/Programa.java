package aplicacao;

import entidade.ServicoEquacaoSegundoGrau;
import entidade.EquacaoSegundoGrauInterface;
import org.mockito.Mockito;

public class Programa {

    public static void main(String[] args) {
     
        EquacaoSegundoGrauInterface mockEquacao = Mockito.mock(EquacaoSegundoGrauInterface.class);

     
        Mockito.when(mockEquacao.getDelta()).thenReturn(25.0); // Exemplo de valor de delta
        Mockito.when(mockEquacao.getX()).thenReturn(5.0);     // Exemplo de valor de x
        Mockito.when(mockEquacao.getX1()).thenReturn(2.0);    // Exemplo de valor de x1
        Mockito.when(mockEquacao.getX2()).thenReturn(3.0);    // Exemplo de valor de x2

      
        ServicoEquacaoSegundoGrau servicoEquacao = new ServicoEquacaoSegundoGrau();
        servicoEquacao.setEquacao(mockEquacao);

       
        System.out.println("Delta: " + servicoEquacao.delta());
        System.out.println("X: " + servicoEquacao.x());
        System.out.println("X1: " + servicoEquacao.x1());
        System.out.println("X2: " + servicoEquacao.x2());
    }
}
