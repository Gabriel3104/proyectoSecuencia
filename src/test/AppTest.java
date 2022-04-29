package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    

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
    public void cuando_recibe_tecla_aa_debe_retornar_22(){

        String resultado = calcularSecuencia("AA");

        assertEquals("22", resultado);
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
    
        for(int y = 0; y<splitFrase.length; y++){
            
            for( int i=0; i<caracteres.length; i++ ){
            
                String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
                
                System.out.println(); //para hacer espacio

                for( int x=0; x<teclas.length; x++ ){
                    
                    if( teclas[x].equals(splitFrase[y]) ){
                        System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                        
                        for (int p=0; p<=x; p++){
                            
                            if(splitFrase[y].equals(" ")){
                                posicion = posicion + i;

                            }else{
                                posicion = posicion + (i+1);
                            }
                        }  
                    }

                    System.out.println(teclas[x]);
                }

            }
        }

        return posicion;
    }
}



