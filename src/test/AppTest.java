package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.SpringLayout;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void cuando_recibe_tecla_espacio_debe_retornar_0(){
        
        String resultado = calcularSecuencia(" ");

        assertEquals("0", resultado);
    }
    
    
    @Test
    public void cuando_recibe_tecla_a_debe_retornar_2(){

        String resultado = calcularSecuencia("A");

        assertEquals("2", resultado);
    }

    @Test
    public void cuando_recibe_tecla_d_debe_retornar_3(){

        String resultado = calcularSecuencia("D");

        assertEquals("3", resultado);
    }

    @Test
    public void cuando_recibe_tecla_g_debe_retornar_4(){

        String resultado = calcularSecuencia("G");

        assertEquals("4", resultado);
    }

    @Test
    public void cuando_recibe_tecla_j_debe_retornar_5(){

        String resultado = calcularSecuencia("J");

        assertEquals("5", resultado);
    }

    @Test
    public void cuando_recibe_tecla_m_debe_retornar_6(){

        String resultado = calcularSecuencia("M");

        assertEquals("6", resultado);
    }

    @Test
    public void cuando_recibe_tecla_p_debe_retornar_7(){

        String resultado = calcularSecuencia("P");

        assertEquals("7", resultado);
    }

    @Test
    public void cuando_recibe_tecla_t_debe_retornar_8(){

        String resultado = calcularSecuencia("T");

        assertEquals("8", resultado);
    }

    @Test
    public void cuando_recibe_tecla_w_debe_retornar_9(){

        String resultado = calcularSecuencia("W");

        assertEquals("9", resultado);
    }

    @Test
    public void cuando_recibe_aa_debe_retornar_2_2(){

        String resultado = calcularSecuencia("AA");

        assertEquals("2 2", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_HI_debe_retornar_44_444(){

        String resultado = calcularSecuencia("HI");

        assertEquals("44 444", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_YES_debe_retornar_999337777(){

        String resultado = calcularSecuencia("YES");

        assertEquals("999337777", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_FOO_BAR_debe_retornar_333666_666022_2777(){

        String resultado = calcularSecuencia("FOO BAR");

        assertEquals("333666 666022 2777", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_HELLO_WORLD_debe_retornar_4433555_555666096667775553(){

        String resultado = calcularSecuencia("HELLO WORLD");

        assertEquals("4433555 555666096667775553", resultado);
    }
    
    public String calcularSecuencia(String frase){
        
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


        String splitFrase[] = frase.split("");
        String posicion="";
    
        for(int indiceDeFrase = 0; indiceDeFrase<splitFrase.length; indiceDeFrase++){
            
            for( int indiceDeCaracteres=0; indiceDeCaracteres<caracteres.length; indiceDeCaracteres++ ){
            
                String teclas[] = caracteres[indiceDeCaracteres].split(","); //me guarda cada letra en un vector
                
                List <String> listTeclas = Arrays.asList(teclas);

                System.out.println(); //para hacer espacio

                for( int indiceDeTeclas=0; indiceDeTeclas<teclas.length; indiceDeTeclas++ ){
                    
                    if( teclas[indiceDeTeclas].equals(splitFrase[indiceDeFrase]) ){ //BUSCA COINCIDENCIA DE TECLA CON FRASE
                        System.out.println("La tecla " + teclas[indiceDeTeclas] + " se encuentra en la tecla " + (indiceDeCaracteres+1));
                        

                        if(splitFrase[indiceDeFrase].equals(" ")){
                            posicion = posicion + indiceDeCaracteres;
                        }
                        else if ((indiceDeFrase+1)<splitFrase.length){
                            
                            for(int p=0; p<=indiceDeTeclas; p++){
                               posicion = posicion + (indiceDeCaracteres + 1);
                            }
                            

                            if (listTeclas.contains(splitFrase[indiceDeFrase + 1])){
                                posicion = posicion + " ";
                            }
                        }

                        else{

                            for(int p=0; p<=indiceDeTeclas; p++){
                                posicion = posicion + (indiceDeCaracteres + 1);
                            }
                        }
                        
                    }

                    System.out.println(teclas[indiceDeTeclas]);
                }
                

            }
        }

        return posicion;
    }
}



