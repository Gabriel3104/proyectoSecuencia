package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void cuando_recibe_tecla_a_debe_retornar_2(){

        String caracteres [] = new String [9];

        caracteres[0] = " ";
        caracteres[1] = "A,B,C";
        caracteres[2] = "D,E,F";
        caracteres[3] = "G,H,I";
        caracteres[4] = "J,K,L";
        caracteres[5] = "M,N,O";
        caracteres[6] = "P,Q,R,S";
        caracteres[7] = "T,U,V";
        caracteres[8] = "W,X,Y,Z";

        String frase = "A";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(2, posicion);
    }

  
}


